package com.example;

import org.jpos.core.Configuration;
import org.jpos.q2.QBeanSupport;
import org.jpos.space.Space;
import org.jpos.space.SpaceFactory;
import org.jpos.space.SpaceUtil;

public class LogonManager extends QBeanSupport {

	@Override
	public void initService() throws Exception {
		Configuration cfg = getConfiguration();
		Space sp = SpaceFactory.getSpace(cfg.get("tno","je:sequencers:log/raft"));
		long traceNumber = SpaceUtil.nextLong(sp,"TRACE_KEY")% 1000000L;
		System.out.println("traceNumber "+traceNumber);

	}

}

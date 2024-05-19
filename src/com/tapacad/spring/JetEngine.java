package com.tapacad.spring;

@Component("jetEngine")
public class JetEngine implements Engine {

	@Override
	public String getEngineDetail() {
		return "Jet Engine is amazing";
	}

}

package com.tapacad.spring;

@Component("rocketEngine")
public class RocketEngine implements Engine{

	@Override
	public String getEngineDetail() {
		return "RocketEngine gives good performance";
		
	}

	
}

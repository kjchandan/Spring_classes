package com.tapacad.spring;

@Component("nano")
public class Nano implements Car {
	
//Class  Object reference
	private Engine engine;
	
	
//Constructor Injection
	@Autowired
	public Nano(@Qualifier("rocketEngine") Engine engine) {
		super();
		this.engine = engine;
	}

	@Override
	public String getCarDetails() {
		
		return "Nano";
	}

	@Override
	public String getEngineDetail() {
		
		return engine.getEngineDetail();
	}

}

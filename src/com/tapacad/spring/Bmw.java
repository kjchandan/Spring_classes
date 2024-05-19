package com.tapacad.spring;

//Prototype scope => For separate Bean, Separate Object creation.
@Scope("prototype")
@Component("bmw")
public class Bmw implements Car {
	
//Class  Object reference
	
	private Engine engine;
	
	
//Constructor Injection
	@Autowired
	public Bmw(@Qualifier("jetEngine") Engine engine) {
		super();
		this.engine = engine;
	}

	@Override
	public String getCarDetails() {
		return "BMW";
	}

	@Override
	public String getEngineDetail() {
		
		return engine.getEngineDetail(); 
		
	}
	
}

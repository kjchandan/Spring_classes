package com.tapacad.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("audi")
public class Audi implements Car {

//Class  object reference 
//Attribbutes
//Field Injection
	@Autowired
	@Qualifier("rocketEngine")
	private Engine engine;
	private String color;
	private float price;
	
	
	@Override
	public String getCarDetails() {
		return "Audi";
	}

	@Override
	public String getEngineDetail() {
		return engine.getEngineDetail();
	}

	public Engine getEngine() {
		return engine;
	}
	
//Setter/Method Injection
	@Autowired
	public void setEngine(@Qualifier("jetEngine") Engine engine) {
		this.engine = engine;
	}

	public String getColor() {
		return color;
	}
//@Value=> Add value
	@Value("${color}")
	public void setColor(String color) {
		this.color = color;
	}

	public float getPrice() {
		return price;
	}
//@Value=> Add value
	@Value("${price}")
	public void setPrice(float price) {
		this.price = price;
	}
	
//Custom init()
	@PostConstruct
	void myStartUp() {
		System.out.println("Bean created");
	}
	
//destroy()
	@PreDestroy
	void myClosing() {
		System.out.println("Bean Destroyed");
	}
	
//default-init-method
	void fun1() {
		System.out.println("Default Init() called");
	}
	
//default-destroy-method
	void fun2() {
		System.out.println("Default destroy() called");
	}
	
	
	
	
	
}

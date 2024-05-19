package com.tapacad.spring;

public class MyApp8a {
	public static void main() {

//Load application context
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);
				
				
				
//Get bean
		Car car = context.getBean("bmw", Car.class); 
				
				
//Call getDetails
		System.out.println(car.getCarDetails());
		System.out.println(car.getEngineDetail());
				
				
//close context object
		context.close();
				
		
	}
}

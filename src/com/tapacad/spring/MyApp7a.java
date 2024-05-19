package com.tapacad.spring;

public class MyApp7a {
	public static void main() {
	
//Load application context
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationapplicationContext.xml");
		
		
		
//		Get bean
		 Car car = context.getBean("bmw", Car.class); 
		
		
//		Call getDetails
		 System.out.println(car.getCarDetails());
		
		
		
//		close context object
		 context.close();
		
		
	}
}

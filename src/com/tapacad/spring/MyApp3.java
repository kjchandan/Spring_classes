package com.tapacad.spring;

public class MyApp3 {
	public static void main(String args[]) {
		
//		Load application context
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		
//		Get bean
		 Car car = context.getBean("bmw"); //Bean id ="bmw" in (applicationcontext.xml) file.
		
		
//		Call getDetails
		 System.out.println(car.getCarDetails());
		 System.out.println(car.getEngineDetail());
		
		
//		close context object
		 context.close();
		
	}

}
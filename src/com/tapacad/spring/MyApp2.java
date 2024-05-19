package com.tapacad.spring;



public class MyApp2 {
	
	public static void main() {
		
//		Load application context
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		
//		Get bean
		 Car car = context.getBean("bmw"); //Bean id ="bmw" in (applicationcontext.xml) file.
		
		
//		Call getDetails
		 System.out.println(car.getCarDetails());
		
		
		
//		close context object
		 context.close();
		
	}

}

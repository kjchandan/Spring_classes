package com.tapacad.spring;

public class MyApp4 {
	public static void main(String args[]) {
		
//		Load application context
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		
//		Get bean
		 Car car = context.getBean("audi"); //Bean id ="audi" in (applicationcontext.xml) file.
		
		
//		Call getDetails
		 System.out.println(car.getCar Details());
		 System.out.println(car.getEngineDetail());
		 System.out.println(car.getColor());
		 System.out.println(car.getPrice());
		
//		close context object
		 context.close();
		
	}

}
package com.tapacad.spring;

public class MyApp5 {
	public static void main(String args[]) {
		
//		Load application context
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		
//		Get bean
		 Car car1 = context.getBean("audi"); //Bean id ="audi" in (applicationcontext.xml) file.
		 Car car2 = context.getBean("audi");
		
//		Call getDetails()
		 System.out. println(car1);
		 System.out.println(car2);
		 
		
//		close context object
		 context.close();
		
	}

}
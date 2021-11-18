package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //load the spring configure file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean form container
		Coach theCoach=context.getBean("myCoach",Coach.class);
		// call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		//call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		//clean the context
		context.close();
		

	}}

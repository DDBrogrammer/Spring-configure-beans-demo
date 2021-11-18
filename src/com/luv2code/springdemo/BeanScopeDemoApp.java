package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	
public static void main(String[] args) {
	// load the spring configuration file
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
	
	// retrieve bean from spring container
	Coach theCoach=context.getBean("myCoach",Coach.class);
	
	Coach theACoach=context.getBean("myCoach",Coach.class);
	
	boolean result=(theCoach==theACoach);
	System.out.println(result);
	System.out.println(theACoach);
	System.out.println(theCoach);
}



}

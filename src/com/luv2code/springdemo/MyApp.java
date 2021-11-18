package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // create the object
		BaseballCoach theCoach=new BaseballCoach();
		// interface use
		Coach theInterfaceCoach=new BaseballCoach();
		// another object to see polymorphism
		Coach theOtherCoach=new TrackCoach();
	    System.out.println(theCoach.getDailyWorkout()+" = "+theInterfaceCoach.getDailyWorkout());	
		System.out.println(theOtherCoach.getDailyWorkout());
	}

}

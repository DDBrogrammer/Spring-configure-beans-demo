package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	// define a private field for the dependency
	private FortuneService fortuneService;
	// define a constructor for dependency injection 
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	public BaseballCoach() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getDailyWorkout() {
		return "run now";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}

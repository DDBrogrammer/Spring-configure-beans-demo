package com.luv2code.springdemo;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;
    private String emailAddress;
    private String team;
    
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		System.out.println("set method email");
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
		System.out.println("set method team");
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "do today cricket";
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("set method");
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
   // create a no-arg constructor 
	public CricketCoach() {
		System.out.println("CricketCoach:  inside no-arg constructor");
	}
  
}

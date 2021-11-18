package com.luv2code.springdemo;

public class TrackCoach implements Coach {
   private FortuneService fortuneService;
   public TrackCoach(FortuneService fortuneService) {
	   this.fortuneService=fortuneService;
   }
	public TrackCoach() {
	// TODO Auto-generated constructor stub
}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Track coach work out";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "new ok"+fortuneService.getFortune();
	}

}

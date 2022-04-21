package spring.course;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}


	//ad init method

	public void doMyStartStuff(){
		System.out.println("TrackCoach : inside method doMyStartStuff");

	}

	public  void  doMyClaenStuff(){
		System.out.println("Tracking:  inside method doMyClaenStuff");
	}

	//add destroy method

}











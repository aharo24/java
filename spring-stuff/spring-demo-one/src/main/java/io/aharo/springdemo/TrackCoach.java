package io.aharo.springdemo;

public class TrackCoach implements Coach
{
    private FortuneService fortuneService;

    

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    public TrackCoach(){}

    @Override
    public String getDailyWorkout()
    {
        return "Spend 5 hours running";
    
    }

    @Override
    public String getDailyFortune() 
    {
        return "Just do it:" + fortuneService.getFortune();
    }

    // add an init method
    public void doMyStartupStuff()
    {
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }

    // add a destroy method 
    public void doMyCleanupStuffYoYo()
    {
        System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
    }


}

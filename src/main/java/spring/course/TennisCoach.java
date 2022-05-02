package spring.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component

public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("inside default");
    }

    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println(">>TennisCoach: inside of doMyStartupStuff");
    }
    @PreDestroy
    public void doMyCleanStuff(){
        System.out.println(">>TennisCoach: inside of doMyCleanStuff");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice you backend volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}

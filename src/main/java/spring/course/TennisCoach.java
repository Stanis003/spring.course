package spring.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("inside default");
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

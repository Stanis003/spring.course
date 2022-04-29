package spring.course;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{

    private  String[] data = {
            "Clothong",
            "Diligence",
            "Reward"
    };

   private  Random myrandom = new Random();


    @Override
    public String getFortune() {

        int index =  myrandom.nextInt(data.length);
        String  theFortune = data[index];

        return theFortune;
    }
}

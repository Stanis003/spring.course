package spring.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return null;
    }
}

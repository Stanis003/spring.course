package spring.course;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {

        //read spring config
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(SportConfig.class);
        //get bean
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        //call method
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());
        //close
        context.close();


    }
}

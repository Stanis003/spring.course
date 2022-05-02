package spring.course;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {

        //read spring config
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(SportConfig.class);
        //get bean
        Coach theCoach = context.getBean("swimCoach", Coach.class);

        //call method
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());
        //close
        context.close();


    }
}

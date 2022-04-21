package spring.course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansLifeCycleDemoApp {

    public static void main(String[] args) {

        //load conf/ file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        context.close();

    }
}

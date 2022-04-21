package spring.course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansScopeDemoApp {

    public static void main(String[] args) {

        //load conf/ file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        boolean result = (theCoach == alphaCoach);

        System.out.println(result);

        context.close();

    }
}

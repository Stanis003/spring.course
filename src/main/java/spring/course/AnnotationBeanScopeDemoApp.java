package spring.course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        boolean result = (theCoach==alphaCoach);

        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemmore location for the Coach: " + theCoach);
        System.out.println("\nMemmore location for the Coach: " + alphaCoach);
        context.close();

    }
}

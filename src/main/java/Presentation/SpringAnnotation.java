package Presentation;

import metier.IGestion;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("dao","metier");
        IGestion gestion = context.getBean("gestion", IGestion.class);
        System.out.println(gestion.calcul());
    }
}

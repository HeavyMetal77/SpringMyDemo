package ua.tarastom.configjava;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAppConfigAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);

        FootballCoach coach = context.getBean("myFootball", FootballCoach.class);

        System.out.println(coach.getTrainee());
        System.out.println(coach.getFortune());
        System.out.println(coach.getNameCoach());

        context.close();
    }
}

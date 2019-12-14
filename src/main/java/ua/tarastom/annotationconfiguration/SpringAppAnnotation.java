package ua.tarastom.annotationconfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aplicationContextAnnotation.xml");

        FootballCoach coach = context.getBean("myFootball", FootballCoach.class);

        System.out.println(coach.getTrainee());
        System.out.println(coach.getFortune());
        System.out.println(coach.getNameCoach());

        context.close();
    }
}

package ua.tarastom.xmlconfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aplicationContext.xml");
        Coach coach = context.getBean("myBaseball", Coach.class);
        Coach coach1 = context.getBean("myTennis", Coach.class);
        FootballCoach coach2 = context.getBean("myFootball", FootballCoach.class);
        FootballCoach coach3 = context.getBean("myFootball", FootballCoach.class);


        System.out.println(coach.getTrainee());
        System.out.println(coach.getFortune());

        System.out.println(coach1.getTrainee());
        System.out.println(coach1.getFortune());

        System.out.println(coach2.getTrainee());
        System.out.println(coach2.getFortune());
        System.out.println(coach2.getNameCoach());

        System.out.println(coach2.toString());
        System.out.println(coach3.toString());

        context.close();
    }
}

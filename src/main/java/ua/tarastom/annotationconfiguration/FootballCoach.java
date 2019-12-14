package ua.tarastom.annotationconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("myFootball")
@Scope("singleton")
public class FootballCoach implements Coach {
    @Autowired
    private FortuneService fortuneService;
    private String nameCoach;

    public String getTrainee() {
        return "Footbal";
    }

    public String getFortune() {
        return fortuneService.getFortune();
    }

    public String getNameCoach() {
        return nameCoach;
    }

    @Value("${sportTrainee.name}")
    public void setNameCoach(String nameCoach) {
        this.nameCoach = nameCoach;
    }

    @PostConstruct
    private void doMyInitStuff() {
        System.out.println("Init method");
    }

    @PreDestroy
    private void doMyDestroyStuff() {
        System.out.println("Destroy method");
    }
}

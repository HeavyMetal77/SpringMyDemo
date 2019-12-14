package ua.tarastom.xmlconfiguration;

public class BaseballCoach implements Coach {
    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getTrainee() {
        return "Baseball";
    }

    public String getFortune() {
        return fortuneService.getFortune();
    }
}

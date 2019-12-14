package ua.tarastom.xmlconfiguration;

public class TennisCoach implements Coach {
    private FortuneService fortuneService;

    public String getTrainee() {
        return "Tennis";
    }

    public String getFortune() {
        return fortuneService.getFortune();
    }

    public void setMyFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}

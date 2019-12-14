package ua.tarastom.xmlconfiguration;

public class FootballCoach implements Coach {
    private FortuneService fortuneService;
    private String nameCoach;

    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("Into constructor");
    }

    public String getTrainee() {
        return "Footbal";
    }

    public String getFortune() {
        return fortuneService.getFortune();
    }

    public String getNameCoach() {
        return nameCoach;
    }

    public void setNameCoach(String nameCoach) {
        this.nameCoach = nameCoach;
    }

    private void doMyInitStuff() {
        System.out.println("Init method");
    }

    private void doMyDestroyStuff() {
        System.out.println("Destroy method");
    }
}

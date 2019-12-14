package ua.tarastom.annotationconfiguration;

import org.springframework.stereotype.Component;
import ua.tarastom.xmlconfiguration.FortuneService;
@Component
public class LuckyFortuneService implements  FortuneService{
    public String getFortune() {
        return "Today is Lucky day!";
    }
}

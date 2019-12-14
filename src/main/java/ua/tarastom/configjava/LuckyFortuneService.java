package ua.tarastom.configjava;

import org.springframework.stereotype.Component;
import ua.tarastom.xmlconfiguration.FortuneService;

@Component
public class LuckyFortuneService implements  FortuneServiceConfig{
    public String getFortune() {
        return "Today is New Lucky day!";
    }
}

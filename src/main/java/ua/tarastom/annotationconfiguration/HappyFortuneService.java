package ua.tarastom.annotationconfiguration;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    public String getFortune() {
        return "Today is Happy day!";
    }
}

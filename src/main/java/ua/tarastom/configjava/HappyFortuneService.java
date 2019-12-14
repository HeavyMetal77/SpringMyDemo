package ua.tarastom.configjava;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneServiceConfig {

    public String getFortune() {
        return "Today is New Happy day!";
    }
}

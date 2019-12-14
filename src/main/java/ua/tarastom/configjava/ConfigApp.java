package ua.tarastom.configjava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ua.tarastom.configjava")
@PropertySource("classpath:sport.properties")
public class ConfigApp {

    @Bean
    public LuckyFortuneService luckyFortuneService() {
        System.out.println("!!!!!!!!!!!!!");
        return new LuckyFortuneService();
    }

    @Bean
    public HappyFortuneService happyFortuneService() {
        System.out.println("???????");
        return new HappyFortuneService();
    }


}

package com.ziemsky.aws.ecs.app;

import com.ziemsky.aws.ecs.web.MainController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
public class AppConfig {

    @Bean
    public MainController mainController() {
        return new MainController();
    }
}

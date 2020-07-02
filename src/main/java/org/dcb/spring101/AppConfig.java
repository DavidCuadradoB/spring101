package org.dcb.spring101;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public String getString() {
        return "I'm the first bean";
    }
}

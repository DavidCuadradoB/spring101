package org.dcb.spring101;

import org.dcb.spring101.service.BestService;
import org.dcb.spring101.service.impl.FirstBestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public String getString() {
        return "I'm the first bean";
    }

    @Bean
    public BestService getBestService() {
        return new FirstBestService();
    }

}

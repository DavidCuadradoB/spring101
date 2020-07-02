package org.dcb.spring101;

import org.dcb.spring101.service.BestService;
import org.dcb.spring101.service.impl.FirstBestService;
import org.dcb.spring101.service.impl.SecondBestService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean
    public String getString() {
        return "I'm the first bean";
    }

    @Bean
    @Primary
    @ConditionalOnProperty(
        prefix = "best",
        name = "service",
        havingValue = "first",
        matchIfMissing = true
    )
    public BestService getFirstService() {
        return new FirstBestService();
    }

    @Bean
    @ConditionalOnProperty(
        prefix = "best",
        name = "service",
        havingValue = "second"
    )
    public BestService getSecondService() {
        return new SecondBestService();
    }

}

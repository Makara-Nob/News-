package com.rupp.news.config;

import com.rupp.news.utils.AuditorAwareImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@Configuration
@EnableMongoAuditing
public class AuditConfig {
    @Bean
    public AuditorAware<String> auditorAware() {
        return new AuditorAwareImp();
    }
}

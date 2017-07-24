package com.devopsbuddy.config;

import com.devopsbuddy.backend.service.EmailService;
import com.devopsbuddy.backend.service.SmtpEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("prod")
@PropertySource("file:\\Users\\Sabi\\DropBox\\Accounts_info\\Stripe\\application-prod.properties")
public class ProductionConfig {

    @Bean
    public EmailService emailService() {
        return new SmtpEmailService();
    }
}

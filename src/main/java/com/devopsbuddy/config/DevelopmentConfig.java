package com.devopsbuddy.config;

import com.devopsbuddy.backend.service.EmailService;
import com.devopsbuddy.backend.service.MockEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("dev")
@PropertySource("file:\\Users\\Sabi\\DropBox\\Accounts_info\\Stripe\\application-dev.properties")
//file:\${user.home}\Dropbox\Accounts_info\Stripe
public class DevelopmentConfig {

    @Bean
    public EmailService emailService() {
        return new MockEmailService();
    }
}

package com.devopsbuddy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "com.devopsbuddy.backend.persistence.repositories")
@EnableTransactionManagement
@PropertySource("file:\\Users\\Sabi\\DropBox\\Accounts_info\\Stripe\\application-common.properties")
public class ApplicationProfile {
}

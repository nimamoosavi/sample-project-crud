package com.nicico.cost.integration.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:integration-exception.properties", encoding = "UTF-8", ignoreResourceNotFound = true)
public class IntegrationConfig {
}

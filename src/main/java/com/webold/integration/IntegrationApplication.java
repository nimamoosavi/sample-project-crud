package com.webold.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.webold.crud", "com.webold.framework", "com.webold.jdbcclient", "com.webold.integration"})
@ServletComponentScan(basePackages = {"com.nicico.cost.crud", "com.nicico.cost.framework", "com.nicico.cost.jdbcclient"})
@EnableJpaRepositories(basePackages = {"com.webold.integration"})
public class IntegrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntegrationApplication.class, args);
    }
}

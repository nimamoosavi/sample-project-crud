package com.nicico.cost.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.nicico.cost.crud","com.nicico.cost.audit","com.nicico.cost.swagger", "com.nicico.cost.framework", "com.nicico.cost.jdbcclient", "com.nicico.cost.integration"})
@ServletComponentScan(basePackages = {"com.nicico.cost.crud","com.nicico.cost.swagger", "com.nicico.cost.framework", "com.nicico.cost.jdbcclient"})
@EnableJpaRepositories(basePackages = {"com.nicico.cost.crud","com.nicico.cost.swagger", "com.nicico.cost.framework", "com.nicico.cost.jdbcclient", "com.nicico.cost.integration"})
public class IntegrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntegrationApplication.class, args);
    }
}

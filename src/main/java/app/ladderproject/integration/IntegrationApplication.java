package app.ladderproject.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"app.ladderproject.crud", "app.ladderproject.core", "app.ladderproject.jdbcclient", "app.ladderproject.integration"})
@ServletComponentScan(basePackages = {"app.ladderproject.crud", "app.ladderproject.core", "app.ladderproject.jdbcclient"})
@EnableJpaRepositories(basePackages = {"app.ladderproject.integration"})
public class IntegrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntegrationApplication.class, args);
    }
}

package app.ladderproject.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * in this project we used that Ladder project libraries that you can know and used that From
 * our GitHub Project
 * this project create for learn how we can use our project in some microservice, and we hope that help us
 * to create faster and change it enjoyable
 * our pleasure to star our main project and fork of that in our GitHub
 * {@link https://github.com/nimamoosavi/core}
 * Thanks a lot
 * @author nima
 */
@SpringBootApplication
@ComponentScan({"app.ladderproject.crud", "app.ladderproject.core", "app.ladderproject.jdbcclient", "app.ladderproject.sample"})
@ServletComponentScan(basePackages = {"app.ladderproject.crud", "app.ladderproject.core", "app.ladderproject.jdbcclient"})
@EnableJpaRepositories(basePackages = {"app.ladderproject.sample"})
public class IntegrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntegrationApplication.class, args);
    }
}

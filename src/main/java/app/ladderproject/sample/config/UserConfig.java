package app.ladderproject.sample.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:sample-exception.properties", encoding = "UTF-8", ignoreResourceNotFound = true)
public class UserConfig {
}

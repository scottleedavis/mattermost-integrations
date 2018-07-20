package io.github.scottleedavis.mattermost.integrations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootApplication(scanBasePackages = {"io.github.scottleedavis.mattermost"})
@EnableJpaRepositories("io.github.scottleedavis.mattermost")
@EntityScan("io.github.scottleedavis.mattermost")
@EnableScheduling
public class MattermostIntegrationsApplication {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(MattermostIntegrationsApplication.class, args);
    }
}



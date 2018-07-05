package io.github.scottleedavis.mattermost.integrations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"io.github.scottleedavis.mattermost"})
@EnableJpaRepositories("io.github.scottleedavis.mattermost")
@EntityScan("io.github.scottleedavis.mattermost")
public class MattermostIntegrationsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MattermostIntegrationsApplication.class, args);
    }
}

package io.github.scottleedavis.mattermost.integrations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"io.github.scottleedavis.mattermost"})
public class MattermostIntegrationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MattermostIntegrationsApplication.class, args);
	}
}

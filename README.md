# mattermost-integrations

### Modules
* [mattermost-remind](https://github.com/scottleedavis/mattermost-remind)
* [mattermost-slashjira](https://github.com/scottleedavis/mattermost-slashjira)

### configuration
[application.properties](./application/src/resources/application.properites)
```aidl
# version=@project.version@
# remind.SlashCommandToken=REMIND_SLASH_COMMAND_TOKEN
# webhookUrl=MM_WEBHO0K_URL
# spring.datasource.username=sa
# spring.datasource.password=
# spring.datasource.url=jdbc:h2:mem:mm-remind
# spring.datasource.driver-class-name=org.h2.Driver
# spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.H2Dialect
jira.slashCommandToken=JIRA_SLASH_COMMAND_TOKEN
jira.username=USERNAME
jira.password=JIRA_USER_PASSWORD
jira.url=JIRA_URL
```

### setup

Install the submodules
```
git submodule init
git submodule update --remote
```

### build
* Build: [Maven](https://maven.apache.org/download.cgi) & [Java8](http://openjdk.java.net/install/)
  * `./mvnw  package`
* Building for tomcat
  * [Packaging as a .war](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#build-tool-plugins-maven-packaging)
* Build [Docker](https://www.docker.com/) Image (Optional)
  * `./mvnw install dockerfile:build`

### execution
* Running via java
  * `java -jar target/mattermost-remind-#.#.#.jar`
* Running via docker (Optional)
  * Using a locally built version `docker run -p 8080:8080 -t scottleedavis/mattermost-remind`
  * Using [dockerhub latest image](https://hub.docker.com/r/scottleedavis/mattermost-remind/): `docker run scottleedavis/mattermost-remind`


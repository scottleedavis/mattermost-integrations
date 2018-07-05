# mattermost-integrations

### Modules
* ~~[mattermost-remind](https://github.com/scottleedavis/mattermost-remind)~~ __under contruction.   soon completed__
* [mattermost-slashjira](https://github.com/scottleedavis/mattermost-slashjira)

### configuration
[application.properties](./application/src/resources/application.properites)
```aidl
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

### execution
* Running via java
  * `java -jar application/target/mattermost-integrations-#.#.#.jar`

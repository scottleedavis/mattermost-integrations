# mattermost-integrations [![Build Status](https://travis-ci.org/scottleedavis/mattermost-integrations.svg?branch=master)](https://travis-ci.org/scottleedavis/mattermost-integrations) [![codecov](https://codecov.io/gh/scottleedavis/mattermost-integrations/branch/master/graph/badge.svg)](https://codecov.io/gh/scottleedavis/mattermost-integrations) [![Codacy Badge](https://api.codacy.com/project/badge/Grade/90f8ebf1d6fa4e469899a296ede1f467)](https://www.codacy.com/app/scottleedavis/mattermost-integrations?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=scottleedavis/mattermost-integrations&amp;utm_campaign=Badge_Grade)
 

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
* ~~Build [Docker](https://www.docker.com/) Image (Optional)~~
  * ~~`./mvnw install dockerfile:build`~~

### execution
* Running via java
  * `java -jar application/target/mattermost-integrations-app-#.#.#.jar`
* ~~Running via docker (Optional)~~
  * ~~Using a locally built version `docker run -p 8080:8080 -t scottleedavis/mattermost-integrations`~~
  * ~~Using [dockerhub latest image](https://hub.docker.com/r/scottleedavis/mattermost-integrations/): `docker run scottleedavis/mattermost-integrations`~~


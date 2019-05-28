# spring-cloud-contract-poc
A POC to review the concept about Spring Cloud Contract

| Id | Project Name                                | CI Status                                                                                                                                                                                 | Description                                                     | Repository                                                             |
|----|---------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------|------------------------------------------------------------------------|
| 1  | spring-cloud-contract-git                   | NA                                                                                                                                                                                        | A Git repository to store SCC Contracts for the whole POC       | https://github.com/jabrena/spring-cloud-contract-git                   |
| 2  | spring-cloud-contract-git-producer-poc      | [![Build Status](https://travis-ci.org/jabrena/spring-cloud-contract-git-producer-poc.svg?branch=master)](https://travis-ci.org/jabrena/spring-cloud-contract-git-producer-poc)           | A simple Producer Example with Verifier enabled                 | https://github.com/jabrena/spring-cloud-contract-git-producer-poc      |
| 3  | spring-cloud-contract-git-consumer-poc      | [![Build Status](https://travis-ci.org/jabrena/spring-cloud-contract-git-consumer-poc.svg?branch=master)](https://travis-ci.org/jabrena/spring-cloud-contract-git-consumer-poc)           | An example about a Consumer using SCC for integration tests     | https://github.com/jabrena/spring-cloud-contract-git-consumer-poc      |
| 4  | spring-cloud-contract-git-visualization-poc | [![Build Status](https://travis-ci.org/jabrena/spring-cloud-contract-git-visualization-poc.svg?branch=master)](https://travis-ci.org/jabrena/spring-cloud-contract-git-visualization-poc) | A way to visualize SCC contracts                                | https://github.com/jabrena/spring-cloud-contract-git-visualization-poc |
| 5  | event-storming-spring-cloud-contract        | NA                                                                                                                                                                                        | The outcome from Event Storming about Contract Testing with SCC | https://github.com/jabrena/event-storming-spring-cloud-contract        |
---
---

## Old documentation


```bash
mvnw clean install
```

```bash
mvn -rf consumer spring-boot:run -Dspring.profiles.active=stub
```

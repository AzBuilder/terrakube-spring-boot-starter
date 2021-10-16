# Spring Boot Starter to consume Terrakube Api

## Introduction

This repository is for Spring Boot Starters of Terrakube Api.

## Client library

Simply add the following dependency to your project's `pom.xml` will enable you to use the `TerrakubeClient` class.

```xml
<dependency>
    <groupId>org.azbuilder.api.spring.starter</groupId>
    <artifactId>api-client-spring-boot-starter</artifactId>
    <version>0.7.0-beta.1</version>
</dependency>
```

## Example
```java
class ApiClientStarterSampleApplicationTests {

    @Autowired
    TerrakubeClient terrakubeClient;

    @Test
    void contextLoads() {
        terrakubeClient.getAllOrganizations().getData().size();
    }
}
```


# Spring Boot Starter to consume Terrakube Api

## Introduction

This repository is for Spring Boot Starters of Terrakube feign Client.

### Build library

To build the library locally use the following command.

```
mvn install -Dgpg.skip
```

## Client library

Simply add the following dependency to your project's `pom.xml` will enable you to use the `TerrakubeClient` class.

```xml
<dependency>
    <groupId>org.terrakube.client</groupId>
    <artifactId>terrakube-spring-boot-starter</artifactId>
    <version>0.9.0</version>
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


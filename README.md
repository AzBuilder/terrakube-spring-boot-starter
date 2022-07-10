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

```
org.terrakube.client.url=http://localhost:8080
org.terrakube.client.enableSecurity = true
org.terrakube.client.secretKey=JlJkNlVSQHEmOVhYU3heSHckY1pIQSMkenRVWXp2QEU=
org.terrakube.client.credentialType=INTERNAL
```

## Supported Properties 
| Name                                | Description                                  |
|:------------------------------------|----------------------------------------------|
| org.terrakube.client.url            | Terrakube API Url                            |
| org.terrakube.client.enableSecurity | Add bearer token in every request to the API |
| org.terrakube.client.credentialType | PAT (Personal Access Token)                  |
| org.terrakube.client.secretKey      | PAT Token from Terrakube                     |


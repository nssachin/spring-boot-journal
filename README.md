[![Build Status](https://travis-ci.org/nssachin/spring-boot-journal.svg?branch=master)](https://travis-ci.org/nssachin/spring-boot-journal)

# spring-boot-journal
Sample Spring Boot demo project from Pro Spring Boot book

### `@SpringBootApplication` Overview

* `@SpringBootApplication` is a composed annotation which contains `@SpringBootConfiguration`, `@EnableAutoConfiguration`,
`@ComponentScan`
```
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(
    excludeFilters = {@Filter(
    type = FilterType.CUSTOM,
    classes = {TypeExcludeFilter.class}
), @Filter(
    type = FilterType.CUSTOM,
    classes = {AutoConfigurationExcludeFilter.class}
)}
)
public @interface SpringBootApplication
```
* `@Configuration` is part of  `@SpringBootConfiguration` since Spring Boot 1.4.0
```
@SpringBootApplication
-------> @SpringBootConfiguration
       -------> @Configuration
```
* The key for Spring Boot is `@EnableAutoConfiguration` which contains the auto-configuration feature.
Spring Boot will use auto configuration based on your classpath (maven `pom.xml` in this case,
 annotations and configuration to create a suitable application. 



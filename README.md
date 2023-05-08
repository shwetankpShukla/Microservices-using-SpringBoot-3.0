# Microservices-using-SpringBoot-3.0
Microservice Architecture. We will be implementing different libraries and techniques to implement a complete architecture.

Minimal [Spring Boot](http://projects.spring.io/spring-boot/) sample app.

## Requirements

For building and running the application you need:

- [JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven 3](https://maven.apache.org)
- [MySQL](https://dev.mysql.com/doc/relnotes/mysql/8.0/en/)
- [zipkin](https://zipkin.io/)
## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the 
- `com.sp.config.ConfigServerApplication`
- 'com.sp.registry.ServiceRegistryApplication'
- 'com.sp.gateway.ApiGatewayApplication'
- 'com.sp.department.DepartmentServiceApplication'
- 'om.sp.employeeservice.EmployeeServiceApplication'

class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
java -jar zipkin.jar
```

## Port 
- Config Server : 8088
- Service Registry : 8761
- Api Gateway : 8060
- Department Service : 8081
- Employee Service : 8082
- Zipkin : 9411

![image](https://user-images.githubusercontent.com/41003710/236695998-1e8bfe2c-2fe4-4221-ac3b-e6ac5cbec2a4.png)

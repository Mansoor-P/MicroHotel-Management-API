# Hotlel Booking API - Microservices with Okta Security

This project demonstrates the creation of a microservices architecture using Spring Boot. It integrates REST APIs, services, service registry, API gateway, and GitHub configuration. Additionally, it secures the microservices with Okta for JWT OAuth authentication.

![Microservices Architecture](./microservices/mic_arch.png "Microservices Architecture")

## Key Technologies

| ![Java 17](https://img.shields.io/badge/Java-17-blue?style=flat-square) | ![Spring Boot 3](https://img.shields.io/badge/Spring%20Boot-3-blue?style=flat-square) | ![Spring Cloud Netflix](https://img.shields.io/badge/Spring%20Cloud%20Netflix-Eureka%2C%20Feign-blue?style=flat-square) |
|:-----------------------------------------------------------------------------------------------------------------------:|:------------------------------------------------------------------------------------------------------------------:|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
| ![Spring Cloud Config](https://img.shields.io/badge/Spring%20Cloud%20Config-green?style=flat-square) | ![Spring Security](https://img.shields.io/badge/Spring%20Security-blue?style=flat-square) | ![Spring Data JPA](https://img.shields.io/badge/Spring%20Data%20JPA-orange?style=flat-square) |
| ![Hibernate](https://img.shields.io/badge/Hibernate-yellow?style=flat-square) | ![MySQL](https://img.shields.io/badge/MySQL-5.7-blue?style=flat-square) | ![MongoDB](https://img.shields.io/badge/MongoDB-4.x-green?style=flat-square) |
| ![JUnit 5](https://img.shields.io/badge/JUnit-5-red?style=flat-square) |  |  |

## Step 1: Setting Up Your Environment

- **Install Java Development Kit (JDK)**: Ensure JDK 8 or later is installed. [Download JDK 17](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html).
- **Install an IDE**: Recommended IDEs are [IntelliJ IDEA](https://www.jetbrains.com/idea/) or [Eclipse](https://www.eclipse.org/).
- **Install Maven**: Use [Maven](https://maven.apache.org/) for managing dependencies. [Maven Setup Guide](https://maven.apache.org/guides/getting-started/).

## Step 2: Creating a REST API

- **Project Setup**: Create a new Spring Boot project using [Spring Initializr](https://start.spring.io/).
- **Define REST Controller**: Use `@RestController` and `@RequestMapping` annotations to define REST endpoints.
- **Implement CRUD Operations**: Set up endpoints for Create, Read, Update, and Delete operations.
    - [Spring REST Documentation](https://spring.io/guides/gs/rest-service/)

## Step 3: Implementing Services

- **Define Service Layer**: Use the `@Service` annotation to define service classes.
- **Business Logic**: Implement the necessary business logic in the service classes.
    - [Spring Service Layer Best Practices](https://www.baeldung.com/spring/service)

## Step 4: Implementing Service Registry

- **Add Eureka Server Dependency**: Include `spring-cloud-starter-netflix-eureka-server` in your `pom.xml`.
- **Configure Eureka Server**: Use `@EnableEurekaServer` annotation to enable Eureka server functionality.
- **Register Services**: Services automatically register with Eureka Server when started. Learn more about [Eureka Server](https://spring.io/projects/spring-cloud-netflix#eureka).
    - [Eureka Server Tutorial](https://www.baeldung.com/spring-cloud/eureka-server-and-client)

## Step 5: Implementing API Gateway

- **Add Zuul Dependency**: Include `spring-cloud-starter-netflix-zuul` in your `pom.xml`.
- **Configure Zuul**: Enable Zuul proxy functionality by using `@EnableZuulProxy` annotation.
- **Route Configuration**: Define routes to direct requests to the appropriate microservices. Learn more about [Zuul API Gateway](https://spring.io/projects/spring-cloud-netflix#zuul).
    - [API Gateway Pattern in Microservices](https://microservices.io/patterns/apigateway.html)

## Step 6: GitHub Configuration

- **Create GitHub Repository**: Set up a repository to host your microservices project on [GitHub](https://github.com/).
- **Version Control**: Initialize Git in your project directory and link it to your GitHub repository.
- **Push Code to GitHub**: Commit and push your code to the repository. Learn more about [GitHub](https://github.com/).
    - [GitHub Documentation](https://docs.github.com/en/github)

## Step 7: Securing with Okta JWT OAuth

- **Add Okta Dependency**: Include Okta dependencies in your `pom.xml`. Follow Okta setup instructions on [Okta Developer](https://developer.okta.com/).
- **Configure Okta**: Set up an [Okta Developer account](https://developer.okta.com/signup/) and configure an OAuth 2.0 application.
- **Security Configuration**: Integrate Okta with Spring Security for JWT OAuth authentication. Learn more about Okta integration with Spring Security [here](https://developer.okta.com/docs/guides/secure-spring-boot-application/overview/).
    - [Okta JWT OAuth Guide](https://developer.okta.com/docs/guides/implement-auth-code-pkce/overview/)

## Step 8: Next Steps

- **Testing and Validation**: Thoroughly test your microservices and APIs to ensure functionality. You can use tools like [Postman](https://www.postman.com/) for API testing.
- **API Documentation**: Use [Swagger](https://swagger.io/) or [OpenAPI](https://www.openapis.org/) to document your APIs.
    - [Springfox Swagger Integration](https://springfox.github.io/springfox/docs/current/)
- **Monitoring and Scaling**: Implement monitoring tools such as [Prometheus](https://prometheus.io/) and [Grafana](https://grafana.com/) for tracking microservices health and consider scaling options based on demand.
    - [Prometheus Official Docs](https://prometheus.io/docs/introduction/overview/)
    - [Grafana Official Docs](https://grafana.com/docs/grafana/latest/)

---

This setup provides a scalable foundation for building a secure travel booking platform with microservices and OAuth-based security.

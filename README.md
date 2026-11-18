This project is a Spring Boot Microservices-based application consisting of three independent services: 
User Service, Post Service, and Notification Service**.
The services communicate with each other using **REST APIs and RestTemplate** for synchronous inter-service communication.
The application demonstrates how multiple microservices interact to retrieve and manage related data using a unique User ID.

User Service
Manages user information.
Exposes REST endpoints to retrieve user details based on User ID. 
Communicates with Post Service and Notification Service using RestTemplate.
Aggregates responses from multiple services.
 
Request Flow
Client sends a GET request with a User ID to User Service.
User Service retrieves the user details.
User Service calls Post Service using RestTemplate.
Post Service returns posts associated with the User ID.
User Service calls Notification Service using RestTemplate.
Notification Service returns notifications associated with the User ID.
User Service combines the responses and returns the aggregated result.

Technologies
Java
Spring Boot
Spring Web
Spring Data JPA
Hibernate
RestTemplate
RESTful APIs
MySQL
Maven

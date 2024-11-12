Java REST Swagger Service
=========================

This project is a simple RESTful service built using Spring Boot. It includes endpoints to demonstrate health checks, database connectivity, and an example of integrating Swagger UI for API documentation. The project also uses an in-memory H2 database to provide a simple way to test database connectivity.

Features
--------

*   **RESTful Endpoints** using Spring Boot.
    
*   **Swagger UI Integration** for easy API exploration.
    
*   **In-memory H2 Database** for local testing.
    

Requirements
------------

*   **Java 8 or higher**: Ensure you have the Java Development Kit (JDK) installed.
    
*   **Maven**: Apache Maven is required for managing dependencies and building the project.
    
*   **IDE**: You can use IntelliJ IDEA, Eclipse, or any other IDE of your choice.
    

Setup Instructions
------------------

### 1\. Create the Project

*   Install Java Development Kit (JDK) 8 or higher. You can download it from [Oracle's official site](https://www.oracle.com/java/technologies/javase-downloads.html).
    
*   Install [Apache Maven](https://maven.apache.org/download.cgi) for managing dependencies and building the project.
    
*   Install an Integrated Development Environment (IDE) like [IntelliJ IDEA](https://www.jetbrains.com/idea/) or [Eclipse](https://www.eclipse.org/downloads/).
    

### 2\. Setup Spring Boot Project

*   Open your IDE and create a new Maven project.
    
*   org.springframework.boot spring-boot-starter-web org.springdoc springdoc-openapi-ui 1.6.14 org.springframework.boot spring-boot-starter-jdbc com.h2database h2 1.4.200
    

### 3\. Configure H2 Database

*   spring.datasource.url=jdbc:h2:mem:testdbspring.datasource.driverClassName=org.h2.Driverspring.datasource.username=saspring.datasource.password=passwordspring.jpa.database-platform=org.hibernate.dialect.H2Dialect
    

### 4\. Run the Application

*   mvn spring-boot:run
    

Endpoints
---------

*   **Greeting Endpoint**: GET /api/greet
    
    *   Returns a simple greeting message.
        
*   **Health Check Endpoint**: GET /api/healthz
    
    *   Returns OK to indicate that the service is up and running.
        
*   **Database Test Endpoint**: GET /api/testDb
    
    *   Tests the connection to the in-memory H2 database and returns a message from it.
        
*   **Swagger UI**: Visit http://localhost:8080/swagger-ui.html to view and interact with the available API endpoints.
    

Project Structure
-----------------

*   **RestSwaggerServiceApplication**: Main application class that configures the Spring Boot application and data source.
    
*   **SampleController**: Contains the REST endpoints, including the database test endpoint.
    

Troubleshooting
---------------

*   If you encounter **database connection issues**, ensure that the application.properties file is properly configured and that H2 is set up as described.
    
*   Ensure **dependencies are up to date** by running mvn clean install if you encounter any dependency resolution issues.
    

License
-------

This project is licensed under the MIT License. Feel free to use and modify it for your own needs.
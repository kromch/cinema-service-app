![alt text](https://raw.githubusercontent.com/kromch/cinema-service-app/master/cinema-hall-interior.png)
# CINEMA SERVICE APP 

This project is a blueprint for future development and deploying as Cinema Service application. 
Was used Java Spring Framework for using MVC pattern, JavaBeans representation of data models and their lifecycles and relations into IoC container of Application and Security app context, also using JBDC driver stack and Hibernate ORM tools for data manipulation.

Admin (login : password): admin@hotmail.com : AdmiN_dj539fdd23sA

Applyed next principles during the development of the program:
- MVC pattern
- REST API
- SOLID principles

Project based on 3-layer architecture:
- Presentation layer (CONTROLLERS)
- Application layer (SERVICES)
- Data access layer (DAO)

# Features
- Register a new user
- Role-based authorization (admin, user) 
- Exception handling (invalid username, password, invalid role) with appropriate messages
- Access registered user to relevant functional endpoints deployed by Cinema Service application

# Project structure
- Controllers:
	-  contollers: 
		- AuthenticationController - registration every user (as admin role too) in Cinema Service application for employment this security and resource component
		- CinemaHallController - 
		- CustomGlobalExceptionHandler 
		- MovieController
		- MovieSessionController 
		- OrderController 
		- ShoppingCartController
		- UserController 
	- Exception:
		- DataProcessingException class for handling checked exceptions during rest processes
	- Model:
		- CinemaHall model class
		- Movie model class 
		- MovieSession model class
		- Order model class 
		- Role model class
		- ShoppingCart model class 
		- Ticket model class
		- User model class		
	- Service:
		- AuthenticationServiceImpl class 
- resources: db.properties file - configuration file with own setting of deploying project


# Getting Started
- Clone this remote repository to your local repository : `git clone https://github.com/kromch/cinema-service-app.git`
- Download and deploy to local Maven repo Spring Framework JAR file from `https://repo.spring.io/ui/native/release/org/springframework/spring-core/5.3.27/` for app development and compile
- Build the project using Maven command: `mvn clean install`
- Deploy the WAR file to a servlet container such as Tomcat or Jetty

# Used technologies:
- JDK 19.0.1 version
- Maven 3.9.1 version
- Spring Framework 5.3.27 version
- Spring security component 5.6.10 version
- Hibernate ORM 5.6.15.Final version
- JDBC 4.2 version
- MySql 8.0.32 version
- Java Servlets 4.0.1 version
- Core Jackson processing abstractions (aka Streaming API), implementation for JSON 2.15.0 version
- Apache Tomcat 11.0.0-M4 version

# Authors
Roman Korkonishko

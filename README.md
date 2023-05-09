![alt text](https://raw.githubusercontent.com/kromch/cinema-service-app/master/cinema-hall-interior.png)
# CINEMA SERVICE APPLICATION

This project is a blueprint for future development and deploying as Cinema Service application. 
Was used Java Spring Framework for using MVC pattern, JavaBeans representation of data models and their lifecycles and relations into IoC container of Application and Security app context, also using JBDC driver interface and Hibernate ORM tools for data manipulation.

Program code and description of users for registration can be found in the DataInitializer class.

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

# Details of functionality with using REST API
- POST: /register (to create a user) - ALL
- POST: /cinema-halls (to create a cinema hall) - ADMIN
- POST: /movies (to create a movie) - ADMIN
- POST: /movie-sessions (to create a movie session) - ADMIN
- POST: /orders/complete (to create an order for current user) - USER
- PUT: /movie-sessions/{id} (to update a movie session) - ADMIN
- PUT: /shopping-carts/movie-sessions (to add movie session to shopping cart) - USER
- DELETE: /movie-sessions/{id} (to delete a movie session) - ADMIN
- GET: /orders (to get order history for current user) - USER
- GET: /shopping-carts/by-user (to get a shopping cart for current user) - USER
- GET: /cinema-halls (to get all cinema halls) - USER or ADMIN
- GET: /movies (to get all movies) - USER or ADMIN
- GET: /movie-sessions/available (to get all available movie by date) - USER or ADMIN
- GET: /users/by-email (to find user by email) - ADMIN

All endpoints used JSON transfer data format (except for the login page, which is generated by Spring security component). All endpoints created by Cinema Service application are secured by role-based authorization. 

# Project file structure
![alt text](https://raw.githubusercontent.com/kromch/cinema-service-app/master/struct.png)

# Main folders of project  
- Config:
	- AppConfig - Spring Application Initializer class
	- DataInitializer - User injector class
	- SecurityConfig - User roles configuration class
	- SecurityInitializer - Web Application Initializer class
	- WebAppInitializer - Servlets Initializer class 
	- WebConfig - Spring Security Web Initializer
- Controllers: 
	- AuthenticationController - user registration with your own role in the Cinema Service application to ensure security and access to resources
	- CinemaHallController - handling list of cinema halls
	- CustomGlobalExceptionHandler - handling of global application exceptions
	- MovieController - handling list of movies
	- MovieSessionController - handling list of moviesessions
	- OrderController - handling list of completed orders
	- ShoppingCartController - handling content of user shoppingcart 
	- UserController - handling any user by identity info
- Exception:
	- DataProcessingException class for handling checked exceptions during rest processes
- Model
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
	- CinemaHallServiceImpl class
	- MovieServiceImpl class
	- MovieSessionServiceImpl class
	- OrderServiceImpl class 
	- RoleServiceImpl class
	- ShoppingCartServiceImpl class
	- UserServiceImpl class		
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
# Uniform Donation Platform

A backend API designed to connect donors and schools for the
redistribution of school uniforms.\
The goal of this project is to create a secure and scalable system that
enables schools to request support and donors to contribute resources in
an organized way.

This project is also intended as a learning-focused backend system built
using modern Java and Spring development practices.

------------------------------------------------------------------------

## Project Goals

-   Provide a platform for **schools to register and request uniform
    donations**
-   Allow **donors to contribute uniforms to schools in need**
-   Implement **secure user authentication and role-based access
    control**
-   Practice **clean backend architecture and maintainable code
    structure**
-   Demonstrate real-world usage of **Spring Boot ecosystem
    technologies**

------------------------------------------------------------------------

## Technologies

-   **Java 21**
-   **Spring Boot**
-   **Spring Security**
-   **Spring Data JPA / Hibernate**
-   **PostgreSQL** 
-   **Maven**
-   **Swagger** for API documentation

------------------------------------------------------------------------

## Core Features

### User Management

-   User registration
-   Role-based accounts:
    -   `DONOR`
    -   `SCHOOL`
    -   `ADMIN`
-   Secure password hashing using **BCrypt**

### School Profiles

-   Schools can create and manage profiles representing institutions
    requesting uniform donations.

### Security

-   Spring Security authentication
-   Role-based authorization
-   Protected endpoints for administrative operations


------------------------------------------------------------------------

## Project Architecture

The project follows a layered architecture to keep responsibilities
separated and maintainable.

Controller → Service → Repository → Database

DTOs handle API communication\
Entities represent database models\
Services contain business logic

Main packages:

-   `user`
-   `school`
-   `security`
-   `shared`
-   `exceptions`

------------------------------------------------------------------------

## Running the Project

### Prerequisites

-   Java 21+
-   Maven
-   PostgreSQL

### Clone the repository

``` bash
git clone https://github.com/TiagoEich/uniform-donation-platform.git
cd uniform-donation-platform
```

### Run the application

``` bash
mvn spring-boot:run
```

Application will start at:

    http://localhost:8080

------------------------------------------------------------------------

## API Documentation

Swagger UI is available at:

    http://localhost:8080/swagger-ui/index.html

This interface allows testing endpoints directly from the browser.

------------------------------------------------------------------------

## Example API Request

### Creating a user

POST `/public/users`

Example request body:

``` json
{
  "fullName": "Jon Snow",
  "email": "john@email.com",
  "password": "securePassword",
  "role": "DONOR"
}
```

------------------------------------------------------------------------

## Future Improvements

Planned enhancements include:

-   JWT authentication
-   Donation tracking system
-   School request approval workflow
-   Admin moderation tools
-   File uploads for school verification
-   Email notifications

------------------------------------------------------------------------

## Learning Objectives

This project focuses on practicing:

-   Spring Boot backend architecture
-   Secure authentication flows
-   REST API design
-   Database modeling with JPA
-   Clean and maintainable service-layer logic

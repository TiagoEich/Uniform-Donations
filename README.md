# Uniform Donation Platform

A backend API designed to connect donors and schools for the redistribution of school uniforms.  
The goal of this project is to create a secure and scalable system that enables schools to request support and donors to contribute resources in an organized way.

This project is also intended as a learning-focused backend system built using modern Java and Spring development practices.

---

## Project Goals

- Provide a platform for **schools to register and request uniform donations**
- Allow **donors to contribute uniforms to schools in need**
- Implement **secure user authentication and role-based access control**
- Practice **clean backend architecture and maintainable code structure**
- Demonstrate real-world usage of **Spring Boot ecosystem technologies**

---

## Technologies

- **Java 21**
- **Spring Boot**
- **Spring Security**
- **Spring Data JPA / Hibernate**
- **PostgreSQL**
- **Maven**
- **Swagger** for API documentation

---

## Core Features

### User Management
- User registration
- Role-based accounts:
  - `DONOR`
  - `SCHOOL`
  - `ADMIN`
- Secure password hashing using **BCrypt**

### School Profiles
- Schools can create and manage profiles
- Profiles represent institutions requesting uniform donations

### Security
- Spring Security authentication
- Role-based authorization
- Protected endpoints for administrative operations

### API Documentation
- Swagger UI integration for easy API testing

---

## Project Architecture

The project follows a layered architecture to keep responsibilities separated and maintainable.

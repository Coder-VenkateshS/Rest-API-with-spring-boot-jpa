# Iamneo | Rest API with Spring Boot and JPA

### Objective
To build a complete REST API backend

## Day 1 | Class Exercise Lab | Introduction to REST API

In this Lab, we will create three services using proper URIs and HTTP methods:
```
@GetMapping("/students/{studentId}/courses"): You can ask the courses a specific student has registered for using request method Get and example uri /students/Student1/courses.
```
```
@GetMapping("/students/{studentId}/courses/{courseId}"): You can ask a specific course for a specific student using request method Get and example uri /students/Student1/courses/Course1.
```
```
@PostMapping("/students/{studentId}/courses") : You can register a student for a course by sending a POST request to URI /students/Student1/courses
 ```
### What will you learn
```
You will learn
 What is a REST Service?
 How to bootstrap a Rest Service application with Spring Initializr?
 How to create a Get REST Service for retrieving the courses that a student registered for?
 How to create a Post REST Service for registering a course for student?
 How to execute Rest Services from Postman? 
```
#### User Story #1 | Tools and Setup
You should be able to install the following tools in the system
* Maven 3.0+ is your build tool
* Your favorite IDE. We use Eclipse.
* JDK 11

### User Story #2 | Bootstrap a Rest Service application with Spring Initializr
You should be able to bootstrap the REST Services with Spring Initializr. To do this, click [https://start.spring.io/]. Spring Initializr [http://start.spring.io/] is great tool to bootstrap your Spring Boot projects. 

* Launch Spring Initializr and choose the following
* Choose com.iamneo.springboot as Group
* Choose student-services as Artifact
* Choose following dependencies
```
Web
Actuator
DevTools
 ```
* Check if maven and Jdk 11 are selected. 
* Click Generate Project.
* Import the project into Eclipse. File -> Import -> Existing Maven Project.

### User Story #3 | 



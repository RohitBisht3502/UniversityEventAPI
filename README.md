# <h1 align = "center"> University Event Management </h1>
___ 
<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-4.0-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.1.3-brightgreen.svg" />
</a>
    <img alt = "License: MIT" src="https://img.shields.io/badge/License-MIT-yellow.svg" />
    </a>
</p>


---

<p align="left">

## Overview

The University Event Managementt Application is a Spring Boot-based web application designed to help manage students and events information. It allows users to perform various operations related to University management, including adding new events and students, updating specialties, and deleting events from the system.

## Technologies Used

- **Framework:** Spring Boot
- **Language:** Java
- **Build Tool:** Maven

## Data Flow

### Controller

The Controller layer is responsible for handling incoming HTTP requests and delegating them to the appropriate services. It defines API endpoints for the following operations:

1. **Get All Events:** `GET /Events` or GET /Students`
   
   This endpoint retrieves a list of all registered events and students list.

   ```java
   @GetMapping("Evetns")
   public List<Event> getEvents() {
       
   }
   ```

2. **Get Event by ID:** `GET /event/{id}`

   This endpoint retrieves detailed information about a specific event by its ID.

   ```java
   @GetMapping("event/{id}")
   public Event getEvent(@PathVariable Integer id) {
      
   }
   ```

3. **Add Restaurant:** `POST /event`

   This endpoint adds a new event to the system.

   ```java
   @PostMapping("Events")
   public String addEvent(@Valid @RequestBody Event newEvent) {
    
   }
   ```

4. **Add Events:** `POST /events`

   This endpoint adds multiple restaurants to the system.

   ```java
   @PostMapping("events")
   public String addRestaurants(@Valid @RequestBody List<event> event) {
       
   }
   ```

5. **Update Event Specialty:** `PUT /Event/id/{id}/Department/{Department}`

   This endpoint updates the department of a Event by its ID.

   ```java
   @PutMapping("Event/id/{id}/specialty/{updatedDepartment}")
   public String updateDepartment(@PathVariable Integer id, @RequestParam String updadteDepartment) {
       
   }
   ```

6. **Delete Event:** `DELETE /Event/{id}`

   This endpoint deletes a Event by its ID.

   ```java
   @DeleteMapping("Event/{id}")
   public String deleteEvent(@PathVariable Integer id) {
       
   }

### Same for 
   ```

7. **CRUD operation on Students also same like above** 

The Services layer implements the core business logic, data processing, and interaction with the data repository. Key responsibilities include:

- Validating input data.
- Performing CRUD operations on restaurant data.
- Handling data transformations and interactions with external systems (if applicable).

### Repository

The Repository layer manages data access to the underlying database. It handles database operations such as Create, Read, Update, and Delete (CRUD) for restaurant data. Additionally, it may include data mapping and conversion between Java objects and database entities.

## Database Design

The project's database design includes tables for restaurant management, with fields such as:

### Restaurant Table

1.Student table with columns:

StudentId (Primary Key): A unique identifier for each student.
FirstName: First name of the student.
LastName: Last name of the student.
Age: Age of the student.
Department: Department to which the student belongs.

2.Event table with columns:

EventId (Primary Key): A unique identifier for each event.
EventName: Name of the event.
LocationOfEvent: Location where the event is held.
Date: Date of the event.
StartTime: Start time of the event.
EndTime: End time of the event.

The "Restaurant" table stores restaurant-related information, including restaurant IDs, names, addresses, contact information, specialties, staff counts, types, and timestamps for record creation and modification.

This database design ensures data integrity and provides a structured approach to managing restaurant information within the application.

## Database Used

The project utilizes the following data structures:

### Model
1.Event
2.Student


### Type Enum

The `Type` enum enumerates the possible University department types:

- `CIVIL
- `MECHANICAL`
- `COMPUTER_SCIENCE`
- `ELECTRICAL
- ...

### MySql

The project

 utilizes the `MySql` data structure to store and manage lists of `University` objects in various parts of the application. `MySql` provides permanent storage and efficient element retrieval, making it suitable for storing university records and performing operations on them.

These database enable the application to organize and manipulate restaurant data efficiently while maintaining data integrity.

## Project Summary

The University Management Application is a robust Spring Boot application designed for efficient University Event data management. It offers a set of RESTful API endpoints for various restaurant-related operations, including adding, retrieving, updating, and deleting restaurant information.

Key Features:

- RESTful API endpoints for restaurant management.
- Data validation to ensure data integrity.
- Clean code separation with a layered architecture (Controller, Services, Repository).
- Robust error handling for improved reliability.
- Java-based backend and Maven for build management.

The Restaurant Management Application serves as a practical example of Spring Boot application development, demonstrating best practices in API design and restaurant data management. It offers a solid foundation for building and extending restaurant management systems in various applications.

## License

This project is licensed under the [MIT License](LICENSE).

## Acknowledgments

Thank you to the Spring Boot and Java communities for providing excellent tools and resources.

## Contact
For questions or feedback, please contact [ROHIT SINGH BISHT](mailto:business.rohitbisht3502@gmail.com)




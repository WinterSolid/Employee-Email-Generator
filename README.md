# Employee Email Generator

The Employee Email Generator Application automates the creation of user accounts and email addresses for new employees, along with managing passwords and mailbox settings.

## Overview
This project demonstrates an email application initially written in Java and converted to Kotlin using the MVC (Model-View-Controller) architecture. The application manages employee email accounts by capturing user details, setting department-specific email addresses, generating random passwords, and displaying user information.

## Project Structure
The project is divided into three main components:

## Model: Represents the data and business logic (Email.kt).
## View: Handles user interactions and display (EmailView.kt).
## Controller: Manages the communication between the Model and the View (EmailController.kt).

## Conversion from Java to Kotlin
The original Java project was converted to Kotlin for several reasons:

- Conciseness: Kotlin's syntax is more concise, reducing boilerplate code.
- Null Safety: Kotlin has built-in null safety features, reducing the risk of null pointer exceptions.
- Interoperability: Kotlin is fully interoperable with Java, allowing seamless integration with existing Java codebases.
- Modern Features: Kotlin offers modern programming features such as extension functions, higher-order functions, and coroutines for asynchronous programming.


## Features

- **User Creation**: Generates user accounts with a unique email address based on the format: firstname.lastname@department.company.com.
- **Department Assignment**: Determines the department of the employee (Development, Sales, HR, Public Safety).
- **Random Password Generation**: Generates a random password for each new employee.
- **Password Management**: Provides methods for changing passwords and adding alternative email addresses.
- **Mailbox Capacity**: Allows setting of mailbox capacity for each employee.
- **Display Information**: Displays employee name, email address, and mailbox capacity.

## Technologies Used

- Java: Programming language used for the backend logic.
- IntelliJ IDEA, Eclipse
- Git: Version control system for managing project versions and collaboration.

## Usage

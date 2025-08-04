# Employee Email Generator

The **Employee Email Generator** automates the creation of email accounts for new employees, handling user information, password generation, and mailbox settings efficiently.

## Overview
This application was originally developed in **Java** and later migrated to **Kotlin**, following the **MVC (Model-View-Controller) architecture**. It captures user details, assigns department-based email addresses, generates secure passwords, and manages mailbox configurations.

## Project Structure
- **Model** (`Email.kt`): Contains data models and business logic.
- **View** (`EmailView.kt`): Manages user input/output and display.
- **Controller** (`EmailController.kt`): Coordinates interactions between the Model and View.

## Java to Kotlin Migration
The project was refactored from Java to Kotlin to:
- Reduce boilerplate through concise syntax.
- Leverage null safety to minimize runtime errors.
- Utilize Kotlin’s modern features such as extension functions and higher-order functions.
- Maintain interoperability with existing Java codebases.

## Features
- Automated user account creation with email format: `firstname.lastname@department.company.com`
- Department selection (Development, Sales, HR, Public Safety)
- Secure random password generation
- Password and alternate email address management
- Mailbox capacity configuration
- Employee information display including name, email, and mailbox size

## Technologies Used
- Kotlin (Primary language)
- Java (Legacy codebase)
- IntelliJ IDEA / Eclipse (Development IDEs)
- Git (Version control)



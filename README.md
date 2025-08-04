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

## License

This is free and unencumbered software released into the public domain.

Anyone is free to copy, modify, publish, use, compile, sell, or distribute this software, either in source code form or as a compiled binary, for any purpose, commercial or non-commercial, and by any means.

In jurisdictions that recognize copyright laws, the author or authors of this software dedicate any and all copyright interest in the software to the public domain. We make this dedication for the benefit of the public at large and to the detriment of our heirs and successors. We intend this dedication to be an overt act of relinquishment in perpetuity of all present and future rights to this software under copyright law.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.



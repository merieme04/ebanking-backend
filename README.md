# Gestion des Comptes Bancaires 

## Description

This project aims to develop an application for managing bank accounts. Each account belongs to a client and can undergo multiple DEBIT or CREDIT operations. The two types of supported accounts are Current Accounts and Savings Accounts.

## Layered Architecture

The application follows a layered architecture to ensure clear separation of concerns and facilitate code scalability and maintainability. The main layers include:

- **DAO (Data Access Object) Layer**: This layer is responsible for data access and communication with the database. It utilizes JPA (Java Persistence API) entities to represent the business objects.

- **Service Layer**: This layer handles the business logic of the application. It uses the DAOs to access data, perform operations, and enforce business rules.

- **Presentation Layer**: This layer is responsible for presenting data to the user and receiving user inputs. It includes RestControllers that expose a REST API to interact with the application.

- **Front-end Layer**: This layer pertains to the user interface and will be developed using the Angular framework.

## Installation

To run the application, follow the steps below:

1. Clone the project repository using the command: `git clone https://github.com/MarshelD/E_Bank`
2. Navigate to the backend folder: `cd backend`
3. Import the backend project into your preferred IDE, such as Eclipse or IntelliJ.
4. Run the backend project by clicking the "Run" button in your IDE. Make sure you have properly configured your Java and Maven environment to run a Spring Boot project.
5. Navigate to the frontend folder: `cd ../frontend`
6. Install the dependencies using the command: `npm install`
7. Launch the frontend application using the command: `npm start`. Make sure you have Node.js and Angular CLI installed on your machine to run the frontend application.

## Project Structure

The project is organized into two distinct parts:

1. Backend: developed using the Spring Boot framework, this part includes the DAO, Service layers, and RestControllers. The backend source code can be found in the "backend" folder.

2. Frontend: developed using Angular, this part concerns the user interface of the application. The frontend source code can be found in the "frontend" folder.

## Contributions

Contributions are welcome! If you wish to contribute to this project, please refer to the CONTRIBUTING.md file for detailed instructions. All forms of contributions, such as bug fixes, feature enhancements, or suggestions for improving the user experience, are appreciated.

We hope you enjoy using our bank account management application. Feel free to contact us if you have any questions or feedback. Happy banking!

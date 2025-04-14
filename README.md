# Full-stack-hotel Application
The Full-Stack Hotel is an application that allows users to book rooms at a hotel, with an admin interface for managing rooms, reservations, and users. The project uses Java Spring Boot for the backend, React+Vite for the frontend, and Docker for managing all components within containers.

## Features
-**Room Reservation – Users can browse available rooms and make reservations.

-**Admin Panel – Administrators can add new rooms, view, and manage reservations.

-**User Interface – A simple and intuitive design for users to book rooms.

-**Reservation API – Enables communication between the frontend and backend via a REST API.

## Technologies
-**Backend: Java, Spring Boot, JPA, MySQL

-**Frontend: React, React Bootstrap, Axios

-**Docker: For containerizing the application

-**Database: MySQL


## Setting up the Project
# Prerequisites

Before running the project, ensure that you have the following installed:
-**Docker
-**Docker Compose

## Running the Application

Clone the repository: 
https://github.com/jovangolic/full-stack-hotel.git
cd full-stack-hotel

## Run the Docker containers:
docker-compose up --build  this is for starting
#This will automatically:

    Build Docker images for both the backend and frontend.

    Start containers for MySQL database, Spring Boot backend, and React frontend.

    Access the application:

    Frontend: The application will be available at http://localhost:5173.

    Backend (API): The API will be available at http://localhost:8080.
# Project structure:
full-stack-hotel/
├── backend/
│   ├── src/
│   ├── Dockerfile
│   ├── pom.xml
│   └── application.properties
├── frontend/
│   ├── src/
│   ├── Dockerfile
│   ├── package.json
│   └── .env
├── docker-compose.yml
└── README.md

docker-compose dowm  -this is for shuting down

#Docker Compose

The project uses a docker-compose.yml file to define and manage Docker containers. It contains configurations for:

    MySQL: The database used to store information about users, rooms, and reservations.

    Backend: The Spring Boot application running in a Docker container.

    Frontend: The React application running in a Docker container.


#hotel-fronted is the name of the container.

## Development Instructions

    Frontend Development: If you want to work on the frontend, you can run the application with npm start instead of Docker, and access it at http://localhost:5173.

    Backend Development: For backend development, use mvn spring-boot:run or ./mvnw spring-boot:run to run the application in Spring Boot environment.

## Full-Stack-Hotel App

## Running the application with Docker (Steps):

1. Log in to Docker Hub: First, you need to log in to Docker Hub using the command: docker login. Enter your Docker Hub credentials when prompted.
2. Pull the Docker images: Pull the necessary images using the following commands:
    - For the MySQL database: docker pull jovangolic/full-stack-hotel:database
    - For the backend: docker pull jovangolic/full-stack-hotel:backend-part
    - For the frontend: docker pull jovangolic/full-stack-hotel:frontend-part

3. Navigate to the project directory (use Visual Studio Code, Eclipse or Intellij IDEA, and its terminal): Go to the root directory of the project, where the docker-compose.yml file is located. Then, in your terminal (e.g., VSCode terminal), run the following command:
      -  docker-compose up
      - or, to rebuild images before running:   docker-compose up --build
4. Access the application: Once the application is started, use the following URLs to access the application:

    Backend (for testing with Postman or other tools): http://localhost:8080

    Frontend (open in browser): http://localhost:5173
6. Shut down the application: To shut down the application, use the following Docker command:
    - docker-compose down

##Author

# Jovan Golić - Author of this project.

## License

This project is licensed under the MIT License - see the LICENSE file for more information.

    

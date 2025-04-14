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
# docker-compose.yml file:

services:
  frontend:
    build:
      context: ./hotel-front
    image: hotel-front-image
    ports:
      - "5173:80"
    depends_on:
      - backend
    networks:
      - hotel-network

  backend:
    build:
      context: ./back-v2
    image: back-v2-image
    ports:
      - "8080:8080"
    environment:
      SPRING_DATASOURCE_URL: jdbc:mysql://mysql-docker:3306/hotel_database_docker
      SPRING_DATASOURCE_USERNAME: root
      SPRING_DATASOURCE_PASSWORD: root
    depends_on:
      mysql:
        condition: service_healthy
    networks:
      - hotel-network

  mysql:
    container_name: mysql-docker
    image: mysql:8.0
    environment:
      MYSQL_DATABASE: hotel_database_docker
      MYSQL_ROOT_PASSWORD: root
    ports:
      - "3308:3306"
    volumes:
      - mysql-docker:/var/lib/mysql
    networks:
      - hotel-network
    healthcheck:
      test: ["CMD", "mysqladmin", "ping", "-h", "localhost"]
      interval: 10s
      timeout: 5s
      retries: 5

volumes:
  mysql-docker:

networks:
  hotel-network:

# Backend Dockerfile (Spring Boot)

backend/Dockerfile
FROM openjdk:17-jdk-buster

WORKDIR /app

COPY target/back-v2-0.0.1-SNAPSHOT.jar /app/back-v2.jar

ENTRYPOINT ["java", "-jar", "/app/back-v2.jar"]

# Frontend Dockerfile (React)

frontend/Dockerfile
FROM node:20-alpine3.16 AS build
WORKDIR /app
# Kopiranje package.json i package-lock.json
COPY package*.json ./
RUN npm install

# Kopiranje svih fajlova
COPY . .
# Build aplikacije
RUN npm run build

# Postavljanje Nginx-a za serviranje statičkog sadržaja
FROM nginx:alpine
COPY --from=0 /app/dist /usr/share/nginx/html

# 6. Kopiraj custom nginx config ako treba (opciono)
# COPY nginx.conf /etc/nginx/nginx.conf

# Expose port 80 za HTTP
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]

#hotel-fronted je naziv kontejnera

## Development Instructions

    Frontend Development: If you want to work on the frontend, you can run the application with npm start instead of Docker, and access it at http://localhost:5173.

    Backend Development: For backend development, use mvn spring-boot:run or ./mvnw spring-boot:run to run the application in Spring Boot environment.

##Authors

# Jovan Golić - Author of this project.

## License

This project is licensed under the MIT License - see the LICENSE file for more information.

    

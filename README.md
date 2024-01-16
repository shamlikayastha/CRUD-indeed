<<<<<<< HEAD
<<<<<<< HEAD
# Full Stack CRUD Application

This project is a simple full-stack CRUD (Create, Read, Update, Delete) application using React for the frontend, Spring Boot for the backend, and MySQL for the database.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Backend Setup](#backend-setup)
- [Frontend Setup](#frontend-setup)
- [Running the Application](#running-the-application)

## Prerequisites

Before you begin, ensure you have the following installed on your machine:

- [Node.js and npm](https://nodejs.org/)
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Spring Tool Suite (STS)](https://spring.io/tools)
- [MySQL](https://www.mysql.com/)

## Backend Setup

1. Open the `CRUD-backend` folder in Intellij-IDE.

2. In project structuure, setup the jdk preferred as Java-11
    Build. gradle- install the dependencies for jpa
   In gradle settings provide path for jdk and gradle
  build the gradle with ' gradle clean build'

3.Configure the MySQL database:
   - Create a new MySQL database with the name specified in `application.properties`.
   - Update `application.properties` with your database connection details
'spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/{database-name as in mysql}
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver'

Run the Spring Boot application:
   - Right-click on `DemoCrudApplication.java` and select "Run ".

4. Verify that the backend server is running by accessing `http://localhost:8080/user`

5. Api points can either be checked by Insomnia or postman. Here used insomnia

## Frontend Setup

1. Open the `CRUD-frontend` folder in your preferred code editor - Vs code.

2. Install dependencies:
   npm install/i
  npm start
=======
# Full Stack CRUD Application

This project is a simple full-stack CRUD (Create, Read, Update, Delete) application using React for the frontend, Spring Boot for the backend, and MySQL for the database.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Backend Setup](#backend-setup)
- [Frontend Setup](#frontend-setup)
- [Running the Application](#running-the-application)

## Prerequisites

Before you begin, ensure you have the following installed on your machine:

- [Node.js and npm](https://nodejs.org/)
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Spring Tool Suite (STS)](https://spring.io/tools)
- [MySQL](https://www.mysql.com/)

## Backend Setup

1. Open the `CRUD-backend` folder in Intellij-IDE.

2. In project structuure, setup the jdk preferred as Java-11
    Build. gradle- install the dependencies for jpa
   In gradle settings provide path for jdk and gradle
  build the gradle with ' gradle clean build'

3.Configure the MySQL database:
   - Create a new MySQL database with the name specified in `application.properties`.
   - Update `application.properties` with your database connection details
'spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/{database-name as in mysql}
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver'

Run the Spring Boot application:
   - Right-click on `DemoCrudApplication.java` and select "Run ".

4. Verify that the backend server is running by accessing `http://localhost:8080/user`

5. Api points can either be checked by Insomnia or postman. Here used insomnia

## Frontend Setup

1. Open the `CRUD-frontend` folder in your preferred code editor - Vs code.

2. Install dependencies:
   npm install/i
  npm start
>>>>>>> f80e88a4f7f2aa7aa336ec615de467212b9e41b5
=======
# Full Stack CRUD Application

This project is a simple full-stack CRUD (Create, Read, Update, Delete) application using React for the frontend, Spring Boot for the backend, and MySQL for the database.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Backend Setup](#backend-setup)
- [Frontend Setup](#frontend-setup)
- [Running the Application](#running-the-application)

## Prerequisites

Before you begin, ensure you have the following installed on your machine:

- [Node.js and npm](https://nodejs.org/)
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Spring Tool Suite (STS)](https://spring.io/tools)
- [MySQL](https://www.mysql.com/)

## Backend Setup

1. Open the `CRUD-backend` folder in Intellij-IDE.

2. In project structuure, setup the jdk preferred as Java-11
    Build. gradle- install the dependencies for jpa
   In gradle settings provide path for jdk and gradle
  build the gradle with ' gradle clean build'

3.Configure the MySQL database:
   - Create a new MySQL database with the name specified in `application.properties`.
   - Update `application.properties` with your database connection details
'spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/{database-name as in mysql}
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver'

Run the Spring Boot application:
   - Right-click on `DemoCrudApplication.java` and select "Run ".

4. Verify that the backend server is running by accessing `http://localhost:8080/user`

5. Api points can either be checked by Insomnia or postman. Here used insomnia

## Frontend Setup

1. Open the `CRUD-frontend` folder in your preferred code editor - Vs code.

2. Install dependencies:
   npm install/i
  npm start
>>>>>>> 48e32dd1266aa4494701aada94e33ab0d352ba7e

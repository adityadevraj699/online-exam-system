# online-exam-system

## Overview

The Online Examination System is a web application developed using Spring Boot, Thymeleaf, MySQL, and REST APIs. It allows users to create, manage, and take online exams, with functionalities for user registration, login, exam creation, and result viewing. This project is designed to provide a robust and scalable platform for conducting online exams with ease.

## Features

- **User Management:**
  - Registration and authentication
  - User roles and permissions

- **Exam Management:**
  - Create and manage exams
  - Add and organize questions

- **Question Management:**
  - Support for multiple-choice and text-based questions
  - Edit and delete questions

- **Results:**
  - View results of completed exams
  - Track performance over time

## Technologies Used

- **Backend:**
  - Java
  - Spring Boot
  - Spring Data JPA
  - MySQL

- **Frontend:**
  - HTML
  - CSS
  - Thymeleaf (for rendering server-side templates)

- **Build & Dependency Management:**
  - Maven

## Getting Started

### Prerequisites

- **Java JDK 11 or higher**
- **MySQL Database**
- **Maven**

### Installation

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/yourusername/online-exam-system.git
   ```

2. **Configure the Application:**

   Edit `src/main/resources/application.properties` to match your local MySQL database configuration:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/online_exam_db
   spring.datasource.username=root
   spring.datasource.password=password
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```

3. **Build the Project:**

   Navigate to the project directory and run:

   ```bash
   mvn clean install
   ```

4. **Run the Application:**

   Execute the following command to start the Spring Boot application:

   ```bash
   mvn spring-boot:run
   ```

   The application will be available at [http://localhost:8080](http://localhost:8080).

## Usage

- **Registration:** Navigate to `/register` to create a new account.
- **Login:** Use the `/login` page to authenticate.
- **Exam Creation:** Access `/create_exam` to set up new exams.
- **Taking Exams:** Go to `/exams` to view and take available exams.
- **Results:** Check `/results` for exam results and performance tracking.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request with your changes. Ensure that your code adheres to the project's coding standards and includes appropriate tests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- [Spring Boot](https://spring.io/projects/spring-boot) for the framework
- [Thymeleaf](https://www.thymeleaf.org/) for server-side templates
- [MySQL](https://www.mysql.com/) for the database


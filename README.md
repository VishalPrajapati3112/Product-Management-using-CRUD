## 📦 Product Management CRUD Application

📖 Overview

This is a Spring Boot Product Management CRUD Application developed using Java, Spring Boot, Maven, MySQL, and REST APIs.
The application allows users to add, view, update, and delete products using RESTful web services.
A simple HTML frontend is provided and the backend APIs can also be tested using Postman.

🛠 Technologies Used

Java

Spring Boot

Spring Data JPA

Maven

MySQL

REST API

HTML & JavaScript

Postman

Git & GitHub

📂 Project Structure
Product-Management
│
├── controller
│   └── ProductController.java
│
├── model
│   └── Product.java
│
├── repository
│   └── ProductRepository.java
│
├── service
│   └── ProductService.java
│
├── resources
│   ├── static
│   │   └── index.html
│   └── application.properties
│
└── ProductManagementApplication.java

🧩 Features

Add a new product

View all products

View product by ID

Update product details

Delete a product

REST API based architecture

Simple frontend using HTML & JavaScript

Runs on custom port 9090

🌐 REST API Endpoints
Method	Endpoint	Description
POST	/products	Add a new product
GET	/products	Get all products
GET	/products/{id}	Get product by ID
PUT	/products/{id}	Update product by ID
DELETE	/products/{id}	Delete product by ID
⚙️ Configuration
Server Port

The application runs on port 9090.

server.port=9090

Database Configuration

Create a database in MySQL:

CREATE DATABASE productdb;


Update application.properties with your MySQL credentials.

▶️ How to Run the Project

Clone the repository:

git clone https://github.com/<your-username>/Product-Management.git


Open the project in IntelliJ IDEA

Make sure MySQL is running

Run the application:

mvn spring-boot:run


OR
Run ProductManagementApplication.java directly.

🖥 Access the Application
Frontend (Browser)
http://localhost:9090

Backend (Postman)
http://localhost:9090/products

🧪 Sample JSON for POST Request
{
  "productName": "Laptop",
  "price": 65000
}

🧠 Learning Outcomes

Understanding Spring Boot layered architecture

Creating REST APIs using Spring Boot

Using JPA for database operations

Connecting frontend with backend using Fetch API

Using Postman for API testing

Using Git and GitHub for version control

📌 Future Enhancements

Add input validation

Exception handling with proper HTTP status codes

Authentication & Authorization

UI improvement using CSS / Bootstrap

Swagger API documentation

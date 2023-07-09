# Springboot-Api
# Spring Boot Customer API

This is a simple Spring Boot API that allows you to manage customers. It provides endpoints for adding, removing, and updating customer information.

## Requirements

- Java Development Kit (JDK) 8 or later
- Apache Maven
- PostgreSQL (or any other compatible database)

## Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/spring-boot-customer-api.git

2. Configure the database:
   
  Open the application.properties file located in the src/main/resources directory.
  Update the database connection properties with your PostgreSQL database credentials.

3. Build the application:
   ```bash
   mvn clean package

5. Run the application:
   ```bash
   java -jar target/customer-api.jar
   
7. The API will be accessible at:
   ```bash
   http://localhost:8080.

## API Endpoints
The following endpoints are available for managing customers:

### Add a customer

Endpoint: POST /api/customers
Request body:
```bash
{
  "name": "John Doe",
  "email": "johndoe@example.com",
  "address": "123 Main St"
}
```
Response:

```
{
  "id": 1,
  "name": "John Doe",
  "email": "johndoe@example.com",
  "address": "123 Main St"
}
```

### Get all customers
Endpoint: GET /api/customers
Response:

```bash
[
{
    "id": 1,
    "name": "John Doe",
    "email": "johndoe@example.com",
    "address": "123 Main St"
  },
  {
    "id": 2,
    "name": "Jane Smith",
    "email": "janesmith@example.com",
    "address": "456 Elm St"
  }
]








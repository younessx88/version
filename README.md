
# Order Management System

This is a small Spring Boot project to demonstrate how versioning within entities is isolated and not propagated to different entities. The application uses PostgreSQL as the database.

## Prerequisites

- Docker
- Docker Compose
- Maven

## Getting Started


### Step 1: Build the Application

Ensure you are in the root directory of the project where the `pom.xml` file is located.

```bash
./mvnw clean package
```

### Step 2: Build the Docker Image

```bash
docker build -t order-management-system .
```

### Step 3: Run the Application with Docker Compose

```bash
docker-compose up
```

### Step 5: Access the Application

The application will be running on `http://localhost:8080`.

## API Endpoints

### Orders

- **Create Order**
    - Method: `POST`
    - URL: `/orders`
    - Example Payload:
      ```json
      {
        "orderNumber": "ORD12345",
        "customer": {
          "name": "John Doe",
          "email": "john.doe@example.com"
        },
        "shippingDetails": {
          "address": "123 Main St"
        },
        "orderItems": [
          {
            "productName": "Product 1",
            "quantity": 2
          },
          {
            "productName": "Product 2",
            "quantity": 1
          }
        ]
      }
      ```

- **Update Order**
    - Method: `PUT`
    - URL: `/orders/{id}`
    - Example Payload:
      ```json
      {
        "orderNumber": "ORD54321"
      }
      ```

### Shipping Details

- **Update Shipping Details**
    - Method: `PUT`
    - URL: `/shipping-details/{id}`
    - Example Payload:
      ```json
      {
        "address": "456 Another St"
      }
      ```

### Order Items

- **Update Order Item**
    - Method: `PUT`
    - URL: `/order-items/{id}`
    - Example Payload:
      ```json
      {
        "productName": "Updated Product",
        "quantity": 3
      }
      ```

### Customers

- **Update Customer**
    - Method: `PUT`
    - URL: `/customers/{id}`
    - Example Payload:
      ```json
      {
        "name": "Jane Doe",
        "email": "jane.doe@example.com"
      }
      ```

## Postman Collection

A Postman collection is available inside the `resources` folder for testing the API endpoints. Import the collection into Postman to get started quickly.

## Cleanup

To stop the containers, press `Ctrl+C` in the terminal where `docker-compose up` is running.

To remove the containers, network, and volumes, run:

```bash
docker-compose down
```

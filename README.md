# Product & Order Management System

A backend-only **Product and Order Management System** developed using **Java**, **Spring Boot**, **REST APIs**, **JPA (Hibernate)**, and **SQL**.  
This application provides RESTful APIs to manage products and orders and can be integrated with any frontend or mobile application.

---

## 📌 Project Overview

This project is designed to handle:
- Product management (add, update, delete, view products)
- Order management (place orders, view orders, update order status)

The system follows a **layered architecture** and exposes APIs tested using **Postman**.

---

## 🛠️ Technologies Used

- **Java**
- **Spring Boot**
- **Spring Web (REST APIs)**
- **Spring Data JPA (Hibernate)**
- **SQL Database (MySQL / H2)**
- **Maven**
- **Postman**
- **Git & GitHub**

---

## 🧱 Project Architecture

### Layer Description:
- **Controller**: Handles HTTP requests and responses
- **Service**: Contains business logic
- **Repository**: Handles database operations using JPA
- **Database**: Stores product and order data

---

## 📦 Features

### 🔹 Product Management
- Add a product
- Get all products
- Get product by ID
- Update product
- Delete product

### 🔹 Order Management
- Place an order
- Get all orders
- Get order by ID
- Update order status
- Delete order

---

## 🔌 REST API Endpoints (Sample)

### Product APIs
| Method | Endpoint | Description |
|------|---------|------------|
| POST | `/products` | Add product |
| GET | `/products` | Get all products |
| GET | `/products/{id}` | Get product by ID |
| PUT | `/products/{id}` | Update product |
| DELETE | `/products/{id}` | Delete product |

### Order APIs
| Method | Endpoint | Description |
|------|---------|------------|
| POST | `/orders` | Place order |
| GET | `/orders` | Get all orders |
| GET | `/orders/{id}` | Get order by ID |
| PUT | `/orders/{id}` | Update order status |
| DELETE | `/orders/{id}` | Delete order |

---

## 🗄️ Database Design (Basic)

### Product Table
- id
- name
- price
- quantity

### Order Table
- id
- orderDate
- totalAmount
- status

---


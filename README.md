# 📧 Newsletter & Email Campaign Manager API

A secure and scalable backend API for managing mailing lists, creating email campaigns, and scheduling simulated email sends.  
Built with **Java 25**, **Spring Boot**, and modern security standards, this project is designed to streamline newsletter and campaign workflows.

---

## 🚀 Features

- 🔐 JWT Authentication & BCrypt password encryption  
- 📋 Mailing list creation & subscriber management  
- 📝 Campaign creation, scheduling, and sending (mocked)  
- 🔎 Query campaigns with pagination & filters  
- 👑 Admin endpoints for user management  

---

## 🔨 Tech Stack

| Layer        | Technology |
|--------------|------------|
| Backend      | Java 25, Spring Boot, Maven |
| Security     | Spring Security, JWT, BCrypt |
| Database     | MongoDB, Spring Data JPA + Hibernate ODM |
| API & Docs   | REST APIs, Swagger, Postman |

---

## 📂 Project Structure

```
TrueReach/
├── src/
│   ├── main/
│   │   ├── java/com/example/newsletter
│   │   │   ├── config/       # Configuration classes
│   │   │   ├── controller/   # REST controllers
│   │   │   ├── dto/          # Data Transfer Objects
│   │   │   ├── impl/         # Service implementations
│   │   │   ├── model/        # Entity and domain models
│   │   │   ├── repo/         # Repository interfaces
│   │   │   ├── service/      # Service interfaces
│   │   └── resources/
│   │       ├── application.properties
├── test/
└── README.md
```

---

## ⚡ Getting Started

### Prerequisites
- Java 17+  
- Maven 3+  
- MongoDB installed  

### Installation
```bash
# Clone repository
git clone https://github.com/Soumyajit173/TrueReach.git

# Navigate to project
cd TrueReach

# Build project
mvn clean install

# Run application
mvn spring-boot:run
```

### API Documentation
Once the server is running, access Swagger UI at:  
```
http://localhost:8080/swagger-ui.html
```

---

## 📡 API Endpoints

### 🔐 Auth
**Login**  
`POST /api/v1/auth/login`  
```json
{
  "email": "admin@a.org",
  "password": "admin"
}
```

---

### 🌐 Public APIs
**Health Check**  
`GET /api/v1/public/health`

**Register User**  
`POST /api/v1/public/users`  
```json
{
  "name": "testuser",
  "password": "123456",
  "email": "test@t.in"
}
```

---

### 👤 Users
**Get Current User**  
`GET /api/v1/users/me`

**Update User**  
`PUT /api/v1/users/me`  
```json
{
  "name": "updatedUser",
  "password": "newpassword"
}
```

**Delete User**  
`DELETE /api/v1/users/me`

---

### 📋 Mailing Lists
**Create Mailing List**  
`POST /api/v1/mailing-lists?name=AdminList`

**Get Mailing Lists**  
`GET /api/v1/mailing-lists`

**Add Subscriber**  
`POST /api/v1/mailing-lists/{listId}/subscribers`  
```json
{
  "email": "test@example.com",
  "name": "John Doe"
}
```

**Remove Subscriber**  
`DELETE /api/v1/mailing-lists/{listId}/subscribers?email=test@example.com`

---

### 📝 Campaigns
**Create Campaign**  
`POST /api/v1/campaigns`  
```json
{
  "name": "Spring Sale Campaign",
  "subject": "Huge Discounts Await!",
  "content": "Hello users, enjoy offers.",
  "mailingListId": "{{listId}}",
  "status": "DRAFT"
}
```

**Get All Campaigns (Paginated)**  
`GET /api/v1/campaigns?page=0&size=5`

**Get Campaign By ID**  
`GET /api/v1/campaigns/{campaignId}`

**Send Campaign (Mocked)**  
`POST /api/v1/campaigns/{campaignId}/send`

**Schedule Campaign**  
`POST /api/v1/campaigns/{campaignId}/schedule?time=2026-04-15T10:00:00`

**Filter Campaigns By Status**  
`GET /api/v1/campaigns?status=SCHEDULED&page=0&size=5`

---

### 👑 Admin
**Get All Users**  
`GET /api/v1/admin/users`

**Create Admin User**  
`POST /api/v1/admin`  
```json
{
  "name": "AdminUser",
  "password": "admin",
  "email": "admin@a.org"
}
```

---

## 🔒 Security Highlights
- JWT-based authentication for secure API access  
- BCrypt password hashing for strong protection  
- Role-based access control with Spring Security  

---

## 📌 Notes
- Email sending is **simulated via logs** (no real email integration).  
- Tech stack entries are customizable based on project needs.  

---

## 🤝 Contributors
This project is solely developed by **Soumyajit**, demonstrating strong expertise and commitment to building a secure, scalable, and maintainable newsletter and email campaign API.

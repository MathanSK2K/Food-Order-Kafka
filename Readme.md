# 🍔 Food Order Processing System (Apache Kafka – KRaft Mode)

A **Spring Boot–based event-driven system** using **Apache Kafka (KRaft mode)** to demonstrate
producer–consumer communication, REST APIs, scheduled processing, Dockerized infrastructure,
and cloud deployment on AWS.
 
> * Kafka runs in **KRaft mode**  
> * **Kafka UI** included for monitoring topics and consumer groups

---

## 📌 Project Overview

This project simulates a simple food ordering workflow:

- A **Producer service** generates food orders via REST API or scheduler
- Orders are published to a Kafka topic
- A **Consumer service** consumes, processes, and logs the orders
- Kafka runs in Docker using **KRaft + Kafka UI**
- Services are deployed on **AWS EC2**

---

## 🏗️ Architecture

Client (REST / Scheduler)
→ Producer Service
→ Kafka (food-orders topic)
→ Consumer Service
→ Order Processing / Logs


---

## 🧰 Tech Stack

- **Java 21**
- **Spring Boot**
- **Spring Kafka**
- **Apache Kafka (KRaft mode)**
- **Kafka UI**
- **Docker & Docker Compose**
- **Maven**
- **AWS EC2 (Ubuntu)**

---

## 📂 Repository Structure
- Food-Order-Kafka/
- │
- ├── docker-compose.yaml
- │
- ├── producer/
- │ ├── src/main/java
- │ ├── src/main/resources/application.yml
- │ └── pom.xml
- │
- ├── consumer/
- │ ├── src/main/java
- │ ├── src/main/resources/application.yml
- │ └── pom.xml
- │
- └── README.md

---

## ☁️ AWS Deployment

- Deployed on AWS EC2 (Ubuntu)

- Kafka & Kafka UI run in Docker containers

- Producer and Consumer run as Spring Boot applications

- Docker configured for non-root usage

---

## 👤 Author

**Mathan Kumar Sekar**

Java | Spring Boot | Apache Kafka | Docker | AWS


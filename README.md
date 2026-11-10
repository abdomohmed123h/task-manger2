# Task Manager

A task management application: create, view, update, and delete tasks.
This is the first version (v1.0).

## Features
- Create, update, and delete tasks
- Mark tasks as completed
- REST API built with Spring Boot
- Docker Compose setup for the UI

## Tech Stack
- Java + Spring Boot (backend, port 7071)
- Docker / Docker Compose (UI on port 3000)

## Getting Started

### Prerequisites
- JDK 17+
- Docker Desktop

### Run the backend
```bash
./mvnw spring-boot:run
```

### Run the UI
```bash
docker compose up -d
```
Then open http://localhost:3000

## Roadmap
- Authentication
- Task priorities and due dates
- Tests and CI

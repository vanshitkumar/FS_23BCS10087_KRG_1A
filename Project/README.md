# QuizMaster – Full Stack Project
A full-stack quiz app built using Spring Boot (backend) and React.js (frontend). It allows users to take category-based quizzes, view scores instantly, and provides admin controls to manage questions and categories.

## Author
- Vanshit Kumar
- UID: 23BCS10087
- Section: KRG_1A

## Project Structure
project/<br/>
├─ frontend-react/<br/>
├─ backend-springboot/

## Features
### User Features
- Attempt quizzes by category
- Navigate between questions freely
- Instant score calculation after submission

### Admin Features
- Add, update, and delete quiz questions
- Create and manage categories
- View all quizzes and question details

## Tech Stack
- Frontend: React.js, HTML, CSS, JavaScript
- Backend: Spring Boot, Java, REST API
- Database: MySQL
- Build Tools: Maven (backend), npm (frontend)
- Version Control: Git & GitHub

## How to Run Locally

### Backend
```bash
cd backend
sudo service mariadb start   # Start Mysql server
# Make sure database configurations in application.properties are correct
mvn spring-boot:run
```
Server will start at:
http://localhost:8080

### Frontend
```bash
cd frontend
npm install
npm run dev
```

Frontend server runs on:
http://localhost:3000

## Key Functionalities
- RESTful API communication between backend and frontend
- Dynamic rendering of quiz data
- Real-time result calculation
- Modular and scalable architecture

## Working Screenshots
### Home Page
![Home Page](working-screenshots/home-page.png)
### Quiz Taking Interface
![Quiz Interface](working-screenshots/giving-assessments.png)
### Question Management
![Question Management](working-screenshots/question-management.png)
### Assessments Overview
![Assessments Overview](working-screenshots/assessments-page.png)
### Question creation/edition
![Question Creation/Edition](working-screenshots/editing-question.png)
### Instant Results
![Instant Results](working-screenshots/instant-results.png)

[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/NyU_7VRM)

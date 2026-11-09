# CampusEvents

## 1. Présentation du projet

CampusEvents est une plateforme web destinée à centraliser
les événements organisés par les clubs d'une université.

Elle permet aux étudiants de découvrir les événements,
de s'inscrire et de consulter leurs billets.

Elle permet également aux responsables de clubs de gérer
les événements et de réserver des salles.

## 2. Problématique

Comment offrir un point d'entrée unique pour publier,
découvrir et suivre les événements d'un campus, tout en
gérant les salles, les inscriptions et les notifications ?

## 3. Fonctionnalités principales

- Gestion des comptes avec Keycloak.
- Gestion des clubs et des adhésions.
- Gestion des salles et des réservations.
- Publication et gestion des événements.
- Inscriptions et billets QR.
- Notifications par e-mail et dans l'application.
- Recommandations d'événements avec Machine Learning.
- Prévision de fréquentation.

## 4. Architecture technique

### Front-end
- Angular

### Back-end
- Spring Boot
- Java 17
- Python / FastAPI pour ml-service

### Infrastructure
- Docker
- Docker Compose
- Keycloak
- PostgreSQL
- Spring Cloud Gateway
- Eureka

### Communication
- REST API
- OpenFeign
- Apache Kafka

### Bases de données
- H2
- MySQL
- MongoDB
- PostgreSQL

## 5. Microservices

| Microservice | Responsabilité |
|---|---|
| venue-service | Gestion des salles |
| club-service | Gestion des clubs |
| event-service | Gestion des événements |
| registration-service | Inscriptions et billets |
| ml-service | Intelligence artificielle |
| notification-service | Notifications |

## 6. Équipe

- Étudiant 1 : venue-service
- Étudiant 2 : club-service
- Étudiant 3 : event-service
- Étudiant 4 : registration-service

## 7. Installation

Cloner le projet :

```bash
git clone https://github.com/hjsad00/CampusEvents.git
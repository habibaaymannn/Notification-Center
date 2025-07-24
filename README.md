# Notification Center

A modular Spring Boot application for sending notifications via different channels (e.g., WhatsApp, Email, SMS). 
It follows the **Strategy Design Pattern** and adheres to **SOLID principles** for scalability and maintainability.

---

## Tech Stack

- Java 21
- Spring Boot
- Apache Kafka
- PostgreSQL
- JPA/Hibernate
- Docker Compose

---

##  Architecture

- `Notification`: JPA entity representing a notification record.
- `NotificationInterface`: Strategy interface for various notification types.
- `WhatsAppNotification`, `EmailNotification`, etc.: Concrete implementations of the strategy.
- `NotificationStrategy`: Dynamically selects the correct notification handler at runtime.
- `NotificationService`: Business logic to send the notification.
- `NotificationController`: REST controller to receive requests.

---

## Design Highlights

- **Strategy Pattern** to handle multiple notification channels.
- **Dependency Injection** for decoupling and flexibility.
- **Open/Closed Principle**: Easily extendable for new notification types.
- **Single Responsibility**: Each class does one thing only.

---

## Running the App

### 1. Clone the Repository
```bash
git clone https://github.com/your-username/notification-center.git
cd notification-center

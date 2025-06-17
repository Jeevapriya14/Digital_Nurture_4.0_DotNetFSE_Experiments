# Dependency Injection Pattern Example

## Aim
To implement the Dependency Injection (DI) pattern in Java by developing a simple customer management application where the service class depends on a repository interface. The actual implementation is injected using constructor-based dependency injection to promote loose coupling and testability.

## Objective
- To understand and apply the Dependency Injection design pattern.
- To separate service logic from data access logic.
- To inject dependencies through constructors to avoid tight coupling.
- To improve the scalability, testability, and maintainability of the codebase.

## Definition of Dependency Injection Pattern
The Dependency Injection Pattern is a **design principle** and a key technique of **Inversion of Control (IoC)** where objects receive their dependencies from external sources rather than creating them internally. It helps decouple the components and makes the system easier to manage and test.

---

## Project Structure
- `Customer` (Model): Represents customer data with attributes like id and name.
- `CustomerRepository` (Interface): Declares data access methods such as `findCustomerById()`.
- `CustomerRepositoryImpl` (Concrete Repository): Implements data access logic for customers.
- `CustomerService` (Service): Depends on `CustomerRepository` and handles business logic, injected via constructor.
- `Main` (Test Class): Demonstrates creating and using the service with dependency injection.

---

## How to Run

1. Open your terminal in the project directory.

2. Compile all `.java` files:
   ```bash
   javac *.java
3. Run main class:
   ```bash
   java Main.java

## OUTPUT:

![image](https://github.com/user-attachments/assets/96fbb104-7196-4dc5-b4b6-45341e9a61fd)
![image](https://github.com/user-attachments/assets/a52fbac2-2758-45a6-bdd3-70f57a173b2e)


# Observer Pattern Example

## Aim
To implement the Observer Design Pattern in Java by developing a stock market monitoring application where multiple clients (observers) are automatically notified whenever stock prices change.

## Objective
- To understand and apply the Observer Design Pattern.
- To implement a one-to-many relationship between a subject and multiple observers.
- To ensure all observers stay updated with real-time changes in the subject.
- To promote loose coupling between objects.

## Definition of Observer Pattern
The Observer Pattern is a **behavioral design pattern** that defines a one-to-many dependency between objects. When the **subject** changes state, **all its observers are notified and updated automatically**. This pattern is widely used in event-driven systems, such as GUIs, stock tickers, or real-time messaging apps.

---

## Project Structure

- `Stock` (Subject Interface): Declares methods to register, remove, and notify observers.
- `StockMarket` (Concrete Subject): Maintains a list of observers and notifies them when stock data changes.
- `Observer` (Observer Interface): Declares the `update()` method.
- `MobileApp` (Concrete Observer): Represents a mobile client that receives stock updates.
- `WebApp` (Concrete Observer): Represents a web client that receives stock updates.
- `Main` (Client Class): Demonstrates the registration, update, and removal of observers.

---

## How to Run

1. **Open your terminal and navigate to the project folder.**

2. **Compile all Java files:**
   ```bash
   javac *.java
3. **Run main class:**
   ```bash
   java Main.java

## OUTPUT:

![image](https://github.com/user-attachments/assets/87e24650-a5c9-4fb6-ae71-086aea2a557d)
![image](https://github.com/user-attachments/assets/80aa4e82-988e-481d-bd60-4a55ff9b181f)



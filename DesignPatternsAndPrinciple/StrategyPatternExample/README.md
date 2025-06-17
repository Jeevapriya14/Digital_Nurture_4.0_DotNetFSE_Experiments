# Strategy Pattern Example

## Aim
To implement the Strategy Design Pattern in Java by creating a payment system where different payment methods (e.g., Credit Card, PayPal) can be selected dynamically at runtime. This pattern promotes flexibility by allowing the algorithm (payment method) to be selected at runtime without modifying the client code.

## Objective
- To understand and apply the Strategy Design Pattern.
- To encapsulate multiple algorithms (payment methods) within a family of interchangeable classes.
- To allow selection of the algorithm at runtime based on context.
- To reduce coupling between the client and algorithm implementations.

## Definition of Strategy Pattern
The Strategy Pattern is a **behavioral design pattern** that enables selecting an algorithm’s behavior at runtime. It defines a family of algorithms, encapsulates each one, and makes them interchangeable. This pattern lets the algorithm vary independently from the clients that use it.

---

## Project Structure

- `PaymentStrategy` (Interface): Defines the `pay()` method for all payment strategies.
- `CreditCardPayment` (Concrete Strategy): Implements payment using a credit card.
- `PayPalPayment` (Concrete Strategy): Implements payment using PayPal.
- `PaymentContext` (Context Class): Uses a `PaymentStrategy` to process a payment.
- `Main` (Client Class): Demonstrates selecting and using different payment strategies at runtime.

---

## How to Run

1. **Open your terminal and navigate to the project folder.**

2. **Compile all Java files:**
   ```bash
   javac *.java
3. **Run the main class:**
   ```bash
   java Main.java

## OUTPUT:
![image](https://github.com/user-attachments/assets/00679779-df96-4e44-83e8-40f4c5ff3217)
![image](https://github.com/user-attachments/assets/6e4ef577-eb8d-480b-9fba-67440ad21c31)


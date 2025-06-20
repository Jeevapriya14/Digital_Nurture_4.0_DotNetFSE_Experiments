<<<<<<< HEAD:Week_1_DesignPatternsAndPrinciple/AdapterPatternExample/README.md
# Adapter Pattern Example

## Aim
To implement the Adapter Design Pattern in Java for a payment processing system that integrates multiple third-party payment gateways with different interfaces using a common adapter interface.

## Objective
- To understand and apply the Adapter Pattern.
- To create a target interface for payment processing.
- To implement multiple payment gateway classes with incompatible interfaces.
- To design adapter classes to bridge the gap between the target interface and the adaptees.
- To demonstrate how the Adapter Pattern enables the integration of incompatible APIs with minimal code changes.

## Definition of Adapter Pattern
The Adapter Pattern is a structural design pattern that allows objects with incompatible interfaces to work together. It acts as a bridge between the client and the adaptee by translating method calls in one interface into method calls in another.

---

## Project Structure
- `PaymentProcessor` (Interface): Target interface that defines `processPayment()`.
- Adaptee Classes:
  - `PayPalGateway`: Uses `makePayment()`.
  - `StripeGateway`: Uses `executePayment()`.
- Adapter Classes:
  - `PayPalAdapter`: Implements `PaymentProcessor` and calls `makePayment()` of `PayPalGateway`.
  - `StripeAdapter`: Implements `PaymentProcessor` and calls `executePayment()` of `StripeGateway`.
- `Main` (Test Class): Demonstrates using both adapters through a common interface.

---

## How to Run

1. Open terminal in the project directory.

2. Compile all `.java` files:
   ```bash
   javac *.java
2. Run the main class:
   ```bash
   java Main.java

## OUTPUT:
![image](https://github.com/user-attachments/assets/e7146caa-42ea-4de6-b7e4-007e148fbd88)
![image](https://github.com/user-attachments/assets/210f85a5-f8c2-4db9-a785-f72192fc6ba1)


=======
# Adapter Pattern Example

## Aim
To implement the Adapter Design Pattern in Java for a payment processing system that integrates multiple third-party payment gateways with different interfaces using a common adapter interface.

## Objective
- To understand and apply the Adapter Pattern.
- To create a target interface for payment processing.
- To implement multiple payment gateway classes with incompatible interfaces.
- To design adapter classes to bridge the gap between the target interface and the adaptees.
- To demonstrate how the Adapter Pattern enables the integration of incompatible APIs with minimal code changes.

## Definition of Adapter Pattern
The Adapter Pattern is a structural design pattern that allows objects with incompatible interfaces to work together. It acts as a bridge between the client and the adaptee by translating method calls in one interface into method calls in another.

---

## Project Structure
- `PaymentProcessor` (Interface): Target interface that defines `processPayment()`.
- Adaptee Classes:
  - `PayPalGateway`: Uses `makePayment()`.
  - `StripeGateway`: Uses `executePayment()`.
- Adapter Classes:
  - `PayPalAdapter`: Implements `PaymentProcessor` and calls `makePayment()` of `PayPalGateway`.
  - `StripeAdapter`: Implements `PaymentProcessor` and calls `executePayment()` of `StripeGateway`.
- `Main` (Test Class): Demonstrates using both adapters through a common interface.

---

## How to Run

1. Open terminal in the project directory.


2. Run the main class:
   ```bash
   dotnet run

## OUTPUT:
![image](https://github.com/user-attachments/assets/62c3776e-0942-4969-8241-0f48b1d92c38)

![image](https://github.com/user-attachments/assets/635d8f5d-dfd1-4d0a-91da-eb2a0a206f68)



>>>>>>> ba24aa6588ba5ec8105115660b3b238f843fb92b:DesignPatternsAndPrinciple/AdapterPatternExample/README.md

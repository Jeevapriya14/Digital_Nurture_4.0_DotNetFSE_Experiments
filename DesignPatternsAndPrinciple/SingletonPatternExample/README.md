# Singleton Pattern Example

## Aim
To implement the Singleton Design Pattern in Java by creating a logging utility that ensures only one instance of the logger exists throughout the application lifecycle, providing a global point of access to consistent logging.

## Objective
- To understand and apply the Singleton Design Pattern.
- To ensure that a class has only one instance and provides a global point of access to it.
- To demonstrate how Singleton helps in maintaining a shared state across the application.
- To show how thread-safe Singleton can be implemented in Java.

## Definition of Singleton Pattern
The Singleton Pattern is a **creational design pattern** that restricts the instantiation of a class to one object and provides a global point of access to it. It ensures that a class has only one instance and controls access to it.

---

## Project Structure
- `Logger` (Singleton Class): 
  - Has a private static instance of itself.
  - Private constructor to restrict object creation.
  - Public static method `getInstance()` to access the single instance.
- `Main` (Client Class): 
  - Demonstrates that multiple calls to `getInstance()` return the same instance.

---

## How to Run

1. **Open your terminal and navigate to the project folder.**

2. **Compile the Java files:**
   ```bash
   javac Logger.java Main.java
3. Run the Main class:
   ```bash
   java Main.java

## OUTPUT:

![image](https://github.com/user-attachments/assets/288e68a6-174f-4829-a415-d2f5fe6e3da2)
![image](https://github.com/user-attachments/assets/0c945975-1139-441c-8ebf-bc87f41e53a3)



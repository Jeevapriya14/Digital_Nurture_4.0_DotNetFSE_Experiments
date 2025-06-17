# Command Pattern Example

## Aim
To implement the Command Design Pattern in Java by developing a home automation system where commands like turning lights on or off can be issued through a remote control interface.

## Objective
- To understand and apply the Command Design Pattern.
- To encapsulate requests as objects, allowing parameterization of clients with queues, logs, and undo operations.
- To decouple the object that invokes the operation (Invoker) from the one that knows how to perform it (Receiver).

## Definition of Command Pattern
The Command Pattern is a **behavioral design pattern** that turns a request into a stand-alone object containing all the information about the request. This allows you to parameterize methods with different requests, delay execution of a request, or queue a request for later execution.

---

## Project Structure

- `Command` (Interface): Declares the `execute()` method for all commands.
- `Light` (Receiver): Has methods to `turnOn()` and `turnOff()` the light.
- `LightOnCommand`, `LightOffCommand` (Concrete Commands): Implement the `Command` interface and invoke actions on the `Light` receiver.
- `RemoteControl` (Invoker): Holds and executes a command when a button is pressed.
- `Main` (Client): Demonstrates how to issue commands using the `RemoteControl`.

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

![image](https://github.com/user-attachments/assets/564e471c-2bd0-4c0a-b6ee-7362070cf4ec)
![image](https://github.com/user-attachments/assets/e584b38a-7522-4727-bf2d-ab6dc7c25f7d)



# MVC Pattern Example

## Aim
To implement the Model-View-Controller (MVC) architectural pattern in Java by developing a simple student management application that separates data, user interface, and control logic for better modularity and maintainability.

## Objective
- To understand and apply the MVC design pattern.
- To separate the application into Model, View, and Controller components.
- To demonstrate how changes in the model are reflected in the view through the controller.
- To improve code organization, scalability, and testability.

## Definition of MVC Pattern
The MVC Pattern is a **software architectural pattern** that divides an application into three interconnected components:
- **Model**: Manages the data and business logic.
- **View**: Presents data to the user.
- **Controller**: Handles input and updates the model and view.

This separation allows independent development and maintenance of each component.

---

## Project Structure
- `Student` (Model): Contains student data attributes and getter/setter methods.
- `StudentView` (View): Responsible for displaying student information.
- `StudentController` (Controller): Acts as the intermediary between Model and View, updating and retrieving data.
- `Main` (Test Class): Demonstrates creating, updating, and displaying student data using MVC.

---

## How to Run

1. Open terminal in the project directory.

2. Compile all `.java` files:
   ```bash
   javac *.java
3. Run main class:
   ```bash
   java Main.java

## OUTPUT:
![image](https://github.com/user-attachments/assets/4beb8a97-4229-4121-887c-2eb78032ae4a)
![image](https://github.com/user-attachments/assets/c428694e-0c13-49fa-8684-7d229595e5b5)


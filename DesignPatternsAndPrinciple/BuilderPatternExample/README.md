# Builder Pattern Example

## Aim
To implement the Builder Design Pattern in Java by creating a meal ordering system where a complex object (Meal) is constructed step-by-step using a builder, allowing flexibility in the construction process and ensuring immutability of the final object.

## Objective
- To understand and apply the Builder Design Pattern.
- To separate the construction of a complex object from its representation.
- To allow the same construction process to create different representations.
- To make object construction more readable and maintainable, especially for objects with many optional parameters.

## Definition of Builder Pattern
The Builder Pattern is a **creational design pattern** that lets you construct complex objects step by step. It allows you to create different types and representations of an object using the same construction process. It helps avoid the telescoping constructor anti-pattern and promotes a more readable object creation process.

---

## Project Structure
- `Meal` (Product Class): Contains properties like burger, drink, dessert, etc.
- `MealBuilder` (Interface): Declares methods to build parts of the product.
- `VegMealBuilder`, `NonVegMealBuilder` (Concrete Builders): Implement the steps defined in `MealBuilder`.
- `MealDirector` (Director Class): Constructs a meal using the builder.
- `Main` (Client Class): Demonstrates usage of the builder pattern.

---

## How to Run

1. **Open your terminal and navigate to the project folder.**

2. **Compile all Java files:**
   ```bash
   javac *.java
3. **Run the Main class:**
   ```bash
   java Main.java

## OUTPUT:

![BUILDER PATTERN EXAMPLE OUTPUT](https://github.com/user-attachments/assets/d0246ccb-bca3-4a46-991c-d3c4ed562325)


![image](https://github.com/user-attachments/assets/68caa4e6-7b99-4d36-b6c1-c8267cd7edd7)





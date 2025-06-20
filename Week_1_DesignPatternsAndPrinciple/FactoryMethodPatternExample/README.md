# Factory Method Pattern Example

## Aim
To implement the Factory Method Design Pattern in Java by creating a document management system that can generate different types of documents such as Word, PDF, and Excel, providing a flexible and extensible way to create objects without specifying their concrete classes.

## Objective
- To understand and apply the Factory Method Pattern.
- To create an abstract factory for creating document objects.
- To implement concrete factories for specific document types.
- To demonstrate how the Factory Method pattern promotes loose coupling and scalability in object creation.
- To enable easy addition of new document types without modifying existing code.

## Definition of Factory Method Pattern
The Factory Method Pattern is a creational design pattern that defines an interface for creating an object, but lets subclasses decide which class to instantiate. It allows a class to defer instantiation to subclasses, promoting loose coupling by eliminating the need to bind application-specific classes into the code.

---

## Project Structure
- `Document` (Interface): Declares the method(s) for document types.
- Concrete Document Classes: `WordDocument`, `PdfDocument`, `ExcelDocument` implement `Document`.
- `DocumentFactory` (Abstract class): Declares the factory method `createDocument()`.
- Concrete Factory Classes: `WordDocumentFactory`, `PdfDocumentFactory`, `ExcelDocumentFactory` extend `DocumentFactory` and implement `createDocument()`.

---

## How to Run
1. Compile all Java files:
   ```bash
   javac *.java

2. Run the Main class:
   ```bash
   java Main.java

## OUTPUT:
![image](https://github.com/user-attachments/assets/ce21ddfd-5d0c-4b53-b4af-b73733a2c6b2)
![image](https://github.com/user-attachments/assets/f78444cc-919d-44a3-90bb-a2ca778aa5e9)




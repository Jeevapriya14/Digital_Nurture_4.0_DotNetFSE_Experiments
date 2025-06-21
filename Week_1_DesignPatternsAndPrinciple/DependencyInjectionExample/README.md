# Dependency Injection Example in C#

## Aim
To demonstrate **Dependency Injection (DI)** in C# by decoupling a service from its dependency using interfaces and constructor-based injection. This allows for greater flexibility, testability, and adherence to SOLID principles.

---

## Objective
- ✅ Understand how Dependency Injection promotes loose coupling.
- ✅ Use interfaces to abstract implementation.
- ✅ Inject dependencies through constructors.
- ✅ Display customer information using a service that depends on a repository.

---

## Definition of Dependency Injection
> **Dependency Injection (DI)** is a design pattern that allows a class to receive its dependencies from an external source rather than creating them internally. This enables better code modularity, reusability, and easier unit testing.

---

## 📁 Project Structure

- `ICustomerRepository.cs` — Interface for data access  
- `CustomerRepositoryImpl.cs` — Concrete implementation  
- `Customer.cs` — Data model  
- `CustomerService.cs` — Service that uses the repository  
- `Program.cs` — Entry point using DI  

---

## How to Run

### 1. Open terminal in the project directory

```bash
cd DependencyInjectionExample


## 2.Run main file:

```bash
dotnet run

### Output:
![image](https://github.com/user-attachments/assets/2f709693-7926-42cd-a8e3-0976607a9ca4)


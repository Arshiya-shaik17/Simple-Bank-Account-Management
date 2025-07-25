# Bank Account Management System

A Java console-based application that demonstrates the concept of **inheritance** in Object-Oriented Programming (OOP) through various types of bank accounts. The project simulates basic banking operations such as deposit, withdrawal, interest calculation, and maturity value computation.

## Overview

This project focuses on implementing **inheritance** in Java. A base class `BankAccount` defines shared attributes and methods, while three subclasses — `SavingsAccount`, `CheckingAccount`, and `FDAccount` — inherit and extend its behavior to model specific account types.

## Features

- Deposit and withdrawal functionality in the base `BankAccount` class
- `SavingsAccount` subclass adds interest to the balance
- `CheckingAccount` subclass includes overdraft handling
- `FDAccount` subclass calculates maturity value based on term and interest rate
- Account balance and transaction feedback displayed to the user

## Concept Demonstrated

- **Inheritance**: Code reusability and extension through subclassing a base class

## Technologies Used

- Java (JDK 17 or higher)
- Console-based I/O using `System.out` and `Scanner`

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/bank-account-management.git
2. Navigate to the project directory and compile the main file:
    ```bash
      javac BankAccountManagement.java
3.  Run the application:
    ```bash
    java BankAccountManagement
## Sample Output

<img width="488" height="210" alt="BAM" src="https://github.com/user-attachments/assets/51907827-1725-41dc-b4db-49a65fdcc783" />

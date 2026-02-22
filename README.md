ATM Banking Simulation (Java, OOP-Based)
 Overview:
This project is a console-based ATM banking simulation built using Java. The primary objective is to demonstrate fundamental Object-Oriented Programming (OOP) principles such as abstraction,inheritance,and polymorphism through a simple interactive banking system.
Rather than replicating real-world banking complexity, the system focuses on clean structural design and core programming concepts.
-----------------------------------
 Objectives
1. Practice Object-Oriented Design
2. Understand abstraction via abstract classes
3. Demonstrate inheritance across multiple bank implementations
4. Showcase runtime polymorphism
5. Simulate user-driven banking operations.
------------------------------
 System Design
The application is structured around an abstract base class:
ATM (Abstract Class)
Defines the common contract for all banking operations:
1. Withdraw (Savings / Current)
2. Deposit
3. Balance Inquiry
Concrete bank classes extend this abstraction:
1. HDFC
2. ICICI
3. SBI
Each bank provides its own balance management logic.
------------------------------
OOP Concepts Demonstrated
Abstraction
The `ATM` class hides implementation details while enforcing a consistent interface.
Inheritance
Bank classes reuse shared structure and behavior by extending the `ATM` class.
Polymorphism
A single reference (`ATM a`) dynamically binds to different bank objects at runtime.
-----------------------------
Features
1.Menu-driven console interface
2. Savings & Current account support
3. Withdraw & Deposit operations
4. Balance checking
5. PIN validation
6.Account number verification
7.Balance sufficiency checks
---------------------------------
Functional Flow:
1. User selects a bank
2. User authenticates (PIN / Account Number)
3. User performs operations:

   3.1. Withdraw
   3.2. Deposit
   3.3. Check Balance
4. System updates balances accordingly
------------------------------ 
Current Limitations (Learning-Focused)
1. No persistent storage (Note:balances reset on restart.)
2. Hardcoded credentials
3. Repetitive validation logic
4. Basic console UI
-------------------------------
Possible Enhancements:
1. Database or file persistence
2. Centralized validation utilities
3. Exception handling
4. Cleaner separation of concerns
5. GUI / Web interface
---------------------------------------
Sample Console Interaction:
Below are example screenshots of how the application behaves in the console:
Gaurav, Welcome to ATM Bank Service.
1. HDFC
2. ICICI
3. SBI
4. Exit
Please select your option.
> 1
Welcome to HDFC ATM application
1. Withdraw
2. Check Balance
3. Deposit
4. Exit
Select your option
> 2
1. Savings
2. Current
> 1
Enter your 4-digit pin
> 1234
Your balance is 43000.0
Enter the amount to withdraw
> 5000
You have successfully withdrawal 5000.0
Do you want to display your Updated Balance [Y/N]
> Y
Your balance is 38000.0
----------------------------
How to Run
Compile and execute using any Java compiler:
javac ATMMain.java
java ATMMain
-------------------------
Project Structure:
ATM (Abstract Class)
 ├── HDFC
 ├── ICICI
 ├── SBI
 └── ATMMain (Entry Point)
-------------------------
Sequence Diagram:
sequenceDiagram
    participant User
    participant ATMMain
    participant Bank (ATM Reference)

    User->>ATMMain: Select Bank Option
    ATMMain->>Bank (ATM Reference): Instantiate Bank Object

    User->>ATMMain: Enter Operation Choice
    ATMMain->>User: Request PIN / Account Validation

    User->>ATMMain: Provide Credentials
    ATMMain->>ATMMain: Validate Input

    ATMMain->>Bank (ATM Reference): Invoke Banking Operation
    Bank (ATM Reference)-->>ATMMain: Return Updated Balance / Status

    ATMMain-->>User: Display Result

 UML Class Diagram:
classDiagram
    class ATM {
        <<abstract>>
        +withdrawSavings(amount)
        +withdrawCurrent(amount)
        +checkSavingsBalance()
        +checkCurrentBalance()
        +depositSavings(amount)
    }
    class HDFC {
        -savings_balance
        -current_balance
    }
    class ICICI {
        -savings_balance
        -current_balance
    }
    class SBI {
        -savings_balance
        -current_balance
    }
    ATM <|-- HDFC
    ATM <|-- ICICI
    ATM <|-- SBI

Learning Outcomes:
This project helps reinforce,
1.OOP fundamentals
2.Runtime method binding
3.State management
4. Console-based interaction design

License
This project is intended for educational purposes.
------------------------------
Author:Gaurav Kumar
Happy Coading!

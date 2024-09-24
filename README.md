**Mars Rover Simulation**

Table of Contents
- Project Overview
- Technologies
- Installation
- Usage
- Code Structure
- Design Patterns

**Project Overview**

- The Mars Rover Simulation is a simple Java application that simulates a rover navigating a grid on Mars. The rover can move forward, turn left, turn right, and detect obstacles. This project demonstrates the use of several design patterns, including the Command Pattern and Singleton Pattern.

**Technologies**

- Java (version 8 or higher)

**Installation**

- Step 1: Clone the Repository

    To get started with the project, clone the repository using the following command:

    git clone https://github.com/Harshitn24/EI_Task.git

- Step 2: Navigate to the Project Directory

    cd Exercise-2

Step 3: Compile the Java Files

    Compile the Java files using the following command:

    javac *.java

Step 4: Run the Program

    To run the simulation, execute the following command:

    java MarsRoverSimulation


**Usage**

- Once the program is running, the rover will execute a series of commands to move forward, turn, and display its position. You can modify the commands or grid configuration directly in the `MarsRoverSimulation.java` file.

**Code Structure**

Here is a brief explanation of the main classes:

1. Rover.java: 
   - Controls the rover's position and direction on the grid.
   - Provides methods for moving forward and turning.
   
2. Grid.java:
   - Implements the grid where the rover navigates.
   - Contains the grid size and obstacle information.
   - Implements the Singleton pattern to ensure only one grid instance is created.

3. Command Interface:
   - Encapsulates actions performed by the rover.
   - Implements the Command design pattern, making the program flexible for adding new actions in the future.

4. Concrete Commands:
   - MoveForwardCommand: Moves the rover forward.
   - TurnLeftCommand: Rotates the rover 90 degrees to the left.
   - TurnRightCommand: Rotates the rover 90 degrees to the right.
   - GetPositionCommand: Prints the rover's current position and direction.

**Design Patterns**

1. Command Pattern

- The Command Pattern is used to encapsulate rover actions. This allows commands to be added, removed, or altered without changing the rover's internal logic. Each action (move forward, turn left, turn right) is represented by its own command class.

2. Singleton Pattern

- The Singleton Pattern is applied to the `Grid` class to ensure only one instance of the grid is created throughout the application. This ensures that all commands and rovers are interacting with the same grid instance.

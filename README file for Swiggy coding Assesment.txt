# Magical Arena

Git-Link - https://github.com/pranav0699

** Note - The following email IDs are saved in the STS tool for committing purposes, so the commit history will be created from both IDs.
1.patilpranav943@gmail.com
2.pranavpatil060899@gmail.com

## Overview

This project implements a simulation of a "Magical Arena" where two players fight until one player's health reaches zero. Each player has health, strength, and attack attributes. Players take turns attacking and defending, with the attacker rolling an attack dice and the defender rolling a defense dice to determine the damage dealt and defended.


## Components

### Model
- Player.java : Represents a player with health, strength, and attack attributes.

### Service
- GameEngine.java : Manages the game flow.
- RandomDiceRoller.java : Implements the dice rolling mechanism.
- SimpleArena.java : Simulates the arena where the match takes place.

### Interfaces
- DiceRoller.java : Interface for the dice rolling mechanism.
- GameArena.java : Interface for the arena where the match takes place.

### Main
- App.java : The entry point of the application. Initializes the game and starts the match.

### Test
- PlayerTest.java : Unit tests for the Player class.
- RandomDiceRollerTest.java : Unit tests for the RandomDiceRoller class.
- SimpleArenaTest.java : Unit tests for the SimpleArena class.
- GameEngineTest.java : Unit tests for the GameEngine class.

## Setup

### Prerequisites

- Java JDK (version 8 or above)
- Spring Tool Suite (STS) or any other Java IDE
- JUnit library (version 4 or above)

### Steps to Create the Project

1. **Create a new Java project in STS:**
   - Open STS.
   - Go to File > New > Java Project.
   - Enter the project name `MagicalArena and click Finish.

2. **Create the package structure:**
   - Right-click on src/main/java and select New > Package.
   - Create the following packages:
     - com.arena
     - com.arena.model
     - com.arena.service
     - com.arena.interfaces

3. **Create the classes and interfaces:**
   - Add the classes and interfaces as described in the project structure.

4. **Create test classes:**
   - Right-click on src/test/java and select New > Package.
   - Create the package com.arena.
   - Add the test classes as described in the project structure.

### Adding JUnit to Build Path

1. **Add JUnit library:**
   - Right-click on the project and select Build Path > Add Libraries.
   - Select JUnit and click Next.
   - Choose JUnit 4 and click Finish.

## Running the Application

1. **Run the main class:**
   - Right-click on App.java.
   - Select Run As > Java Application.

### Example Output

Starting the game!
Starting match between Player A and Player B
Player A attacks first.
Player A rolls: 5
Player B rolls: 2
Player A deals 50 damage.
Player B defends 20 damage.
Player B's health is reduced to 70

Player B rolls: 4
Player A rolls: 3
Player B deals 20 damage.
Player A defends 15 damage.
Player A's health is reduced to 45
Game Over! Winner: Player B



## Running Tests

1. **Run Individual Tests:**
   - Right-click on a test class (e.g., PlayerTest.java).
   - Select Run As > JUnit Test.

2. **Run All Tests:**
   - Right-click on the src/test/java folder.
   - Select Run As > JUnit Test.

### Example Test Output

PlayerTest

testPlayerInitialization: PASSED
testPlayerHealthReduction: PASSED
testPlayerIsAlive: PASSED
RandomDiceRollerTest

testRollDice: PASSED
SimpleArenaTest

testStartMatch: PASSED
GameEngineTest

testStartGame: PASSED



## Git Commit Guidelines

When committing your code, make sure to follow these guidelines to ensure a clean and informative commit history:

1. **Commit Frequently:**
   - Commit your code often to ensure that each commit represents a small, manageable change.

2. **Use Descriptive Commit Messages:**
   - Write clear and descriptive commit messages that explain what changes have been made.

3. **Example Commit Messages:**
   - New Arena Project Added

   - Added classes as per requirement which is Player and Arena with full
     implementation

   - Added Main class which is App

   - new changes made

   - seperate the classes interface and make app in lose couple

   - Added Junit jars in the project

   - for Junit test PlayerTest will be added in test package
   - RandomDiceRollerTest test class added


## Packing the Project

1. **Ensure all changes are committed:**
   - Open the Git perspective in STS.
   - Stage all changes and commit with a descriptive message.

2. **Export the project as a zip file:**
   - Right-click on the project and select `Export`.
   - Choose `Archive File`.
   - Select the project and ensure all files are included.
   - Save the zip file.


## Conclusion

This project demonstrates the implementation of a simple game simulation using OOP principles and solid design. The code is structured to be readable, maintainable, and testable, ensuring a high-quality implementation. Follow the setup and usage instructions to run the application and tests.



# among-us-game-engine-logic

Among Us Game Engine Logic (Java)

This project implements the core object relationships and structural backbone for a multiplayer game, inspired by "Among Us." It focuses on advanced Java concepts including Aggregation vs. Composition, Static Factory Methods, and Defensive Copying.

🛠 Key Technical Concepts

    Composition vs. Aggregation: * Implemented Composition for internal components where the "part" cannot exist without the "whole" (e.g., specific game roles).

    Implemented Aggregation for relationships where objects exist independently (e.g., players within a game).

    Static Factory Methods: Developed specialized static methods to instantiate objects, providing a cleaner and more descriptive alternative to standard constructors.

    Encapsulation & Defensive Copying: Utilized copy constructors and deep copying to protect the internal state of objects from external interference.

    Data Modeling: Mapped a complex sci-fi theme (Maps: The Skeld, MIRA HQ, Polus, Airship) into a structured class hierarchy.

📐 UML Implementation Details

![Banking System UML](./game-uml.JPG)

Following a strict UML specification, I developed the following entity relationships:

    Role Class: Defines player roles (Imposter/Crewmate).

    Map Class: Handles the environment settings.

    Player Class: Manages individual player states.

    Game Class: The central controller that aggregates players and maps into a single session.

💻 Technical Stack

    Language: Java

    Testing: JUnit (Unit testing for verifying object state and relationship integrity).

    Documentation: JavaDoc (Self-generated HTML documentation).

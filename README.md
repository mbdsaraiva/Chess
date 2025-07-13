# ♟️ Chess Game System in Java

This project is the implementation of a chess game system developed in Java, applying Object-Oriented Programming (OOP) concepts and data structures. The main objective was to consolidate the knowledge acquired in the Object-Oriented Programming, through the construction of a functional and robust system.

## 🚀 About the Project

The chess system was designed to simulate the rules and dynamics of a traditional chess game. It covers everything from the representation of the board and pieces to the logic of movement, capture, check and checkmate verification, as well as special moves such as castling, en passant, and pawn promotion. The project was structured in layers to ensure modularity and facilitate maintenance and future expansions.

## 💻 Technologies and Concepts Used

This project was developed based on the following technologies and concepts:

### Programming Language

*   **Java**: The main language used for system development, leveraging its Object-Oriented Programming features to create modular and scalable code.

### OOP Paradigms and Topics

The project is an excellent demonstration of the practical application of various Object-Oriented Programming concepts:

*   **Encapsulation**: Extensively used to protect the internal state of objects, exposing only what is necessary through public methods.
*   **Associations**: Relationships between classes, such as the board containing pieces, were modeled using associations.
*   **Inheritance**: Classes like `Rook` and `King` inherit from a base `ChessPiece` class, promoting code reuse and type hierarchy.
*   **Polymorphism**: Methods like `PossibleMoves` are implemented differently in each `ChessPiece` subclass, allowing the system to treat different types of pieces uniformly.
*   **Overloading**: Multiple methods with the same name but different parameters are used to offer flexibility, as in `UI.PrintBoard`.
*   **Overriding**: Parent class methods are reimplemented in child classes to provide specific behaviors, such as the `ToString` method.
*   **Static Members**: Used for functionalities that belong to the class itself, not specific instances, such as utility methods.
*   **Abstract Classes and Methods**: The `Piece` class and the `PossibleMoves` method are abstract, forcing subclasses to provide their own movement implementations.
*   **Exception Handling**: Custom exception classes like `BoardException` and `ChessException` were created to handle specific chess domain errors, ensuring system robustness.
*   **Layers Pattern**: The project is structured in layers (e.g., `Board`, `Chess`, `UI`) to separate responsibilities and improve code organization.

### Data Structures

*   **Matrices**: Used to represent the chessboard, allowing efficient access to piece positions.
*   **Lists**: Employed to manage pieces on the board (`_piecesOnTheBoard`) and captured pieces (`_capturedPieces`), facilitating dynamic manipulation of these sets.

## ✨ Implemented Features

The chess system offers the following functionalities:

*   **Board and Piece Representation**: Implementation of `Position`, `Board`, `Piece`, and `ChessPiece` classes to model the board and different chess pieces (King, Rook, Pawn, Bishop, Knight, Queen).
*   **Piece Movement**: Logic to validate and execute piece movements, including checking valid source and target positions.
*   **Piece Capture**: Management of captured pieces, with display of pieces that have left the game.
*   **Chess Rules**: Implementation of basic chess rules, such as:
    *   **Check**: Verification if the king is under threat.
    *   **Checkmate**: Identification of game end when the king is in check and there are no legal moves to escape.
*   **Special Moves**: Support for special chess moves:
    *   **Castling**: Movement involving the king and a rook.
    *   ***En Passant***: Special pawn capture.
    *   **Pawn Promotion**: Transformation of a pawn into another piece (Queen, Rook, Bishop, or Knight) upon reaching the last rank.
*   **User Interface (UI)**: A simple console interface for game interaction, allowing input of moves and display of the current board state, including colors to differentiate pieces.
*   **Turn Control**: Automatic alternation between players (White and Black) each turn.
*   **Move Count**: Recording the number of moves for each piece, essential for validating some special moves like castling.
*   **Defensive Programming**: Implementation of checks and exception handling to ensure the game behaves robustly against invalid inputs or unexpected situations.

## 📸 Project Images

Here are some images illustrating the chess system in action:

### Board and Pieces

![Chess Board](search_images/efQ6ibSBEfbi.png)
*Representation of the board and pieces in the console.*

### Game in Progress

![Game in Progress](search_images/LYS9nUa0leDs.jpg)
*Example of a game in progress, showing the console interface.*

### Game Overview

![Overview](search_images/PYeaVB0OJMv9.jpg)
*Another perspective of the game interface, highlighting the clarity of the representation.*

## ⚙️ How to Run the Project

To run this project, you will need to have the Java Development Kit (JDK) installed on your machine. The project can be compiled and executed from any Java IDE (such as Eclipse, IntelliJ IDEA, or VS Code with Java extensions) or directly via the command line.

### Prerequisites

*   Java Development Kit (JDK) 8 or higher.

### Compilation and Execution (via command line)

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/acenelio/chess-system-java.git
    ```
2.  **Navigate to the project directory:**
    ```bash
    cd chess-system-java
    ```
3.  **Compile the `.java` files:**
    ```bash
    javac -d bin src/*/*.java src/*/*/*.java
    ```
4.  **Run the main program:**
    ```bash
    java -cp bin application.Program
    ```

**Note**: The original project mentions creating a GitHub repository and `git push` commands. Make sure to set up your own repository if you wish to version your changes.

## 🤝 Contributions

Contributions are welcome! Feel free to open issues to report bugs or suggest improvements, or send pull requests with new features or fixes.



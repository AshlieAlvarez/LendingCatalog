# Lending Catalog
Lending Catalog is a Java application that allows you to manage a catalog of books, movies, and tools. It provides functionalities to search for items, register new items, and generate log entries for each item created.

This was an assigned final module project, further details can be found in the ReadMe located in the final-project folder.


## Features
- **CatalogItem Interface**: Defines common behaviors for book, movie, and tool classes.
- **Book Class**: Represents a book with properties such as title, author, and publish date.
- **Movie Class**: Represents a movie with properties such as title, director, and release date.
- **Tool Class**: Represents a tool with properties such as name and manufacturer.
- **Search Functionality**: Allows searching for items by name, creator, and year.
- **Registration Functionality**: Assigns a unique ID to each item and generates log entries for each item created.


## Usage
Once the application is running, you can interact with the catalog through the command-line interface. The available commands include:
- 'search' Search for items of a specific type based on a keyword.
- 'register' Register a new item of a specific type. Provide the necessary details as command-line arguments.
- 'quit' Exit the application.
  
## File I/O
The application uses file I/O to generate log entries for each created item. The log files are stored in the src/main/resources/logs directory. Separate log files are created for each item type (book, movie, and tool).

## Unit Tests
The project includes unit tests to ensure the correctness of the implemented functionality. The tests cover the matchesName(), matchesCreator(), and matchesYear() methods for the book, movie, and tool classes. 

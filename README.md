# 📚 Library System

A simple Java-based library management system that allows books to be rented by customers, tracks due dates, and manages book availability.

## Features

- Add books to sections (e.g. Romance, Sci-Fiction)
- Rent books to customers
- Automatically tracks rental durations and returns expired books
- Check book availability across all sections

## Technologies Used

- Java (JDK 8 or higher)
- Standard Java libraries (no external dependencies)

## How to Run

1. Clone the repository:

git clone https://github.com/yourusername/LibrarySystem.git cd LibrarySystem

2. Compile and run:

javac src/com/main/*.java java com.main.Main


Or open the project in an IDE like IntelliJ or Eclipse and run `Main.java`.


## Project Structure

src/
└── com/
    └── main/
        ├── Main.java        # Entry point of the app
        ├── Library.java     # Library logic and rentals
        ├── Section.java     # Category-based book storage
        ├── Book.java        # Book class
        ├── Customer.java    # Customer data
        └── RentInfo.java    # Rental info with due dates

## Author

[Keis](https://github.com/Keis21)

## License

This project is licensed under the MIT License.



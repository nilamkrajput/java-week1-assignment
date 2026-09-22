Title : Library Management System

Objective : 
    To build console-based library management system that allows user to manage books and basic operations.

Features : 
    1. Add Book
    2. View Books
    3. Search Book
    4. Issue Book
    5. Return Book
    6. Remove Book
    7. View Available Books
    8. Sort Books by Title

Technologies :
    1. Java
    2. Java Collections Framework(ArrayList)
    3. Object Oriented Programming
    4. VS Code
    5. GitHub

File Structure :

    library_management_system
    |
    |---src/
    |   |--Book.java
    |   |--Library.java
    |   |--Main.java
    |
    |---README.md

Steps to complie and run :
        To compile : javac Main.java
        To run : java Main

        Main Menu:
        ===== Library Management System =====
1. Add Book
2. View Books
3. Search Book
4. Issue Book
5. Return Book
6. Remove Book
7. View Available Books
8. Sort Books by Title
9. Exit
=====================================
Enter your choice: 

Input and Output :
[1] Add Book :
Input :

Enter your choice: 1

===== Add New Book =====
Enter Book ID : 104
Enter book title : Head First Java
Enter book author name : Kathy Sierra and Bert Bates

Output :
Book added successfully.

[2] View Books:

=====================================
Enter your choice: 2

===== All Books =====
ID: 101 | Title: Java Programming | Author: James Gosling | Status: Available
ID: 102 | Title: Clean Code | Author: Robert C. Martin | Status: Available
ID: 103 | Title: Effective Java | Author: Joshua Bloch | Status: Available
ID: 104 | Title: Head First Java | Author: Kathy Sierra and Bert Bates | Status: Available

[3] Search Book :

Enter your choice: 3

===== Search book =====
1. Search by ID : 
2. Search by Title : 
Enter your choice : 1
Enter book ID : 103
Book found : 
ID: 103 | Title: Effective Java | Author: Joshua Bloch | Status: Available

Search by Title

Enter title or keyword : Clean code
===== Search Result =====
ID: 102 | Title: Clean Code | Author: Robert C. Martin | Status: Available

[4] Issue Book :

Enter your choice: 4

===== Issue Book =====
Enter book ID to issue : 102
Book issued successfully!
Issued Book: Clean Code


Enter your choice: 2

===== All Books =====
ID: 101 | Title: Java Programming | Author: James Gosling | Status: Available
ID: 102 | Title: Clean Code | Author: Robert C. Martin | Status: Issued
ID: 103 | Title: Effective Java | Author: Joshua Bloch | Status: Available
ID: 104 | Title: Head First Java | Author: Kathy Sierra and Bert Bates | Status: Available

[5] Return Book :

Enter your choice: 5
===== Return Book =====
Enter book ID to return : 101
This book has not been issued.

Enter your choice: 5
===== Return Book =====
Enter book ID to return : 102
Book returned successfully!
Returned book: Clean Code

[6] Remove Book :

Enter your choice: 6
===== Remove Book =====
Enter book ID to remove 101
Book removed successfully!

Enter your choice: 2

===== All Books =====
ID: 102 | Title: Clean Code | Author: Robert C. Martin | Status: Available
ID: 103 | Title: Effective Java | Author: Joshua Bloch | Status: Available
ID: 104 | Title: Head First Java | Author: Kathy Sierra and Bert Bates | Status: Available

[7] View Available Books :

Enter your choice: 7

===== Available Books =====
ID: 103 | Title: Effective Java | Author: Joshua Bloch | Status: Available
ID: 104 | Title: Head First Java | Author: Kathy Sierra and Bert Bates | Status: Available

[8] Sort Books by Title : 

Enter your choice: 8
Books sorted alphabetically by Title.

===== All Books =====
ID: 102 | Title: Clean Code | Author: Robert C. Martin | Status: Issued
ID: 103 | Title: Effective Java | Author: Joshua Bloch | Status: Available
ID: 104 | Title: Head First Java | Author: Kathy Sierra and Bert Bates | Status: Available


Author : Nilam G Chauhan
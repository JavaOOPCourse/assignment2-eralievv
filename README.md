[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/EcykC5Bv)
# Programming Assignment: Library Management System (Java)

## 📌 Assignment Title

Library Management System Using OOP and Inheritance

------------------------------------------------------------------------

## 🎯 Learning Objectives

By completing this assignment, students will demonstrate understanding
of:

-   Object-Oriented Programming principles\
-   Encapsulation and data hiding\
-   Constructors and copy constructors\
-   Inheritance and method overriding\
-   Arrays of objects\
-   Static vs instance methods\
-   Method overloading\
-   Scanner-based user input\
-   Code reuse and modular design

------------------------------------------------------------------------

## 🧩 Problem Description

You are required to implement a console-based Library Management System.

The system manages books in a library and allows the user to:

-   Add books\
-   Display books\
-   Search for books\
-   Borrow and return books

You must use classes, inheritance, arrays, and methods as specified.

------------------------------------------------------------------------

## 🧱 Part 1: Class Design

### 📘 Base Class: Book

### 🔒 Fields (Encapsulation)

All fields must be private:

private String title; private String author; private int year; private
boolean isAvailable;

------------------------------------------------------------------------

### 🏗️ Constructors

Parameterized constructor:

Book(String title, String author, int year)

Sets isAvailable = true

Copy constructor:

Book(Book other)

------------------------------------------------------------------------

### 🔁 Methods

String getTitle() String getAuthor() int getYear() boolean isAvailable()
void borrowBook() void returnBook() public String toString()

Format example:

Title: Java Basics, Author: John Smith, Year: 2022, Available: true

------------------------------------------------------------------------

### ⚖️ Override equals(Object obj)

Two books are equal if:

-   title\
-   author\
-   year

are the same.

------------------------------------------------------------------------

## 📕 Part 2: Inheritance

### 📗 Derived Class: EBook (inherits from Book)

### ➕ Additional Field

private double fileSize; // in MB

------------------------------------------------------------------------

### 🏗️ Constructor

EBook(String title, String author, int year, double fileSize)

Must call super(...)

------------------------------------------------------------------------

### 🔁 Method Override

Override toString() to include file size:

\[E-Book\] Title: ..., File Size: 5.2MB

------------------------------------------------------------------------

## 🏛️ Part 3: Library Class

### 📚 Class: Library

### 🔒 Fields

private Book\[\] books; private int count;

------------------------------------------------------------------------

### 🏗️ Constructor

Library(int capacity)

Initializes the array with capacity=10

Sets count to 0

------------------------------------------------------------------------

### 🔁 Methods

void addBook(Book book) void displayBooks() Book searchByTitle(String
title) void borrowBook(String title) void returnBook(String title)

------------------------------------------------------------------------

## 🖥️ Part 4: User Interaction (Main Program)

Class: Main

Use Scanner to build a menu-driven program:

1.  Add book
2.  Add e-book
3.  Display all books
4.  Search book by title
5.  Borrow book
6.  Return book
7.  Exit

------------------------------------------------------------------------

### Input Requirements

-   Read book data using Scanner\
-   Store objects in an array\
-   Use loops and switch

------------------------------------------------------------------------

## ⚠️ Rules and Constraints

❌ Do NOT modify array size after creation\
✅ Use inheritance properly\
✅ Use encapsulation (no public fields)\
✅ Code must compile and run

------------------------------------------------------------------------

## 📊 Grading Rubric (100 points)

Book class (fields, constructors, methods) -- 20\
Encapsulation & getters/setters -- 10\
Inheritance (EBook class) -- 15\
Library class logic -- 20\
Static vs instance method usage -- 10\
Scanner & menu logic -- 10\
Code quality & formatting -- 5\
Correct program execution -- 10

------------------------------------------------------------------------

## 🧠 Key OOP Concepts Used

Encapsulation -- All classes\
Inheritance -- EBook extends Book\
Polymorphism -- Book references\
Overriding -- toString()\
Arrays -- Library storage\
Object comparison -- equals()

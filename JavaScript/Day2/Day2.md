Day 2 – 17/07/2025
Topics Covered :

1.Strings

2.String Methods

3.Loops

4.Operators

4.Arrays

5.Conditional Statements

1.Strings in JavaScript
     A string is a group of characters written inside quotes.

     JavaScript has many built‑in methods to work with strings:

     length – finds how many characters are in a string.

     slice(start, end) – extracts a part of a string.

     trim() – removes extra spaces from the beginning and end.

     toUpperCase() – converts all letters to capital.

     toLowerCase() – converts all letters to small.


2.Loops
     Loops are used when you want to run a block of code again and again.

     Common loops in JavaScript:

     for loop – repeats code a fixed number of times.
     Syntax: for(initialization; condition; increment/decrement){...}

    while loop – checks the condition first, then runs the loop if true.

     do…while loop – runs the code once first, then checks the condition.


3.Operators
     Operators are symbols that perform specific operations on values.

     Main types of operators in JavaScript:

     Arithmetic Operators: + - * / %

     Logical Operators: && || !

     Assignment Operators: = += -= *=

     Comparison Operators: == != > < >= <=


4.Array:

     What is an Array in JavaScript?
    An array is a special variable that can store multiple values in a single place.

     Instead of creating separate variables for each value, you can store them all in one array.

     Values in an array are called elements and each element has an index (position).

Example:


     let fruits = ["Apple", "Mango", "Banana", "Orange"];
 How to Access Elements in an Array
     Array indexes start from 0.

     To access elements, use the index in square brackets:


      .log(fruits[0]); // Apple
     console.log(fruits[2]); // Banana


5.Conditional Statement:

     What are Conditional Statements?
    Conditional statements are used to make decisions in a program.



      Types of Conditional Statements in JavaScript
     1. if statement
     Runs a block of code only if the condition is true.


     let age = 18;

     if (age >= 18) {
     console.log("You are eligible to vote.");
}
     2. if…else statement
     Runs one block of code if the condition is true,
    and a different block if the condition is false.


     let age = 16;

     if (age >= 18) {
      console.log("You are eligible to vote.");
    } else {
    console.log("You are not eligible to vote.");
}
    3. if…else if…else statement
    Checks multiple conditions, one after another.


    let marks = 75;

    if (marks >= 90) {
    console.log("Grade A");
   } else if (marks >= 75) {
   console.log("Grade B");
   } else if (marks >= 50) {
   console.log("Grade C");
  } else {
  console.log("Fail");
}
    4. switch statement
    Used when you have many choices for one variable.



let day = 3;

switch (day) {
  case 1:
    console.log("Monday");
    break;
  case 2:
    console.log("Tuesday");
    break;
  case 3:
    console.log("Wednesday");
    break;
  default:
    console.log("Invalid day");
}
🔹 Why Use Conditional Statements?
To control the flow of a program.

To handle different situations in your code.

To make your program smart and dynamic.



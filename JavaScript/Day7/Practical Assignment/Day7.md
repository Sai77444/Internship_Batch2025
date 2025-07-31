# Event Flow in JavaScript (Short Notes)

JavaScript uses an event-driven model to handle tasks without blocking the main thread. The main components of its event flow are:

## 1. Call Stack
Keeps track of function calls. Works on Last In, First Out (LIFO). Functions get added and removed as they execute.

## 2. Web APIs
Browser-provided APIs (like `setTimeout`, `fetch`, etc.) handle long-running tasks in the background.

## 3. Callback Queue
Stores callback functions from Web APIs once they are done and ready to run.

## 4. Event Loop
Constantly checks if the Call Stack is empty. If yes, it moves tasks from the Callback Queue to the Call Stack.

**In short:**  
Async tasks → Web APIs → Callback Queue → Event Loop → Call Stack → Executes.

This system ensures JavaScript runs smoothly and efficiently, even with asynchronous code.


# Async and Promises in JavaScript (Short Notes)

JavaScript runs one task at a time (single-threaded), so to handle time-consuming tasks like API calls or timers without blocking, it uses **asynchronous programming**.

## Promises
A **Promise** represents a value that may be available now, later, or never.  
States: *pending*, *fulfilled*, *rejected*  
Handled using `.then()`, `.catch()`, and `.finally()`

## Async/Await
Introduced in ES2017 to simplify working with promises.  
`async` functions return a promise, and `await` pauses code until the promise resolves.  
Use `try...catch` for error handling.

**Summary:** Promises and async/await make async code cleaner, readable, and essential for modern JS apps dealing with APIs and background tasks.

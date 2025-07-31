# JavaScript Commands and Concepts in Input-Based Calculator

This JavaScript-based calculator demonstrates several important commands and techniques that are commonly used in DOM manipulation and event handling. It starts with the use of the `let` keyword to declare variables such as `value1` and `value2`. These are initialized to 0 and updated dynamically as the user inputs values. 

To access DOM elements, the program utilizes both `document.querySelector()` and `document.getElementById()`. The input fields are selected using their IDs (`#val1` and `#val2`) via `querySelector`, while the "Add" and "Mul" buttons are selected using `getElementById`.

The real-time input capture is handled using the `addEventListener()` method, specifically listening for the `"input"` event on both input fields. Inside this event listener, `e.target.value` is used to retrieve the current value from the input field. Since input values are strings by default, the `Number()` function is used to convert them into numbers so arithmetic operations can be performed.

Basic arithmetic operations like addition (`+`) and subtraction (`-`) are demonstrated in this program. When the user clicks the appropriate button, a calculation is done and the result is stored in variables such as `add` and `mul`. To display the result, the program uses the `alert()` function, which provides a simple and effective way to show output in a pop-up box.

Finally, the program includes click event handling for the buttons using `addEventListener("click", ...)`. This attaches a custom function to each button that gets triggered when the user clicks, allowing the program to respond to interactions in real time. The structure and logic used here showcase fundamental practices in building interactive user interfaces with JavaScript.

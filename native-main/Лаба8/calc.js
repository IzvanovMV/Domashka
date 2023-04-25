let userNumber = Number(prompt("Введите любое число:"));


let num1 = Number(prompt("Введите первое число:"));
let num2 = Number(prompt("Введите второе число:"));
let operation = prompt("Введите операцию (+, -, *, /):");

function calculator(a, b, op) {
    switch (op) {
        case "+":
            return a + b;
        case "-":
            return a - b;
        case "*":
            return a * b;
        case "/":
            return a / b;
        default:
            return "Неизвестная операция";
    }
}

let result = calculator(num1, num2, operation);
alert(`Результат: ${result}`);


let userResult1 = Number(prompt("Задумайте число, умножьте его на 2, добавьте 7 и введите результат:"));
let guessedNumber1 = (userResult1 - 7) / 2;
alert(`Вы задумали число: ${guessedNumber1}`);


let userResult = Number(prompt("Задумайте число, умножьте его на 2, добавьте 7 и введите результат:"));
let guessedNumber = (userResult - 7) / 2;
alert(`Вы задумали число: ${guessedNumber}`);


let userName = prompt("Введите ваше имя:");
let userBirthYear = Number(prompt("Введите ваш год рождения:"));
let currentYear = new Date().getFullYear();
let userAge = currentYear - userBirthYear;

document.write(`${userName}: ${userAge}`);
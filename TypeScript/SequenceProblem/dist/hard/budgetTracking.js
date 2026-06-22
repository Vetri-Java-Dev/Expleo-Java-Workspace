"use strict";
const income = 3500.00;
const expensesInput = "30.00 40.50 25.75";
const expenseStrings = expensesInput.split(" ");
let totalExpenses = 0;
for (const expenseStr of expenseStrings) {
    const expense = parseFloat(expenseStr);
    totalExpenses = totalExpenses + expense;
}
const remainingBudget = income - totalExpenses;
console.log(`Remaining budget: $${remainingBudget.toFixed(2)}`);

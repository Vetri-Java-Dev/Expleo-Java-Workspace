const income: number=3500.00;

const expensesInput: string="30.00 40.50 25.75";

const expenseStrings: string[]=expensesInput.split(" ");
let totalExpenses: number=0;

for (const expenseStr of expenseStrings) {
  const expense: number=parseFloat(expenseStr);
  totalExpenses=totalExpenses+expense;
}

const remainingBudget: number=income-totalExpenses;
console.log(`Remaining budget: $${remainingBudget.toFixed(2)}`);

const birthdateInput: string="2000-01-15";
const birthdate: Date=new Date(birthdateInput);
const today: Date=new Date();
let age: number=today.getFullYear()-birthdate.getFullYear();
const monthDiff: number=today.getMonth()-birthdate.getMonth();

if (monthDiff<0||(monthDiff===0&&today.getDate()<birthdate.getDate())) {
  age--;
}

console.log(`Your age is: ${age} years`);

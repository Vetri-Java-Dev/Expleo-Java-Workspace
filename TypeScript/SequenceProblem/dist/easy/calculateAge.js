"use strict";
const birthdateInput = "2000-01-15";
const birthdate = new Date(birthdateInput);
const today = new Date();
let age = today.getFullYear() - birthdate.getFullYear();
const monthDiff = today.getMonth() - birthdate.getMonth();
if (monthDiff < 0 || (monthDiff === 0 && today.getDate() < birthdate.getDate())) {
    age--;
}
console.log(`Your age is: ${age} years`);

"use strict";
const a = 3;
const b = 4;
const c = 5;
if (a + b > c && a + c > b && b + c > a) {
    const s = (a + b + c) / 2;
    const area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    console.log(`The area of the triangle is: ${area}`);
}
else {
    console.log("Error: The given sides do not form a valid triangle.");
}

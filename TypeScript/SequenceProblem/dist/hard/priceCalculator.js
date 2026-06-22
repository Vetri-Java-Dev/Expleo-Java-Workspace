"use strict";
let totalPrice = 0;
const itemCount = 2;
const prices = [10, 15];
const quantities = [3, 2];
for (let i = 0; i < itemCount; i++) {
    totalPrice = totalPrice + (prices[i] * quantities[i]);
}
console.log(`Total Price: ${totalPrice}`);

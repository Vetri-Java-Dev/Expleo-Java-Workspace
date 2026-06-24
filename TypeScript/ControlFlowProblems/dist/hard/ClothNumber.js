"use strict";
let cost = 6800;
let discount = 0;
if (cost < 2000) {
    discount = 5;
}
else if (cost < 5000) {
    discount = 25;
}
else if (cost < 10000) {
    discount = 35;
}
else {
    discount = 50;
}
let amount = cost - (cost * discount / 100);
console.log(amount);

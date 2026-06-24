"use strict";
let arrays = [1, 2, 3, 4, -1];
let k = 0;
let count = 0;
while (true) {
    if (arrays[k] != -1) {
        for (let j = 0; j < arrays[k]; j++) {
            console.log("Hello");
            count++;
        }
    }
    else {
        break;
    }
    k++;
}
console.log("Count of Hello", count);

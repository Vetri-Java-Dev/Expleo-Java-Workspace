"use strict";
let text = "India became independent in 1947";
let charCount = 0;
let digitCount = 0;
let symbolCount = 0;
for (let i = 0; i < text.length; i++) {
    let ch = text[i].toLowerCase();
    if (ch >= 'a' && ch <= 'z') {
        charCount++;
    }
    else if (ch >= '0' && ch <= '9') {
        digitCount++;
    }
    else {
        symbolCount++;
    }
}
console.log("Char Count:", charCount);
console.log("Digit Count:", digitCount);
console.log("Symbol Count:", symbolCount);

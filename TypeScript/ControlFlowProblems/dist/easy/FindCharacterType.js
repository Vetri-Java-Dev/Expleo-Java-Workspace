"use strict";
let ch = 'b';
switch (true) {
    case "aeiou".indexOf(ch) >= 0:
        console.log("It is Vowel");
        break;
    case "1234567890".indexOf(ch) >= 0:
        console.log("It is Digits");
        break;
    case "~!@#$%^&*()".indexOf(ch) >= 0:
        console.log("It is Symbol");
        break;
}

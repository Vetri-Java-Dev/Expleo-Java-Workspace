"use strict";
let charc = 'b';
if ("aeiou".indexOf(charc) >= 0) {
    console.log("It is Vowel");
}
else if ("1234567890".indexOf(charc) >= 0) {
    console.log("It is Digits");
}
else if ("~!@#$%^&*()".indexOf(charc) >= 0) {
    console.log("It is Symbol");
}
else {
    console.log("It is constants");
}

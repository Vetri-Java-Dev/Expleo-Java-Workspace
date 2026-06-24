"use strict";
let str = "aB9dA1Z5c3";
let arr = str.split("");
arr.sort((a, b) => a.charCodeAt(0) - b.charCodeAt(0));
console.log(arr.join(""));

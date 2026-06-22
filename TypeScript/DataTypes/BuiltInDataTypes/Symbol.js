"use strict";
const secret = Symbol("secret");
const user = {
    name: "Alice",
    [secret]: "Token"
};
console.log(user[secret]);
const symbols = Object.getOwnPropertySymbols(user);
console.log(symbols);

"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const input = "Pen,Pencil,Eraser,Notebook";
const products = input.split(",");
console.log("List of Products:");
for (const product of products) {
    console.log(product.trim());
}

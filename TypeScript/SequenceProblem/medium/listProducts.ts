const input: string="Pen,Pencil,Eraser,Notebook";
const products: string[]=input.split(",");

console.log("List of Products:");

for (const product of products) {
  console.log(product.trim());
}

export {};

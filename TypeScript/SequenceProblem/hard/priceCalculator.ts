let totalPrice: number=0;
const itemCount: number=2;
const prices: number[]=[10, 15];
const quantities: number[] = [3, 2];

for (let i: number=0;i<itemCount;i++) {
  totalPrice=totalPrice+(prices[i]*quantities[i]);
}

console.log(`Total Price: ${totalPrice}`);

let numbe = 153;
let temp = numbe;
let sum = 0;
while (temp > 0) {
    let digit = temp % 10;
    sum += digit ** 3;
    temp = Math.floor(temp / 10);
}
if (sum === numbe) {
    console.log("Armstrong Number");
} else {
    console.log("Not an Armstrong Number");
}
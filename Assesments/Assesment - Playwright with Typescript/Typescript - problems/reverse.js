import readlineSync from 'readline-sync';
function reverse(num) {
    let temp = num;
    let reversedNumber = 0;
    while (temp > 0) {
        reversedNumber = reversedNumber * 10 + temp % 10;
        temp = Math.floor(temp / 10);
    }
    return reversedNumber;
}
let num = readlineSync.questionInt("Enter Number : ");
if (num > 99999 || num < 10000) {
    console.log("Number limit exceed");
}
else {
    console.log("Reversed number : ", reverse(num));
}

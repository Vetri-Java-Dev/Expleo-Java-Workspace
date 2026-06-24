let carNo = 1234;

if (carNo < 1000 || carNo > 9999) {
    console.log(carNo + " is not a valid car number");
} else {
    let temp = carNo;
    let sum = 0;
    while (temp > 0) {
        sum += temp % 10;
        temp = Math.floor(temp / 10);
    }
    if (sum % 3 === 0 || sum % 5 === 0 || sum % 7 === 0) {
        console.log("Lucky Number");
    } else {
        console.log("Sorry it's not my lucky number");
    }
}
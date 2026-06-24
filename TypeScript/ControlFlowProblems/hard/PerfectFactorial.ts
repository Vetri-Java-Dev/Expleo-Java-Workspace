let numb = 5040;
if (numb <= 0) {
    console.log("Invalid Input");
}
else {
    let temp = numb;
    let i = 1;
    while (temp > 1 && temp % i === 0) {
        temp = temp / i;
        i++;
    }
    if (temp === 1) {
        console.log(i - 1);
    } else {
        console.log("Sorry. The given number is not a perfect factorial");
    }
}
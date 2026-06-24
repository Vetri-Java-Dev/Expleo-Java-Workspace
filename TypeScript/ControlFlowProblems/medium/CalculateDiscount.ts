let price = 500
let quantity = 3
let total = price * quantity

if(total > 1000) {
    let amn = total * 0.10
    console.log("10% discount applied")
    console.log("The Total after 10% discount:",total-amn)
}
else {
    let amn = total * 0.05
    console.log("5% discount applied")
    console.log("The Total after 5% discount:",total-amn)
}
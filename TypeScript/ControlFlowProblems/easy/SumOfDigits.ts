let values = 1234
let result = 0
while(values > 0) {
    let digit = values % 10
    result += digit
    values = Math.floor(values/10)
}
console.log("The Total",result)
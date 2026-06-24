let salary = 10000

if(salary <= 10000) {
    let hra = salary * 0.20
    let da = salary * 0.80
    console.log("Total Salary:",salary+hra+da)
}
else if(salary > 10000 && salary <= 20000) {
    let hra = salary * 0.25
    let da = salary * 0.90
    console.log("Total Salary:",salary+hra+da)
}
else if(salary > 20000) {
    let hra = salary * 0.30
    let da = salary * 0.95
    console.log("Total Salary:",salary+hra+da)
}
else {
    console.log("Give correct value")
}
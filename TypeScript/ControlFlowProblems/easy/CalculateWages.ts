let emp_names : string = "Vetrivel"
let emp_ages : number = 21
let emp_wage : number = 4000
let noofDay : number = 30
let tot : number | null = null

console.log("-----Employee Details-----")
console.log("Name:",emp_names)
console.log("Age:",emp_ages)
console.log("Wages:",emp_wage)
console.log("No of Days:",noofDay)
tot = emp_wage * noofDay
console.log("Total Salary:",tot)
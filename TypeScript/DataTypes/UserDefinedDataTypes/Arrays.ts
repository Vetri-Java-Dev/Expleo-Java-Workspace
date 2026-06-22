let fruits : string[] = ["Apple", "Banana", "Orange"]
let fruitsGenericArray : Array<string> = ["Apple", "Banana", "Orange"]

// console.log(fruits[2])
// console.log(fruitsGenericArray[2])

// for(var index in fruits)
//     console.log(fruits[index])

//push
fruits.push("Dragon fruit", "Jack Fruit")

//sort
let numbers = [10,5,100,20];
numbers.sort((a,b)=>a-b);
console.log(numbers);

//concat
let veggies : string[] = ["Carrot", "Gabbage"]
let allFoods : string[] = fruits.concat(veggies)

//indexOf
console.log("Index of 'orange' : "+fruits.indexOf("Orange"))

//array.copyWithin(target, start, end)
console.log(fruits.copyWithin(0,1,3))





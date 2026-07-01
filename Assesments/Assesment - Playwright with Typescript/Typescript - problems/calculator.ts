import readlineSync from "readline-sync";

try{
    let num1=readlineSync.questionInt("Enter Number 1 : ")
    let num2=readlineSync.questionInt("Enter Number 2 : ")

    console.log("Addition : ",(num1+num2))
    console.log("Subtraction : ",(num1-num2))
    console.log("Multiplication : ",(num1*num2))

    num2==0?console.log("Zero division error"):console.log("Division : ",(num1/num2))
}

catch(Exception){
    console.log("Error : ",Exception)
}


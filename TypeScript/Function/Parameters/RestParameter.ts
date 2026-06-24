function ArraySum(...arr:number[]){
    let sum=0;
    for(let i=0;i<arr.length;i++){
        sum+=arr[i]
    }
    return sum
}

console.log(ArraySum(1,2,3,4,5))
console.log(ArraySum(6,7,8,9,10))
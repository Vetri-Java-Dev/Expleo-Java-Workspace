let month = 3
let days = 0
console.log("Mon    Tue     Wed     Thu     Fri     Sat     Sun")

switch(true) {
    case month == 1:
        days = 31
        break
    case month == 2:
        days = 28
        break
    case month == 3:
        days = 31
        break
    case month == 4:
        days = 30
        break
    case month == 5:
        days = 31
        break
    case month == 6:
        days = 31
        break
    case month == 7:
        days = 30
        break
    case month == 8:
        days = 31
        break
    case month == 9:
        days = 30
        break
    case month == 10:
        days = 31
        break
    case month == 11:
        days = 30
        break
    case month == 12:
        days = 31
        break
}

let resut =''
for(let i = 1;i <= days;i++) {
    resut += i + '\t'
    if(i % 7 == 0){
        resut += '\n'
    }
}
console.log(resut)
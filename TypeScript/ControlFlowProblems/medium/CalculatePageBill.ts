let page = 7;
let copies = 3;

let typeAmount = page * 3;
let copyAmount = 0;

if (copies == 1) {
    copyAmount = page * 1;
} else {
    copyAmount = page + ((copies - 1) * page * 3);
}

console.log("Copy Rate:", copyAmount);
console.log("Page Rate:", typeAmount);
console.log("Total:", typeAmount + copyAmount);
const a: number=3;
const b: number=4;
const c: number=5;

if (a+b>c && a+c>b && b+c>a) {
  const s: number=(a+b+c)/2;
  const area: number=Math.sqrt(s*(s-a)*(s-b)*(s-c));
  console.log(`The area of the triangle is: ${area}`);
}
else {
  console.log("Error: The given sides do not form a valid triangle.");
}

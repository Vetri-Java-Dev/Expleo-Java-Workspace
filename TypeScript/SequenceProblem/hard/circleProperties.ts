const radius: number=5.0;
const angle: number=60.0;
const pi: number=Math.PI;

const diameter: number=2*radius;
const circumference: number=2*pi*radius;
const sectorArea: number=(angle/360)*pi*radius*radius;
const arcLength: number=(angle/360)*2*pi*radius;

console.log(`Radius: ${radius}`);
console.log(`Diameter: ${diameter}`);
console.log(`Circumference: ${circumference}`);
console.log(`Sector Area for ${angle} degrees: ${sectorArea}`);
console.log(`Arc Length for ${angle} degrees: ${arcLength}`);

export {};

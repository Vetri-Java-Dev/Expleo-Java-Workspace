class Car{
    private brand : string;
    private speed : number;
    private fuel : string;

    constructor(brand:string, speed:number, fuel:string){
        this.brand=brand
        this.speed=speed
        this.fuel=fuel
    }

    public getBrand() : string{
        return this.brand;
    }

    public getspeed() : number{
        return this.speed;
    }

    public getfuel() : string{
        return this.fuel;
    }


    public accelerate(){
        this.speed+=10
        console.log("Current speed : ",this.speed)
    }

    protected refuel(){
        console.log(this.fuel," Re fueled")
    }

    protected horn(){
        console.log("Honk Honk !!")
    }

    public displayCarInfo(){
        console.log("Car Brand : ",this.brand)
        console.log("Car Speed : ",this.speed)
        console.log("Fuel : ",this.fuel)

        this.accelerate()
        this.refuel()
    }
}

let myCar=new Car("Contessa",100,"Diesel")
myCar.displayCarInfo()
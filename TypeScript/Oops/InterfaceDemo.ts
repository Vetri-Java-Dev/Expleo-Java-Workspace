interface Shape{
    name : string
    color : string
    area(radius : number) : number
}

class Circle implements Shape{

    name: string;
    color: string;

    constructor(name: string, color: string) {
        this.name=name;
        this.color=color;
    }

    public area(radius : number):number{
        return 3.24*radius*radius
    }
}
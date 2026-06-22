function varDemo():void{
    var functVariable="This is function variable"

    console.log(functVariable)

    if(true){
        console.log(functVariable)
    }

    function nested() : void{
        console.log(functVariable)
    }

    nested()
}

function letDemo():void{

    if(true){
        let functVariable="This is local variable"
        console.log(functVariable)
    }

    console.log(functVariable)

    function nested() : void{
        console.log(functVariable)
    }

    nested()
}

letDemo()
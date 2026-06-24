function Display(id : number, name : string, email? :string){
    console.log("Id : ",id)
    console.log("Name : ",name)

    if(email!=undefined){
        console.log("Email : ",email)
    }
}

Display(161,"Vetri")
Display(161,"Vetri","2k22cse161@kiot.ac.in")
import fs from 'fs';
import path from "path"
import {parse} from "csv-parse/sync"

export interface RegisterationData{
    type : string;
    firstName : string;
    lastName : string;
    email : string;
    mobile : string;
    password : string;
    confirmationPassword : string
}

export function readRegisterData(){

    const Path=path.resolve(__dirname, "../test-data/registerData.csv")

    const content=fs.readFileSync(Path,"utf-8")
    
    return parse(content,{
        skip_empty_lines:true,
        trim:true,
        columns:true,
    }) as RegisterationData[] 
}


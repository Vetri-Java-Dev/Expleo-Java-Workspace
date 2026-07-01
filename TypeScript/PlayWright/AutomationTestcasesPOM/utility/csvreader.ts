import fs from 'fs'
import {parse} from "csv-parse/sync"
import path from "path"

export interface RegisterData{
    type : string;
    name : string;
    email : string;
    password :string;
    firstName : string;
    lastName : string;
    address : string;
    state : string;
    city : string;
    zipcode : string;
    mobile : string;
}

export function readRegisterData(){
    const Path=path.resolve(__dirname,"../test-data/registerationData.csv")

    const content=fs.readFileSync(Path,"utf-8")

    return parse(content, {
        skip_empty_lines:true,
        trim:true,
        columns:true
    }) as RegisterData[]

}

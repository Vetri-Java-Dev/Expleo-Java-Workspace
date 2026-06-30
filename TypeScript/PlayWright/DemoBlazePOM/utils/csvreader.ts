import fs from "fs"
import path from "path"
import { parse } from "csv-parse/sync"



// export function readCSV<T>(fileName:string): T[] {

//     const filepath = path.resolve(__dirname,`../test-data/${fileName}`);

//     const content = fs.readFileSync(filepath, "utf-8");

//     return parse(content,{
//         columns:true,
//         skip_empty_lines:true,
//         trim:true
//     }) as T[];

// }

export interface ContactData {
    testname : string
    email : string
    name : string
    message : string
}

export function readContactData(): ContactData[] {

    const filepath = path.resolve(__dirname, "../test-data/contactData.csv")
    const fileContent = fs.readFileSync(filepath, "utf-8")

    const records = parse(fileContent, {
        columns: true,
        skip_empty_lines: true,
        trim: true,
    }) as ContactData[]

    return records.filter((row) => row.testname && row.testname.trim() !== "")
}


interface LoginData{
    type : string;
    username : string;
    password : string
}

export function readLoginData():LoginData[]{
    
    const filepath=path.resolve(__dirname,"../test-data/loginData.csv")

    const content=fs.readFileSync(filepath,'utf-8')

    return parse(content,{
        columns:true,
        skip_empty_lines:true,
        trim:true
    })as LoginData[]
}
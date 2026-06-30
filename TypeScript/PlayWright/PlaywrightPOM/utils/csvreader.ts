import fs from 'fs'
import path from 'path'
import {parse} from 'csv-parse/sync'

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
import {test, expect} from "../fixtures/baseFixtures"

import {readLoginData,LoginData} from '../utils/csvreader'


const users:LoginData[]=readLoginData()

const validUser=users.find(user=>user.type=="valid")
const invalidUser=users.find(user=>user.type=="invalid")

test.describe("Login Test using Csv",async()=>{

    test.beforeEach(async({loginPage})=>{
        await loginPage.navigate()
    })

    test("Invalid Login Test @InvalidLogin",async({loginPage})=>{
        loginPage.login(invalidUser.username,invalidUser.password)
        await expect(loginPage.errorMessage).toBeVisible()
    })

    test("Valid Login Test @ValidLogin",async({loginPage,dashboardPage})=>{
        loginPage.login(validUser.username,validUser.password)
        await expect(dashboardPage.dashboardTitle).toBeVisible()
    })
    
})
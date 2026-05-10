package com.utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	public static Object[][] readExcel(String fileName,String sheetName){
		
		Object[][] data=null;
		
		try {
			FileInputStream in=new FileInputStream("C:\\Users\\Vetrivel B\\eclipse-workspace\\Selenium-TestNg\\practice\\src\\test\\resources\\excels\\"+fileName);
			
			XSSFWorkbook workbook=new XSSFWorkbook(in);
			XSSFSheet sheet=workbook.getSheet(sheetName);
			
			int col=sheet.getRow(0).getLastCellNum();
			int row=sheet.getLastRowNum();
			
			data=new Object[row][col];
			
			for(int i=1;i<=row;i++) {
				XSSFRow Row=sheet.getRow(i);
				
				for(int j=0;j<col;j++) {
					data[i-1][j]=Row.getCell(j).toString();
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return data;
	}
}

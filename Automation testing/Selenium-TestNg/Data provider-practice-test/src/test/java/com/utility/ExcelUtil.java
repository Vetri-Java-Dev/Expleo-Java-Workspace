package com.utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	public static Object[][] readExcel(String fileName,String sheetName){
		
		Object[][] data=null;
		
		try {
			FileInputStream in=new FileInputStream("C:\\Users\\Vetrivel B\\eclipse-workspace\\Selenium-TestNg\\practice-test\\src\\test\\resources\\"+fileName+".xlsx");
			
			XSSFWorkbook book=new XSSFWorkbook(in);
			XSSFSheet sheet=book.getSheet(sheetName);
		
			data=new String[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			
			for(int i=1;i<=sheet.getLastRowNum();i++) {
				XSSFRow row=sheet.getRow(i);
				for(int j=0;j<row.getLastCellNum();j++) {
					data[i-1][j]=row.getCell(j).getStringCellValue();
				}
			}	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return data;
	}
}

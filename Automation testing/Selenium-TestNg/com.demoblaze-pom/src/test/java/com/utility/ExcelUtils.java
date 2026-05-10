package com.utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    public static Object[][] readExcel(String fileName, String sheetName) {

        Object[][] data = null;

        try {
            FileInputStream in = new FileInputStream("C:\\Users\\Vetrivel B\\eclipse-workspace\\Selenium-TestNg\\DataDriven-TestScripts\\src\\test\\resources\\"+ fileName);

            XSSFWorkbook workBook = new XSSFWorkbook(in);
            XSSFSheet sheet = workBook.getSheet(sheetName);

            int row = sheet.getLastRowNum();
            int col = sheet.getRow(0).getLastCellNum();

            data = new Object[row][col];

            // Used to avoid values like 1234.0
            DataFormatter formatter=new DataFormatter();

            for (int i = 1; i <= row; i++) {
                XSSFRow tuple = sheet.getRow(i);
                for (int j = 0; j < col; j++) {
                    // Prevent NullPointerException for empty rows/cells
                    if (tuple!=null&&tuple.getCell(j)!=null) {
                        data[i-1][j]=formatter.formatCellValue(tuple.getCell(j));
                    }
                    else{
                        data[i-1][j]="";
                    }
                }
            }
            workBook.close();
            in.close();

        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }
}
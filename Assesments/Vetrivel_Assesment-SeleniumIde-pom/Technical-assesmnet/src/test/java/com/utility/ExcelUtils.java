package com.utility;

import java.io.InputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    public static Object[][] readExcel(String fileName, String sheetName) {

        Object[][] data;

        try {
            InputStream is = ExcelUtils.class
                    .getClassLoader()
                    .getResourceAsStream(fileName);

            if(is==null) {
                throw new RuntimeException("File not found in resources: " + fileName);
            }

            XSSFWorkbook workbook = new XSSFWorkbook(is);
            XSSFSheet sheet = workbook.getSheet(sheetName);

            int col=sheet.getRow(0).getLastCellNum();
            int row=sheet.getLastRowNum();

            data=new Object[row][col];

            DataFormatter formatter = new DataFormatter();

            for (int i = 1; i <= row; i++) {
                XSSFRow rowData = sheet.getRow(i);

                for (int j = 0; j < col; j++) {
                    if (rowData == null) {
                        data[i - 1][j] = "";
                    } else {
                        data[i - 1][j] = formatter.formatCellValue(rowData.getCell(j));
                    }
                }
            }
            workbook.close();

        }
        catch (Exception e) {
            throw new RuntimeException("Error reading Excel file", e);
        }

        return data;
    }
}
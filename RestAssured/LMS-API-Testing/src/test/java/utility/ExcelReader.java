package utility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

    public static Object[][] readExcel(String fileName, String sheetName) {

        Object[][] data;

        try (FileInputStream in = new FileInputStream(fileName);
             XSSFWorkbook book = new XSSFWorkbook(in)) {

            XSSFSheet sheet = book.getSheet(sheetName);

            int rowCount = sheet.getLastRowNum();
            int colCount = sheet.getRow(0).getLastCellNum();

            data = new Object[rowCount][colCount];

            for (int i = 1; i <= rowCount; i++) {

                XSSFRow row = sheet.getRow(i);
                if (row == null) continue;

                for (int j = 0; j < colCount; j++) {

                    Cell cell = row.getCell(j);

                    if (cell == null) {
                        data[i - 1][j] = null;
                        continue;
                    }

                    String val;

                    if (cell.getCellType() == CellType.NUMERIC) {
                        // FIX: removes 123.0 issue
                        val = String.valueOf((long) cell.getNumericCellValue());
                    } else {
                        val = cell.toString().trim();
                    }

                    data[i - 1][j] = val.isEmpty() ? null : val;
                }
            }

        } catch (Exception e) {
            throw new RuntimeException("Failed to read Excel file: " + fileName, e);
        }

        return data;
    }
}
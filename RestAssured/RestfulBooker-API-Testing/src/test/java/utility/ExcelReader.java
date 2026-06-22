package utility;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {

    private Workbook workbook;
    private Sheet sheet;

    public ExcelReader(String filePath, String sheetName) {

        try {

            FileInputStream fis = new FileInputStream(filePath);

            workbook = WorkbookFactory.create(fis);

            sheet = workbook.getSheet(sheetName);

        }
        catch (IOException e) {

            throw new RuntimeException(
                "Unable to load Excel file"
            );
        }
    }


    public int getRowCount(){
        return sheet.getPhysicalNumberOfRows();

    }


    public int getColumnCount(int rowNum){

        return sheet
                .getRow(rowNum)
                .getPhysicalNumberOfCells();

    }

    public String getCellData(
            int rowNum,
            int colNum){

        Cell cell =
            sheet
            .getRow(rowNum)
            .getCell(colNum);


        DataFormatter formatter =
                new DataFormatter();


        return formatter.formatCellValue(cell);
    }


    public Object[][] getExcelData(){

        int rows = getRowCount();
        int cols = getColumnCount(0);


        Object[][] data =
                new Object[rows-1][cols];


        for(int i=1; i<rows; i++){

            for(int j=0; j<cols; j++){

                data[i-1][j] =
                    getCellData(i,j);

            }
        }


        return data;
    }
}
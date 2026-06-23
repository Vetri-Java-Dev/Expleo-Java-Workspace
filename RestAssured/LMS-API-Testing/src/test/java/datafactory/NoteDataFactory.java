package datafactory;

import utility.ExcelReader;
import org.testng.annotations.DataProvider;

public class NoteDataFactory {

    private static final String TEST_DATA_EXCEL = "src/test/resources/TestData.xlsx";
    
    @DataProvider(name = "validGetAllNotesData")
    public static Object[][] validGetAllNotesData() {
        return ExcelReader.readExcel(TEST_DATA_EXCEL, "ValidParamsForGetAllNotes");
    }

    @DataProvider(name = "invalidGetAllNotesData")
    public static Object[][] invalidGetAllNotesData() {
        return ExcelReader.readExcel(TEST_DATA_EXCEL, "InvalidParamsForGetAllNotes");
    }
}
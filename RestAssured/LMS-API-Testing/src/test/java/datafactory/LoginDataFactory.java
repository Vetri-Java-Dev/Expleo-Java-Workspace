package datafactory;

import utility.ExcelReader;
import org.testng.annotations.DataProvider;

public class LoginDataFactory {

    private static final String TEST_DATA_EXCEL="src/test/resources/TestData.xlsx";

    @DataProvider(name = "validLoginData")
    public static Object[][] validLoginData() {
        return ExcelReader.readExcel(TEST_DATA_EXCEL, "ValidLogin");
    }

    @DataProvider(name = "invalidLoginData")
    public static Object[][] invalidLoginData() {
        return ExcelReader.readExcel(TEST_DATA_EXCEL, "InvalidLogin");
    }
}
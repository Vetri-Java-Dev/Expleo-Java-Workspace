package utility;

import java.io.FileReader;
import java.util.List;
import com.opencsv.CSVReader;

public class CsvReader {

    public static String[] getRowData(String filePath, int rowNumber) {

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {

            List<String[]> rows = reader.readAll();

            if (rowNumber >= rows.size()) {
                throw new RuntimeException("Row number out of range: " + rowNumber);
            }

            return rows.get(rowNumber);

        } catch (Exception e) {
            throw new RuntimeException("Failed to read CSV: " + filePath, e);
        }
    }
}
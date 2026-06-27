package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVReaderUtil {

    public static Object[][] readCSV(String filePath) {

        List<Object[]> data = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                data.add(values);
            }

        } catch (Exception e) {
            throw new RuntimeException("CSV file not found: " + e.getMessage());
        }

        return data.toArray(new Object[0][]);
    }
}
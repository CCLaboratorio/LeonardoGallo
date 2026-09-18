package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Data Base Reader.
 * @author lgallo
 * @since 12/09/2026
 */
public class DBReader {

    /**
     * Extracts information from a file.
     * @param table is the file that contains the data.
     */
    public static List<String[]> getData(String table) {

        List<String[]> data = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(table))) {

            String line;

            while ((line = reader.readLine()) != null) {
                String[] element = line.split("\\|");
                data.add(element);
            }

        } catch (IOException e) {
            System.out.println("No fue posible leer el archivo.");

        }

        return data;
    }

    /**
     * Prueba local de DBReader
     */
    public static void main(String[] args) {
	List<String[]> data = getData("resources/users.txt");
	for(String[] e : data) {
	    System.out.println(e[1]);
	}
    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task4 {
    public static void main(String[] args) {

        int digit = Integer.parseInt(getStringFromFile("input.txt"));

        saveStringToFile(getResult(digit), "output.txt");
    }

    private static String getResult(int digit) {
        StringBuilder sb = new StringBuilder();
        sb.append(digit).append(9).append(9-digit);
        return sb.toString();
    }

    private static void saveStringToFile(String string, String fileName) {
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write(string);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static String getStringFromFile(String fileName) {

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            return br.readLine();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return "0";
    }
}
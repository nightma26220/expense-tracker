import java.io.*;
import java.util.*;



public class FileStorage {
    public static List<Expense> loadFromFile(String fileName) {
        List<Expense> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String title = parts[1];
                double amount = Double.parseDouble(parts[2]);
                String category = parts[3];

                list.add(new Expense(id, title, amount, category));

            }
        } catch (Exception e) {
            //file may not exist for the first time 
            System.out.println("No existing file found, starting fresh");
        }
        return list;
    }

    public static void saveToFile(List<Expense> list, String fileName){
        try (BufferedWriter bw= new BufferedWriter(new FileWriter(fileName))) {
            for (Expense e : list) {
                bw.write(e.id + "," +e.title + ","+e.amount+"," + e.category);
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println("Error saving file.");
        }
    }
}

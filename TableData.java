import java.util.ArrayList;
import java.util.List;

public class TableData {
    public static void main(String[] args) {
        // Create a list to store table data
        List<List<String>> table = new ArrayList<>();

        // Add header row
        List<String> header = new ArrayList<>();
        header.add("Lorem");
        header.add("Ipsum");
        header.add("Dolor");
        header.add("Sit");
        header.add("Amet");
        header.add("Diceret");
        table.add(header);

        // Add table rows
        for (int i = 0; i < 10; i++) {
            List<String> row = new ArrayList<>();
            row.add("Iuvaret" + i);
            row.add("Apeirian" + i);
            row.add("Adipisci" + i);
            row.add("Definiebas" + i);
            row.add("Consequuntur" + i);
            row.add("Phaedrum" + i);
            table.add(row);
        }

        // Calculate column widths
        int[] columnWidths = new int[header.size()];
        for (List<String> row : table) {
            for (int i = 0; i < row.size(); i++) {
                int cellLength = row.get(i).length();
                if (cellLength > columnWidths[i]) {
                    columnWidths[i] = cellLength;
                }
            }
        }

        // Print the table to the console with aligned columns
        printTable(table, columnWidths);
    }

    // Method to print the table with aligned columns
    private static void printTable(List<List<String>> table, int[] columnWidths) {
        for (List<String> row : table) {
            for (int i = 0; i < row.size(); i++) {
                String cell = row.get(i);
                System.out.print(String.format("%-" + (columnWidths[i] + 2) + "s", cell));
            }
            System.out.println(); // Move to the next line for the next row
        }
    }
}

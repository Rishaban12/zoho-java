import java.io.*;
import java.util.Scanner;

public class ElectronicsProduct {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        userInput(sc);
        copyContent(sc);
        modifyContent(sc);
        search(sc);
        copyCsvFile(sc);
    }

    static void userInput(Scanner sc) throws IOException {
        System.out.print("Enter the filename to write: ");
        String fileName = sc.nextLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        System.out.println("Enter content (type 'exit' to finish):");

        String line;
        while (true) {
            line = sc.nextLine();
            if (line.equalsIgnoreCase("exit")) break;

            writer.write(line);
            writer.newLine();
        }
        writer.close();
        System.out.println("Successfully written to file: " + fileName);
    }

    static void copyContent(Scanner sc) throws IOException {
        System.out.print("Enter source filename: ");
        String src = sc.nextLine();
        System.out.print("Enter destination filename: ");
        String dest = sc.nextLine();

        BufferedReader reader = new BufferedReader(new FileReader(src));
        BufferedWriter writer = new BufferedWriter(new FileWriter(dest));

        String line;
        while ((line = reader.readLine()) != null) {
            writer.write(line);
            writer.newLine();
        }

        reader.close();
        writer.close();
        System.out.println("Content copied from " + src + " to " + dest);
    }

    static void modifyContent(Scanner sc) throws IOException {
        System.out.print("Enter filename to modify: ");
        String fileName = sc.nextLine();

        File file = new File(fileName);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        StringBuilder content = new StringBuilder();

        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }
        reader.close();

        System.out.print("Enter word to replace: ");
        String oldWord = sc.nextLine();
        System.out.print("Enter new word: ");
        String newWord = sc.nextLine();

        String modifiedContent = content.toString().replace(oldWord, newWord);

        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(modifiedContent);
        writer.close();

        System.out.println("File modified successfully.");
    }

    static void search(Scanner sc) throws IOException {
        System.out.print("Enter filename to search: ");
        String fileName = sc.nextLine();
        System.out.print("Enter word to search: ");
        String searchWord = sc.nextLine();

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        int count = 0;
        String line;

        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (word.equalsIgnoreCase(searchWord)) {
                    count++;
                }
            }
        }
        reader.close();
        System.out.println("Word occurrences: " + count);
    }

    static void copyCsvFile(Scanner sc) throws IOException {
        System.out.print("Enter source .txt filename: ");
        String txtFile = sc.nextLine();
        System.out.print("Enter destination .csv filename: ");
        String csvFile = sc.nextLine();

        BufferedReader reader = new BufferedReader(new FileReader(txtFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(csvFile));

        String line;
        while ((line = reader.readLine()) != null) {
            writer.write(line); // Each line copied as a CSV line
            writer.newLine();
        }

        reader.close();
        writer.close();
        System.out.println("Content copied to CSV file: " + csvFile);
    }
}

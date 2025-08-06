import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Append {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the filename");
        String file=sc.nextLine();
        System.out.println("enter the content (if want exit type exit): ");

       FileWriter bw=new FileWriter(file,true);
       BufferedWriter writer=new BufferedWriter(bw);

        String line;
        while(true) {
            line = sc.nextLine();
            if (line.equalsIgnoreCase("exit")) {
                break;
            } else {
                writer.write(line);
                writer.newLine();
            }
        }
        writer.close();
        System.out.println("Write in the file without overwrite successfully");
    }
}

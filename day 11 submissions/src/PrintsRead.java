import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PrintsRead {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the filename");
        String filename=sc.nextLine();

        BufferedReader reader=new BufferedReader(new FileReader(filename));

        int count=0;
        int countNewline=0;
        int charCount=0;
        String line;
        while((line=reader.readLine())!=null){
            countNewline++;
            String[] words=line.trim().split("\\s+");

            if(!(line.trim().isEmpty())){
                count+=words.length;
            }
            charCount+=words.length;
        }
        reader.close();
        System.out.println("WordsLength: "+count);
        System.out.println("LineLength: "+countNewline);
        System.out.println("CharaacterLength: "+charCount);

    }
}
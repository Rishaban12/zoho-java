import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class File{
    void fileread(String filepath){
    BufferedReader buffer=null;
    try{
        buffer=new BufferedReader(new FileReader(filepath));
        String line;
        while((line= buffer.readLine())!=null){
            System.out.println(line);
        }
    }
    catch (FileNotFoundException e){
        System.out.println("File not found: "+e.getMessage());
    } catch (IOException e) {
        System.out.println("reading is error: "+e.getMessage());
    }
    finally {
        try{
            if(buffer!=null){
                buffer.close();
                System.out.println("file closed");
            }
        }catch (IOException e){
            System.out.println("error while closing: "+e.getMessage());
        }
    }
    }
}
public class Nine {
    public static void main(String[] args) {
        File file=new File();
        file.fileread("example.txt");
    }
}

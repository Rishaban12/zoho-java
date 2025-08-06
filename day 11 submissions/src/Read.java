import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/admin/IdeaProjects/day 11 submissions/java.txt");

        if (file.exists()) {
            System.out.println(file.getName());
        }else{
            System.out.println("Not found");
            return;
        }

        FileReader fr = null;
        try {
            fr = new FileReader(file);
            int data;
            while ((data = fr.read()) !=-1) {
                System.out.print((char) data);
            }
        }finally {
            if(fr!=null){
                fr.close();
            }
        }
    }
}

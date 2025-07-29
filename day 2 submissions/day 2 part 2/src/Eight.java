import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String word = read.nextLine();
        boolean found = false;
        int uppercount=0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isUpperCase(ch)){
                uppercount++;
            }
        }
        if(uppercount==word.length()){
            found=true;
        }
        else if(uppercount==0){
            found=true;
        }
        else if(uppercount==1 && Character.isUpperCase(word.charAt(0))){
            found=true;
        }
        System.out.println(found);
    }
}

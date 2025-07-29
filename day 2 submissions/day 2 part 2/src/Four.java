import java.util.Scanner;

public class Four {
    public static void main(String[] args){
    Scanner read= new Scanner(System.in);
    String s= read.next();
    String t=read.next();
    int[] count=new int[26];
    for(int i=0;i<s.length();i++){
       char ch= s.charAt(i);
       count[ch-'a']++;
        }
        for(int i=0;i<t.length();i++){
            char ch= t.charAt(i);
            count[ch-'a']--;
        }
        for(int i=0;i<26;i++) {
            if (count[i] == -1) {
                char charac = (char) (i + 'a');
                System.out.println(charac);
                break;
            }
        }
    }
}

import java.util.Scanner;

public class Two {
    public static void main(String[] args){
        StringBuilder res= new StringBuilder();
        Scanner read= new Scanner(System.in);
        int colNum= read.nextInt();
       while(colNum>0){
           colNum--;
           int remainder=colNum%26;
           char alp=(char)('a'+remainder);
           res.insert(0,alp);
           colNum=colNum/26;
       }
        System.out.println(res);
    }
}

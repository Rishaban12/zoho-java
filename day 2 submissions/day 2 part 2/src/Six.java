import java.util.Scanner;

public class Six {
    public static void main(String[] args){
        Scanner read= new Scanner(System.in);
        StringBuilder sb= new StringBuilder();

        String num1= read.next();
        String num2= read.next();
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        while(i>=0||j>=0|| carry!=0){
            int numA=i>=0?num1.charAt(i)-'0':0;
            int numB=j>=0?num2.charAt(j)-'0':0;
            int sum= numB+numA+carry;
            int curval=sum%10;
            carry=sum/10;
            sb.insert(0, curval);
            i--;
            j--;
        }
        System.out.println(sb);
    }
}

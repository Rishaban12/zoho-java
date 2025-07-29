import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        StringBuilder st = new StringBuilder();

        System.out.println("a:");
        String a = read.next();

        System.out.println("b:");
        String b = read.next();

        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i>=0 || j>=0 || carry!=0){
            int bitA=i>=0?a.charAt(i)-'0':0;
            int bitB=j>=0?a.charAt(j)-'0':0;
             int sum=bitB+bitA+carry;
             int curvalue=sum%2;
             carry=sum/2;
             st.insert(0,curvalue);
             i--;
             j--;
        }

        System.out.println("Sum: " + st);
    }
}


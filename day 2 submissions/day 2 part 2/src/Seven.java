import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String s = read.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!=' ' && (i==0 || s.charAt(i-1)==' ')) {
                count++;
            }
        }
        System.out.println(count);
    }

    //public static boolean isSpcl(char c) {
    // return c == ' ' || c == ',' || c == '!' || c == '@' || c == '#' || c == '$' || c == '%' || c == '^' || c == '&' || c == '*' || c == '(' || c == ')';
}//


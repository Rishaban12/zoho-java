import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String s = read.next();
        String t = read.next();
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        if (i == s.length()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
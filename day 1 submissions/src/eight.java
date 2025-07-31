import java.util.Scanner;
public class eight {
static int findSet(int n) {
    int pos = 1;
    if (n > 1) {
        n = n >> 1;
        pos++;
    }
    return pos;
}
public static void main(String[] args){
    Scanner read= new Scanner(System.in);
        System.out.println("enter the number");
        int n=read.nextInt();
        int res=n & 1;
        System.out.println(findSet(res));
    }

}


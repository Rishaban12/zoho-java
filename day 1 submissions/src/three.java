import java.util.Scanner;
public class three {

    Scanner read =new Scanner(System.in);

    int a= read.nextInt();

int b= read.nextInt();
void max(){


    int max=a>b?a:b;
    System.out.println(max);
}
public static void main(String[] args){
    three data = new three();
    data.max();
}
}

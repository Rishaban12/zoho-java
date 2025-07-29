import java.util.Scanner;

public class Three {
    public static void main(String[] args){
        Scanner read= new Scanner(System.in);
        String str=read.next();

       char[] arr=str.toCharArray();
       int left=0;
       int right=arr.length-1;
       while(left<right){
           if(left<right && !isVowel(arr[left])){
               left++;
           }
           if(left<right && !isVowel(arr[right])){
               right--;
           }
           char temp=arr[left];
           arr[left]=arr[right];
           arr[right]=temp;

           left++;
           right--;
       }
        System.out.println(arr);
    }
    public static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';    }
}

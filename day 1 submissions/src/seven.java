import java.util.Scanner;
public class seven {

    public static void main(String[] args){
        int num=44;

        String number="";
        while(num>0) {
            int remainder = num % 2;
            number = remainder + number;
            num = num / 2;
        }
        if(number.equals("")){
            number="0";}
for(int i=number.length()-1;i>=0;i--){
    if(number.charAt(i)=='1'){
        System.out.println(number.length()-1-i);
        break;
    }
}

    }

}

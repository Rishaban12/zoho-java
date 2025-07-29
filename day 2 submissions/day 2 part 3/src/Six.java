public class Six {
    public static void main(String[] args){
        int num=21;
        String number="";
        while(num>0) {
            int remainder = num % 2;
            number = remainder + number;
            num = num / 2;
        }
        if(number.equals("")){
            number="0";}
        System.out.println(number);

    }
    }


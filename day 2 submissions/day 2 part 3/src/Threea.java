public class Threea {
    public static void main(String[] args){
        int num=1;
        int row=1;
        while(row<=5){
            int spaces=0;
            if(row<=3) {
                spaces = 3 - row + 1;
            }
            if(row>3){
                spaces=row-3+1;
            }
             int s=1;
            while(s<=spaces){
                System.out.print(" ");
                s++;
            }
            int nums;
            if(row<=3){
                nums=row;
            }
            else{
                nums=6-row;
            }
            int n=1;
            while(n<=nums){
                System.out.print(num+" ");
                num++;
                n++;
            }
            System.out.println();
            row++;
        }
    }
}

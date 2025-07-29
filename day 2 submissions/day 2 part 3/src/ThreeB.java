public class ThreeB {
    public static void main(String [] main){
        int row=1;
      while(row<=5){
           /*int spaces=1;
            if(row<=3){
                spaces=3-row+1;
            }
            else{
                spaces=row-3+1;
            }
            int s=1;
            while(s<=spaces){
                System.out.print(" ");
                s++;
            }*/
            int n=1;

            if(row<=3){
              n=row;
            }else{
                n=6-row;
            }
            int i=1;
            while(i<=n){
                System.out.print("W"+" ");
                i++;
            }
            System.out.println();
            row++;
        }
    }
}

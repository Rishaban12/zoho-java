public class Twob {


    public static void main(String[] args) {
        int n = 9;
        int s= 8;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <s; j++) {
                if ((i == 0)  || (i == n/2) ||j==0 || ((i==j+1)&&(i>n/2)) || ((j==s-1)&&(i<n/2))) {
                    System.out.print("R ");
                }

                else{
                    System .out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

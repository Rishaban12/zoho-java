public class FourA {

    public static int factorial(int n){
        int i=1;
        int fact=1;
        do{
            fact*=i;
            i++;
        }while(i<=n);
        return fact;
    }
    static int nCr(int n, int r){
        return factorial(n)/(factorial(r)*factorial(n-r));
    }

    public static void main(String[] args) {
        int rows = 6;
        int i = 0;

        do {
            int space = rows - i;
            int s = 0;
            do {
                System.out.print(" ");
                s++;
            } while (s < space);

            int j = 0;
            do {
                System.out.print(nCr(i, j) + " ");
                j++;
            } while (j <= i);

            System.out.println();
            i++;
        } while (i < rows);
    }
}

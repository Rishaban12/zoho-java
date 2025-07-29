public class Twoa {
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.print("1");
                }
                else if(4-i==j){
                    System.out.print("1");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

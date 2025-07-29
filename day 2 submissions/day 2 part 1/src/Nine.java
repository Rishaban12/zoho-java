import java.util.Scanner;

public class Nine {
    public static void main(String[] args){
        int students=10;
        int[][] marks=new int [students][3];
        int[] rollNo=new int[students];
        int[] total= new int[students];
        double[] average=new double[students];
        for(int i=0;i<10;i++){
            Scanner read= new Scanner(System.in);
            System.out.println("Enter roll number for student " + (i + 1) + ":");
            rollNo[i]=read.nextInt();
            for(int j=0;j<3;j++){
                System.out.println("Enter marks for 3 subjects:");
                marks[i][j]=read.nextInt();
                total[i]+=marks[i][j];
            }
            average[i]=total[i]/3.0;
        }
        System.out.println("\nROLL NO\tTOTAL\tAVERAGE");
        for (int i = 0; i < students; i++) {
            System.out.printf("%d\t%d\t%.2f\n", rollNo[i], total[i], average[i]);
        }
    }
}


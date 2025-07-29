public class Four {
    void print(int[] arr, int n){
            int singleDimension=0;
            int doubleDimension=0;
            for(int i=0;i<n;i++) {
                if (arr[i] <= 9) {
                    singleDimension += arr[i];

                } else {
                    doubleDimension += arr[i];
                }
            }
                System.out.println(singleDimension);
                System.out.println(doubleDimension);


    }
    public static void main(String[] args){
        int n=4;
        int[] arr=new int[]{2,4,12,12};
        Four res= new Four();
        res.print(arr, 4);
    }
}

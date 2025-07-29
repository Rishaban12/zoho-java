public class Seven {
    public static void main(String[] main){
        int[] arr={5,2,9,7,0,10,4,15,21,11};
        for(int i=0;i<arr.length;i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
          for(int num:arr){
              System.out.println(num);
          }
        }
        }


public class Six {
    public static void main(String[] args){
        int[] year={1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2022};
        int low=0;
        int key=2007;
        int high = year.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(year[mid]==key){
                System.out.println(mid);
                break;

            }
            else if(year[mid]<key){
                low=mid+1;
            }
            else if(year[mid]>key){
                high=mid-1;
            }

        }
    }
}

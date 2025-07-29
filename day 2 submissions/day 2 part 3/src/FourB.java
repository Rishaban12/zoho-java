public class FourB {
    public static void main(String[] args){
        int i=0;
        String word="ZOHOCORPORATIONS";
        int length=word.length();
        do{
            int j=0;
            do{
                if(i+j<length){
                    System.out.print(word.charAt(i+j));
                }
            }while(++j<4);
            System.out.println();
            i+=4;
        }while(i<length);
    }
}

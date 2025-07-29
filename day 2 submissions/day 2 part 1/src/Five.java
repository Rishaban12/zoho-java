public class Five {
    public static void main(String[] args){
        char[] X= new char[]{'m','n','o','p'};
        char[] Y= new char[]{'m','n','o','p'};
   boolean isEqual=true;

        for(int i=0;i<X.length;i++){
            if(X[i]!=Y[i]){
              isEqual=false;
              break;
            }
        }
        System.out.println(isEqual);
    }
}

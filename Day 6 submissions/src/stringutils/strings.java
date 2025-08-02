package stringutils;

public class strings {
    public void concat(String a, String b){
        int len=a.length();
        int len1=b.length();
        char[] res=new char[len+len1];
        for(int i=0;i<len;i++){
            res[i]=a.charAt(i);
        }
        for(int i=0;i<len1;i++){
            res[len+i]=b.charAt(i);
        }
        String resString=new String(res);
        System.out.println(resString);
    }
    public void reverse(String a) {
        char[] res = new char[a.length()];
        for (int i = 0; i < res.length; i++){
                res[i] = a.charAt(a.length()-1-i);
    }
        String resultString=new String(res);
        System.out.println(resultString);
    }
    public int length(String a){
        return a.length();
    }
}

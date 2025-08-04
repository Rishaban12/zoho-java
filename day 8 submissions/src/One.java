class Singleton{
    private static Singleton obj=new Singleton();
    private Singleton(){
        System.out.println("singleton class");
    }
    public static Singleton getInstance(){
        return obj;
    }

    /*private static Singleton obj=null;
    private Singleton{}
    private static Singleton getInstance(){
        if(obj==null)
            obj=new Singleton();
    }
    private static synchronized Singleton getInstance(){
        if(obj==null)
            obj=new Singleton();
    }*/
}
public class One {
    public static void main(String[] args) {
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        System.out.println(s1==s2);
    }
}

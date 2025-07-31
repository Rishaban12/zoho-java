    public class five {
static{
    System.out.println("static block");
}   {
            System.out.println("initializer block");
        }
         five(){
             System.out.println("constructor block");
}
public static void main(String[] args){
    five obj =new five();

}
}


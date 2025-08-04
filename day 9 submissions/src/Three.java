public class Three {
    public static void main(String[] args) {
        try{
            Class.forName("jdbc-jar-notSpellCorrect");
            System.out.println("Driver class is loaded successfully");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver class is not found");
            System.out.println(e.getMessage());
        }
    }
}

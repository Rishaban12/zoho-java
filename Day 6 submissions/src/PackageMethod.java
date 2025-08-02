import arithmetic.calc;
import stringutils.strings;

public class PackageMethod {
    public static void main(String[] args) {
        calc op = new calc();
        op.addition(12, 23);
        op.subtraction(54, 98);
        op.multiplication(63, 22);
        op.modulus(12, 2);

        strings st = new strings();
         st.concat("rishab","san");
         st.reverse("rishaban");
        System.out.println(st.length("rishaban"));
    }
}

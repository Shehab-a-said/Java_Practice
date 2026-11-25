package SessionsOfJava;

import java.text.DecimalFormat;

public class MathOperations {
    public static void main(String[] args) {

        double x = 5.569;

        System.out.println(new DecimalFormat("#.#").format(x));

        System.out.println(Math.round(x));  // round by math rules
        System.out.println(Math.floor(x));  //round down
        System.out.println(Math.ceil(x));   // round up


    }
}

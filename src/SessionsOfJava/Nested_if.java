package SessionsOfJava;

public class Nested_if {
    public static void main(String[] args) {

        String name = "shehab" ;
        int grade = 100 ;

       // System.out.println(name == "shehab" && grade ==100); //wrong way to compare strings
        if (name.equalsIgnoreCase("ShehaB") && grade ==100)  // to ignore case
            System.out.println("pass");
        // This is the right way to compare string (variable name.equals OR variable name.equalsIgnoreCase)
        // in this way of two conditions compiler checks two conditions in the same time

        // So, Nested if is used to check two conditions one by one

        if (name.equalsIgnoreCase("shehab"))
            {
                System.out.println("hello shehab");
                if (grade >= 100)
                    {
                        System.out.println("you Passed shehab");
                    }
            }

    }
}

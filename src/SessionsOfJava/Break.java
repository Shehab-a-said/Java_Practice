package SessionsOfJava;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int sum=0;
        int counter =1;

        while (counter <= 5)
        {
            System.out.println(" please enter number " + counter);
            number = input.nextInt();

            if (number < 0)
            {
                System.out.println("negative numbers not allowed");
                break; // when this condition is true break exit the while loop
                /* After the break statement, the remaining of the statements inside the loop are skipped.
                 Then, execution continues starting at the first statement after the loop. */
            }
            else
            {
                sum = sum +number;
                counter++;
            }
        }
        System.out.println("summation of your positive numbers is "+ sum);

    }
}

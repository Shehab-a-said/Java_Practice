package SessionsOfJava;

import java.util.Scanner;

public class Continue {
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
                continue;
                // when this condition is true skip the rest of code and go back to the beginning of the loop
                /* The continue statement skips the remaining statements inside the loop;
                 and proceeds with the next iteration*/
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

package SessionsOfJava;

import java.util.Scanner;

public class FlagLoop {
    public static void main(String[] args) {

        System.out.println("enter positive number to add and negative number to stop addition");
        Scanner input = new Scanner(System.in);
        double number ;
        double sum = 0;
        boolean positiveNumber = true;

        while (positiveNumber)
        {
            System.out.println("enter positive number to add ");
            number = input.nextDouble();

            if (number < 0) // flag to exit loop if user enter negative number
                positiveNumber = false;
            else
                sum = sum + number;
        }
        System.out.println("the sum of positive numbers =" + sum);
    }
}

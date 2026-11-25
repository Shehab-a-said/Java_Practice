package SessionsOfJava;

import java.util.Scanner;

public class ScannerC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float FirstNumber;
        int SecondNumber;
        float result;
        System.out.println("enter first number");
        FirstNumber =input.nextFloat();

        System.out.println("enter Second Number");
        SecondNumber = input.nextInt();

        result=FirstNumber*SecondNumber;
        System.out.println("result is :" + result);

    }
}

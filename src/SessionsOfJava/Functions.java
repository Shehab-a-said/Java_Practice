package SessionsOfJava;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 number");
        int num1 =input.nextInt();
        int num2 =input.nextInt();
        int num3= input.nextInt();
       int summation= sum(num1,num2,num3);
       double avg =average(num1,num2,num3);
        display(summation,avg);

    }

    public static int sum (int x , int y , int z)
    {
        return x+y+z ;
    }

    public static double average (int x, int y , int z)
    {
        return  sum(x, y, z) /3.0;
    }

    public static void display (int s , double a)
    {
        System.out.println( "summation of 3 numbers =" + s);
        System.out.println( "average of 3 numbers = " +a);
    }

}


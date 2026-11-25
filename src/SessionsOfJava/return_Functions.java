package SessionsOfJava;

public class return_Functions {

    public static void main(String[] args)
    {
        // Function calling
       int result = sum(10,20);//  x ,y are arguments
        System.out.println( "result = "+ result);
        int total = result *2 +5;
        System.out.println("total =" + total);

        int result2 = sum(3,5);
        System.out.println("result2 =" + result2);
    }


    // Function declaration
    // this is the header line
    public static int sum ( int x , int y)  // x,y are parameters

    { // this is the function body
        return x+y ;
    }

}

package math.problems;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
       int n = 5;
       int result = 1;
       for(int i = 1;i <=n;i++) {


           result = result *i;
           System.out.println("the Factorial of a given number is " + result);
       }
    }
}

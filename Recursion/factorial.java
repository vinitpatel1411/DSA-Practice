package Recursion;

public class factorial {
    public static void main(String[] args){
        SolutionFactorial obj = new SolutionFactorial();
        int n = 5;
        int result = obj.factorial(n);
        System.out.println("The Factorial of " + n + " is: " + result);
    }
}

class SolutionFactorial {
    public int factorial(int n){
        if(n==0 || n==1)
            return 1;
        return n * factorial(n-1);
    }
}
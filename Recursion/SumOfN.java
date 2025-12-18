package Recursion;

public class SumOfN {
    public static void main(String[] args) {
        SolutionSumOfN obj = new SolutionSumOfN();
        int n = 7;
        int result = obj.sumOfN(n);
        System.out.println("The sum of first " + n + " natural numbers is: " + result);
    }
}

class SolutionSumOfN {
    public int sumOfN(int n){
        if(n==1)
            return 1;
        return n + sumOfN(n-1);
    }
}
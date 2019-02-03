import java.util.ArrayList;
public class recursion{
    public static double sqrt(double n, double tolerance){
      return sqrtH(n, 1, tolerance);
    }
    public static double sqrtH(double n, double guess, double percent){//helper function
    if (Math.abs(guess*guess - n) <= percent){//base case is if the guess is close enough to the actual squre root based on tolerance
      return guess;
    }
    else guess = (n /guess + guess)/2;//else guess is replaced w more accurate number and function called again
    return sqrtH(n, guess, percent);
    }

    public static int fib(int n){
      if (n == 0 || n==1)
      return n;
        else return fib(n-1) + fib(n-2);
    }

    public static ArrayList<Integer> makeAllSums(int n){
      ArrayList<Integer> finals = new ArrayList<Integer>();
      return makeAllSumsH(n, 0, finals);
    }



public static void main(String[] args) {
  System.out.println(makeAllSums(3));
  System.out.println(sqrt(2.0, 0.000001));
}
}

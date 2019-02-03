import java.util.ArrayList;
public class recursion{
    public static double sqrt(double n, double tolerance){
      return sqrtH(n, 1, tolerance);
    }
    public static double sqrtH(double n, double guess, double percent){//sqrtH is helper

    }

    public static int fib(int n){
      if (n == 0 || n==1)
      return n;
        else return fib(n-1) + fib(n-2);
    }

    public static ArrayList<Integer> makeAllSums(int n){
      ArrayList<Integer> finals = new ArrayList<Integer>();//makeAllSUmsH is helper
      return makeAllSumsH(n, 0, finals);
    }



public static void main(String[] args) {
  System.out.println(makeAllSums(3));
  System.out.println(sqrt(2.0, 0.000001));
}
}

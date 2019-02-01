public class recursion{
    public static double sqrt(double n, double tolerance){
      return sqrtH(n, 1, tolerance);
    }
    public static double sqrtH(double n, double guess, double percent){
      if (Math.abs(guess * (n - guess)) <= percent)
      return guess;
      else {
        guess = (n/guess + guess) / 2
      }
    }
}

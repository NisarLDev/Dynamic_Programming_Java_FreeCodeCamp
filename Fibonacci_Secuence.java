import java.util.HashMap;

class Source {

  public static int fib(int n) {
    fib(n, new HashMap<>())
    
  }
  //Main function with supercharged method
  public static init fib(int n, HashMap<Integer, Integer> memo) {
    if (n == 0 || n == 1) {
      return n;
    }
    return fib(n - 1) + fib(n - 2);
  }
public static void run() {
  // This function behaves as 'main()' for the 'run' command
  // you may sandbox in this function, but should not remove it
}
  
}

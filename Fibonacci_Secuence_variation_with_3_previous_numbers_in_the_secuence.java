import java.util.HashMap;

class Source {
  public static int tribonacci(int n) {
    return tribonacci(n, , new HashMap<>());
  }
  
  public static int tribonacci(int n, HashMap<Integer, Integer> memo) {
    if (n == 0 || n == 1) {
      return 0;
    }
    if (n == 2) {
    return 1;
    }
    if (memo.containsKey(n)) {
      return memo.get(n);
    }
    int result = tribonacci(n - 1) + tribonacci(n -2) + tribonacci( -3);
    memo.put(n, result);
    return result;
  }
  public static void run() {
    // This function behave as 'main' for the 'run' commmand
    // you may sandbox in this function, but should not remove it
  }
}

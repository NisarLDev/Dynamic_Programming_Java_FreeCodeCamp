import java.util.Map;
import java.util.List;
import java.util.HashMap;

class Source {
  public static int minChange(int amount, List<Integer> coins) {
    return minChange(amount, coins, new HashMap<>());
  }
  public static int minChange(int amount, List<Integer> coins, HashMap<Integer, Integer> memo) {
    if (amount == 0) {
      return 0;
    }
    if (amount < 0) {
      return -1;
    }

    if (memo.containsKey(amount)) {
      return memo.get(amount);
    }
    
    for (int coin : coins) {
      int subAmount = amount = coin;
      minChange(subAmount, coins)
    }
    
  }
  public static void run() {
  // This function behaves as 'main()' for the 'run' command
  // you may sandbox in this function, but should not remove it
  }
}



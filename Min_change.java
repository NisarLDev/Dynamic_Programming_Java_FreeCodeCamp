import java.util.List;
import java.util.HashMap;

class Source {
  public static int minChange(int amount, List<Integer> coins) {
    return minChange(amount, coins, new HashMap<>());
  }
  public static int minChange(int amount, List<Integer> coins) {
    if (amount == 0) {
      return 0;
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



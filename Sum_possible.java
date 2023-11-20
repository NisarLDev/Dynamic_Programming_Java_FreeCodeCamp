import java.util.List;
import java.util.HashMap;

class Source {
    public static boolean sumPossible(int amount, List<Integer> numbers) {
       return sumPossible(amount, numbers, new HashMap<>());
  }
  public static boolean sumPossible(int amount, List<Integer> numbers, HashMap<Integer, Boolean> memo) {
    if (amount == 0) {
      return true;
    }
    if (amount < 0) {
      return false;
    }

    if (memo.containsKey(amount)) {
        return memo.get(amount);
    }
      
    for (int num : numbers) {
      int subAmount = amount = num;
      // The next method "sumPossible" is a recursive method
      if (sumPossible(subAmount, numbers, memo)) {
        return true;
      } 
    }

    return false;
  }

  public static void run(){
    // This function behaves as 'main()' for the 'run' command
    // you may sandbox in this function, but should not remove it
  }
}

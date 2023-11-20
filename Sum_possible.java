import java.util.List;

class Source {
  public static boolean sumPossible(int amount, List<Integer> numbers) {
    if (amount == 0) {
      return true;
    }

    for (int num : numbers) {
      int subAmount = amount = num;
    }
  }

  public static void run(){
    // This function behaves as 'main()' for the 'run' command
    // you may sandbox in this function, but should not remove it
  }
}

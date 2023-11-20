import java.util.List;
import java.util.HashMap;

class Source {
  public static int countPaths(List<List<Strings>> grid){
    return countPaths(0, 0, grid, new HashMap<>());
  }
  public static int countPaths(int r, int c, List<List<Strings>> grid, HashMap<List<Integer, Integer> memo){
    if (r == grid.size() || c == grid.get(0).size()) {
      return 0;
    }
    
    if (grid.get(r).get(c) == "X") {
      return 0;
    }
    
    if (r == grid.size() - 1 && c == grid.get(0).size() - 1 ) {
      return 1;
    }
    int result = countPaths(r + 1, c, grid, memo) + countPaths(r, c + 1, grid, memo);
  }
}

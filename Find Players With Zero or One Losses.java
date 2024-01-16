import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<List<Integer>> findWinners(int[][] matches) {
    Set<Integer> winners = new HashSet<>();
    Map<Integer, Integer> losers = new HashMap<>();

    for (int[] match : matches) {
        winners.add(match[0]);
        losers.put(match[1], losers.getOrDefault(match[1], 0) + 1);
    }

    List<Integer> noLosses = new ArrayList<>();
    List<Integer> oneLoss = new ArrayList<>();

    for (int winner : winners) {
        if (!losers.containsKey(winner)) {
            noLosses.add(winner);
        } else if (losers.get(winner) == 1) {
            oneLoss.add(winner);
        }
    }

    for (Map.Entry<Integer, Integer> entry : losers.entrySet()) {
        if (entry.getValue() == 1 && !winners.contains(entry.getKey())) {
            oneLoss.add(entry.getKey());
        }
    }

    Collections.sort(noLosses);
    Collections.sort(oneLoss);

    return Arrays.asList(noLosses, oneLoss);
}
}

class Main 
{
    public static void main(String args[])
     {
        Solution ob = new Solution();
        int[][] matches = {{1, 2}, {2, 3}, {3, 4}, {4, 1}};
        List<List<Integer>> result = ob.findWinners(matches);
        System.out.println(result);
    }
}

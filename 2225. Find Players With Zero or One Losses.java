import java.util.*;

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int[] arr: matches) {
            int winner = arr[0];
            int loser = arr[1];
            
            map.put(winner, map.getOrDefault(winner, 0));
            map.put(loser, map.getOrDefault(loser, 0) + 1);
        }
        
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> ans1 = new ArrayList<Integer>();
        List<Integer> ans2 = new ArrayList<>();
        for (Integer player : map.keySet()) {
            if (map.get(player) == 0) {
                ans1.add(player);
            } 
            
            if (map.get(player) == 1) {
                ans2.add(player);
            }
        }
        
        res.add(ans1);
        res.add(ans2);
        
        return res;
        
    }
}

//--------------------
class Solution {
  public List<List<Integer>> findWinners(int[][] matches) {
    
    Map<Integer, Integer> lossesCount = new TreeMap<>();

    for (int[] m : matches) {
        lossesCount.put(m[0], lossesCount.getOrDefault(m[0], 0));
        lossesCount.put(m[1], lossesCount.getOrDefault(m[1], 0) + 1);
    }

    List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> ans1 = new ArrayList<Integer>();
        List<Integer> ans2 = new ArrayList<>();
        for (Integer player : lossesCount.keySet()) {
            if (lossesCount.get(player) == 0) {
                ans1.add(player);
            } 
            
            if (lossesCount.get(player) == 1) {
                ans2.add(player);
            }
        }
        
        res.add(ans1);
        res.add(ans2);
        
        return res;
  }
}



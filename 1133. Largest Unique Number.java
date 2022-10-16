import java.util.*;
import java.lang.*;

class Solution {
    public int largestUniqueNumber(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int res = -1;
        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for (Integer num: map.keySet()) {
            if (map.get(num) == 1) {
                res = Math.max(res, num);
            }
        }
        
        return res;
        
    }
}

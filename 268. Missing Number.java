import java.util.*;

class Solution {
    public int missingNumber(int[] nums) {
        int[] fullNum  = new int[nums.length + 1];
        for (int i = 0; i <= nums.length; i++) {
            fullNum[i] = i;
        }
        
        HashSet<Integer> numsHash = new HashSet<Integer> ();
        for (int i: nums) {
            numsHash.add(i);
        }
        
        for (int i: fullNum) {
            if (!numsHash.contains(i)) {
                return i;
            }
        }
        
        return -1;
        
    }
}

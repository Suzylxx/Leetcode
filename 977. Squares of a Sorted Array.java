import java.util.*;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int res[] = new int[nums.length];
        int i = 0;
        for (int num: nums) {
            res[i] = num * num;
            i++;
        }
        Arrays.sort(res);
        
        return res;
    }
}

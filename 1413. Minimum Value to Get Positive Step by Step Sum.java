import java.lang.*;

class Solution {
    public int minStartValue(int[] nums) {
        
        int sum = 0;
        int min = Integer.MAX_VALUE;
        
        for (int i: nums) {
            sum += i;
            min = Math.min(min, sum);
        }
        
        if (min < 1) {
            return (1 - min);
        }
        
        return 1;
        
    }
}

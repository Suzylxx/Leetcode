import java.lang.*;

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        max = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i-k];
            max = Math.max(max, sum);
        }
        return max / k;
    }
}

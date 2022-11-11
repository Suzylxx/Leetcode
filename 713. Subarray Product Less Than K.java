//Sample Solution - Sliding Windown
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int prod = 1, ans = 0, left = 0;
        for (int right = 0; right < nums.length; right++) {
            prod *= nums[right];
            while (prod >= k) prod /= nums[left++];
            ans += right - left + 1;
        }
        return ans;
    }
}

//Debug Version, failed certain test cases
import java.util.*;

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            System.out.println("--------------");
            System.out.println("Iteration: " + i);
            int product = nums[i];
            if (product < k) {
                res += 1;
            }
            System.out.println("Initial product is: " + product);
            while (j < nums.length) {
                System.out.println("**");
                product *= nums[j];
                if (product < k) {
                res += 1;
                }
                j += 1;
                System.out.println("Result #: " + res);
                System.out.println("j at index: " + j);
                System.out.println("product is: " + product);
            }
            System.out.println("***Final***");
            System.out.println("Final product is: " + product);
            System.out.println("Result #: " + res);
        }

        return res;
    }
}

//Modified Sample Solution
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k == 0) return 0;
        int prod = 1, ans = 0, left = 0;
        for (int right = 0; right < nums.length; right++) {
            prod *= nums[right];
            while (prod >= k && left <= right) prod /= nums[left++];
            ans += right - left + 1;
        }
        return ans;
    }
}

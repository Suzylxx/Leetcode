//Debug Version
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int left= 0;
        int curr = 0;
        int max = 0;
        int length = 0;
        
        for (int right = 0; right < nums.length; right++) {
            System.out.println("Iteration #: " + right);
            while (left < nums.length && nums[left] != 0) {
                System.out.println("Left is not 0 at index: " + left);
                left++;
            }
            System.out.println("Left is 0 at index: " + left);
            if (nums[right] == 0 && right == nums.length - 1) {
                curr = right;
                length = curr - left + 1;
                max += length * (length + 1) / 2;
            } else if (nums[right] == 0) {
                curr = right;
                System.out.println("Right is 0 at index: " + right);
                System.out.println("Curr is: " + curr);
            } else if (curr >= left) {
                System.out.println("Right is not 0 at index: " + right);
                System.out.println("Curr is: " + curr);
                length = curr - left + 1;
                max += length * (length + 1) / 2;
                left = right;
                System.out.println("Max is: " + max);
                System.out.println("Left index is: " + left);
            } else {
                continue;
            }
        }
        return max;
    }
}

//Final Version
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long max = 0;
        int sub = 0;
        
        for (int num: nums) {
            if (num == 0) {
                sub++;
            } else {
                sub = 0;
            }
            max += sub;
        }
        return max;
    }
}

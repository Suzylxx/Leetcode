class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        if (k > nums.length) {
            return 0;
        }
        int res = 0;
        int left = 0;
        int right = 0;
        int count = 0;
        int temp = 0;

        while (right < nums.length && left  < nums.length) {
            if (nums[right] % 2 == 1) {
                count += 1;
                temp = 0;
            }
            while (count == k) {
                temp += 1;
                if (nums[left] % 2 == 1) {
                    count -= 1;
                }
                left += 1;
            } 
            res += temp;
            right += 1;
        }
        return res;
    }
}

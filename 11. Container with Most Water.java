//Brute Force
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int volume = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                if (height[i] < height[j]) {
                    volume = height[i] * (j - i);
                } else {
                    volume = height[j] * (j - i);
                }
                if (volume > max) {
                    max = volume;
                }
            }
        }
        return max;
    }
}

//Opt Time Complexity
import java.lang.*;
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        
        while (left < right) {
            int width = right - left;
            if (height[left] < height[right]) {
                max = Math.max(max, width * height[left]);
            } else {
                max = Math.max(max, Math.min(height[left], height[right]) * width);
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return max;
    }
}

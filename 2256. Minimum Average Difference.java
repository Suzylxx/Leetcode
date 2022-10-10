//Debug Version
import java.lang.*;

class Solution {
    public int minimumAverageDifference(int[] nums) {
        
        int min = 0;
        int total = 0;
        int sumLeft = 0;
        int sumRight = 0;
        int res = 0;
        
        for (int num : nums) {
            total += num;
        }
        
        min = total;
        
        for (int i = 0; i < nums.length; i++) {
            System.out.println("########## " + i);
            sumLeft += nums[i];
            sumRight = total - sumLeft;
            System.out.println("Avg left: " + (int)Math.floor(sumLeft / (i+1)));
            System.out.println("Avg right: " + (int)Math.floor(sumRight / (nums.length - i - 1)));
            int diff = Math.abs((int)Math.floor(sumLeft / (i+1)) - (int)Math.floor(sumRight / (nums.length - i - 1)));
            System.out.println("Diff is: " + diff);
            System.out.println("Min is: " + min);
            if (diff < min) {
                min = diff;
                System.out.println("Index is: " + i);
                res = i;
            }
        }
        
        return res;
    }
}

//Final Version
import java.lang.*;

class Solution {
    public int minimumAverageDifference(int[] nums) {
        
        long min = 0;
        long total = 0;
        long sumLeft = 0;
        long sumRight = 0;
        long diff = 0;
      int res = 0;
        
        for (int num : nums) {
            total += num;
        }
        
        min = total;
        
        for (int i = 0; i < nums.length; i++) {
            sumLeft += nums[i];
            sumRight = total - sumLeft;
            
            if (i == nums.length - 1) {
                diff = Math.abs((int)Math.floor(sumLeft / (i+1)) - sumRight);
            } else {
                diff = Math.abs((int)Math.floor(sumLeft / (i+1)) - (int)Math.floor(sumRight / (nums.length - i - 1)));
            }
            
            if (diff < min) {
                min = diff;
                res = i;
            }
        }
        return res;
    }
}

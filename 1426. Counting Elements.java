import java.util.*;

class Solution {
    public int countElements(int[] arr) {
        int res = 0;
        HashSet<Integer> hashArr = new HashSet<Integer> ();
        for (int i: arr) {
            hashArr.add(i);
        }
        
        for (int i: arr) {
            if (hashArr.contains(i + 1)) {
                res += 1;
            }
        }
        
        return res;
        
    }
}

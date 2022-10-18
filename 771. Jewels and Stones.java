class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> jewelsMap = new HashMap<>();
        HashMap<Character, Integer> stonesMap = new HashMap<>();
        int res = 0;
        
        for (int i = 0; i < jewels.length(); i++) {
            jewelsMap.put(jewels.charAt(i), jewelsMap.getOrDefault(jewels.charAt(i), 0) + 1);
        }
        
        for (int i = 0; i < stones.length(); i++) {
            stonesMap.put(stones.charAt(i), stonesMap.getOrDefault(stones.charAt(i), 0) + 1);
        }
        
        for (Character c : stonesMap.keySet()) {
            if (jewelsMap.containsKey(c)) {
                res += stonesMap.get(c);
            }
        }
        
        return res;
    }
}

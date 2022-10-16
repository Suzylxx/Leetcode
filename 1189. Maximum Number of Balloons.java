import java.util.*;

class Solution {
    public int maxNumberOfBalloons(String text) {
        
        Map<Character, Integer> map = new HashMap<>();
        map.put('b', 0);
        map.put('a', 0);
        map.put('l', 0);
        map.put('o', 0);
        map.put('n', 0);
        
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'b') {map.put('b', map.getOrDefault('b', 0) + 1);} 
            if (text.charAt(i) == 'a') {map.put('a', map.getOrDefault('a', 0) + 1);} 
            if (text.charAt(i) == 'l') {map.put('l', map.getOrDefault('l', 0) + 1);} 
            if (text.charAt(i) == 'o') {map.put('o', map.getOrDefault('o', 0) + 1);} 
            if (text.charAt(i) == 'n') {map.put('n', map.getOrDefault('n', 0) + 1);} 
        }
        
        ArrayList<Integer> appearNum = new ArrayList<>();
        
        for (Character c : map.keySet()) {
            if (c == 'l' || c == 'o') {
                appearNum.add(map.get(c) / 2);
            } else {
                appearNum.add(map.get(c));
            }
        }
        
        Collections.sort(appearNum);
        
        return appearNum.get(0);
    }
}

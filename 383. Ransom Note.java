class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> noteMap = new HashMap<>();
        HashMap<Character, Integer> magazineMap = new HashMap<>();
        
        for (int i = 0; i < ransomNote.length(); i++) {
            noteMap.put(ransomNote.charAt(i), noteMap.getOrDefault(ransomNote.charAt(i), 0) + 1);
        }
        
        for (int i = 0; i < magazine.length(); i++) {
            magazineMap.put(magazine.charAt(i), magazineMap.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        
        for (Character c : noteMap.keySet()) {
            System.out.println(c);
            System.out.println(noteMap.get(c));
            System.out.println(magazineMap.get(c));
            if (magazineMap.containsKey(c)) {
                if (noteMap.get(c) > magazineMap.get(c)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        
        return true;
        
    }
}

//Mine
import java.util.*; 

class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        HashSet<Character> sentenceC = new HashSet<Character> ();
        for(int i = 0; i < sentence.length(); i++) {
            sentenceC.add(sentence.charAt(i));
        }
        
        for (char c: alphabet) {
            if (!sentenceC.contains(c)) {
                return false;
            }
        }
        
        return true;
    }
}

//Better Approach
import java.util.*; 

class Solution {
    public boolean checkIfPangram(String sentence) {
        // Empty set 'seen'.
        Set<Character> seen = new HashSet<>();
        
        // Iterate over 'sentence' add every letter to 'seen'.
        for (char currChar : sentence.toCharArray())
            seen.add(currChar);
        
        // If the size of 'seen' is 26, then 'sentence' is a pangram.
        return seen.size() == 26;
    }
}

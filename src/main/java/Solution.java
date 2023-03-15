import java.util.HashMap;
import java.util.Map;

class Solution {
    /*
    Hashmap solution
     */
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        //K = character, V = frequency
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        //fill in the map
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            Integer frequency = charFrequencyMap.get(c);

            if(frequency == null) {
                return false;
            } else if(frequency == 1) {
                charFrequencyMap.remove(c);
            } else {
                charFrequencyMap.replace(c, frequency - 1);
            }
        }


        if(charFrequencyMap.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
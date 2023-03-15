import java.util.HashMap;
import java.util.Map;

class Solution {
    /*
    HashMap

    This solution is nearly optimal. It uses the characteristics of the HashMap structure to track the frequency
    of characters. In the map, the character is K, and the frequency is V.
    We fill in the map by adding characters as we encounter them in s. If the character is already in the map,
    we increment the frequency count. Otherwise we add it.

    Later we do the opposite, decrementing the frequency of each character encountered in t, or removing the entry
    if it would drop to 0. When finished all we need to do is check if the map is empty.
     */
    public boolean isAnagram(String s, String t) {
        //Can we short circuit the problem?
        if(s.length() != t.length()) {
            return false;
        }

        //Create and populate the map. K = character, V = frequency
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }

        //use the map to check the frequency of each character in t
        for(int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            Integer frequency = charFrequencyMap.get(c);


            if(frequency == null) {//if frequency is null, then that character is not in the map.
                return false;
            } else if(frequency == 1) {//if the frequency is 1, remove it rather than decrement
                charFrequencyMap.remove(c);
            } else {//if neither null nor 1, then decrement the frequency of that character
                charFrequencyMap.replace(c, frequency - 1);
            }
        }

        //if empty, the strings are anagrams. Otherwise, s has characters that t does not.
        if(charFrequencyMap.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
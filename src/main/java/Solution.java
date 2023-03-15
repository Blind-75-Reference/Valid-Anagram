class Solution {
    /*
    Frequency Array - This solution is very similar to the HashMap solution, but is a bit faster because it removes
    some of the overhead involved with creating and maintaining those complex data structures.

    We create an array of length 26, enough room for each letter of the alphabet. Each index corresponds to a letter
    from a to z. This is done by subtracting the ascii value of 'a' from the character, creating an offset where a -> 0
    and z-> 26.

    We iterate through s increasing the frequency of each letter encountered. Then we iterate through t decrementing the
    frequency for each letter encountered. When we are done we iterate through the frequency array and make sure every
    element equals 0. If we find any non-zero elements, the strings were not anagrams.
     */
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        int[] frequencyArray = new int[26];

        for(int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            frequencyArray[c]++;
        }

        for(int i = 0; i < t.length(); i++) {
            int c = t.charAt(i) - 'a';
            frequencyArray[c]--;
        }

        for(int i = 0; i < frequencyArray.length; i++) {
            if(frequencyArray[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
import java.util.Arrays;

class Solution {
    /*
    Sort First

    With this solution we get a character array for each string and sort them. Once sorted, if the strings are anagrams,
    they should be the same and we simply compare them. If they aren't the same, they weren't anagrams.

    We can also short circuit the problem if we get two strings with differing length. If we find that to be the case,
    we can return false without checking anything else.
     */
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        for(int i = 0; i < sArray.length; i++) {
            if(sArray[i] != tArray[i]) {
                return false;
            }
        }


        return true;
    }
}
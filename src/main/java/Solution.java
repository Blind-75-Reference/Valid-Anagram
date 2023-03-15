class Solution {
    /*
    Brute Force

    In this solution we iterate through s checking if t contains each character. If so, we remove the first instance
    of that character from t. If we ever find a character that is not present in t, we return false.

    Once we have finished, if t is an anagram of s it will be empty.
     */
    public boolean isAnagram(String s, String t) {
        for(int i = 0; i < s.length(); i++) {
            if(t.contains(s.substring(i, i + 1))) {
                t = t.replaceFirst(s.substring(i, i + 1), "");
            } else {
                return false;
            }
        }

        if(t.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
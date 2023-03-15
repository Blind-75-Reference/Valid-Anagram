class Solution {
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
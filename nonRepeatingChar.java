public class nonRepeatingChar {
    public static void main (String[] args){
        System.out.println(Solution.lengthOfLongestSubstring("pwwkew"));
    }
}

class Solution {
    public static int lengthOfLongestSubstring(String s) {
        return longestSubstring(s).length();
    }

    public static String longestSubstring(String s){
        if (s.isEmpty()) return s;
        boolean isRepeated = false;
        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < s.length(); j++){
                if(i == j) continue;
                if (s.charAt(i) == s.charAt(j)){
                    isRepeated = true;
                    break;
                }
            }
            if (isRepeated) break;
        }
        if (!isRepeated) return s;
        String r = longestSubstring(s.substring(0, s.length() - 1));
        String l = longestSubstring(s.substring(1, s.length()));
        return l.length() > r.length() ? l : r;
    }
}
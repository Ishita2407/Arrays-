class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();

        if(len == 0) return 0;
        int maxAns = Integer.MIN_VALUE;
        int l = 0;

        Set<Character> set = new HashSet<>();
        for(int r = 0; r < len; r++){
            if(set.contains(s.charAt(r))){
                while(l < r && set.contains(s.charAt(r))){
                    set.remove(s.charAt(l));
                    l++;
                }
            }
            set.add(s.charAt(r));
            maxAns = Math.max(maxAns, r - l + 1);
        }
        return maxAns;
    }
}

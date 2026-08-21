class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>mp=new HashSet<>();

        int left=0;
        int right=0;
        int maxLen=0;

        while(right<s.length()){
            if(!mp.contains(s.charAt(right))){
                mp.add(s.charAt(right));
                right++;
                maxLen=Math.max(maxLen,right-left);
            }else{
                mp.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
    }
}

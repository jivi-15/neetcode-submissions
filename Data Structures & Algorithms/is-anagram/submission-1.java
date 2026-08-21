class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char arr[]=s.toCharArray();
        HashMap<Character,Integer>mp=new HashMap<>();
        for(char ch:arr){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(!mp.containsKey(c)||mp.get(c)==0){
                return false;
            }
            mp.put(c,mp.get(c)-1);
        }
        return true;
    }
}

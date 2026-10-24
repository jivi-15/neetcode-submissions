class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>mp=new HashMap<>();

        for(String s:strs){
            char arr[]=s.toCharArray();
            Arrays.sort(arr);
            String newS= new String(arr);

            mp.putIfAbsent(newS,new ArrayList<>());
            mp.get(newS).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}

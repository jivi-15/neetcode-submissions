class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int needed=target-numbers[i];
            if(mp.containsKey(needed)){
                return new int[]{mp.get(needed)+1,i+1};
            }
            mp.put(numbers[i],i);
        }
        return new int[]{-1,-1};
    }
}

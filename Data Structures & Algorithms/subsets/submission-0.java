class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>current=new ArrayList<>();
        dfs(nums,0,current,ans);
        return ans;
    }
    public void dfs(int nums[],int index,List<Integer>current,List<List<Integer>>ans){
        if(index>=nums.length){
            ans.add(new ArrayList<>(current));
            return ;
        }
        current.add(nums[index]);
        dfs(nums,index+1,current,ans);

        current.remove(current.size()-1);
        dfs(nums,index+1,current,ans);
    }
}

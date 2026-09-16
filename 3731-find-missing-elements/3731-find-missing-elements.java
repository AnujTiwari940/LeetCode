class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer>ans=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
           set.add(nums[i]);
        }
        int low=nums[0]; int high=nums[n-1];
        for(int i=low;i<=high;i++){
            if(!set.contains(i))ans.add(i);
        }
        return ans;
    }
}
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(0,target,nums);
    }
    static int helper(int i,int target,int nums[]){
        if(i==nums.length){
           if(target==0)return 1;//target become 0 means target acheived means we got 1 valid combination so 1
           else return 0;//not got combination which concatenate to target so return 0
        }
        int add=helper(i+1,target-nums[i],nums);
        int subtract=helper(i+1,target+nums[i],nums);
        return add+subtract;
    }
}
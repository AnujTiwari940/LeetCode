class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
           ans=ans^nums[i];
        }return ans;
    }
}
//used XOR(^) operator as a^a=0 and 0^a=a
//so in this ques elements which will come twice will become 0
//and in last 0^a=a and a is our answer which is only 1 time
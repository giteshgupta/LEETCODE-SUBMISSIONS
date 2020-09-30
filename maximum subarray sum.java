class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int res=nums[0];
        int maxending=nums[0];
        for(int i=1;i<nums.length;i++)   // here basically we considering negative values also in our array.
        {
            maxending=Math.max(maxending+nums[i],nums[i]); 
            res=Math.max(res,maxending);
        }
        return res;
    }
}
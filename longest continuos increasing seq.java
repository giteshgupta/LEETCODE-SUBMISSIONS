class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int res=0;
        int temp=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(i>0 && nums[i-1]>=nums[i]) temp=i;
            res= Math.max(res, i-temp+1);
        }
        return res;
    }
}
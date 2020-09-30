class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n<2)           // ie either no element or only one element present no cant be duplicate
            return n;
        int id=1;
        for(int i=1;i<n;i++)
        {
            if (nums[i]!=nums[i-1])
            {
                nums[id++]=nums[i];
            }
        }
        return id;
    }
}
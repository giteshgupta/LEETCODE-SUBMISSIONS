class Solution {
    public int findDuplicate(int[] nums) {
        int count[] =new int[nums.length];
        int j=1;
        for(int i=0;i<nums.length;i++)
        {
            count[nums[i]]++;
        }
        for(j=1;j<nums.length;j++)
        {
            if(count[j]>1)
              break;
        }
     return j;
    }
}
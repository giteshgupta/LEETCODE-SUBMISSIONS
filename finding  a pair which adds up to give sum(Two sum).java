class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[] =new int[2];
        int n=nums.length;
        HashMap<Integer,Integer> s=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            if(s.containsKey(target-nums[i]))
            {
                result[0]=s.get(target-nums[i]);
                result[1]=i;
                return result;
            }
            else
            {
                s.put(nums[i],i);
            }
        }
        
        return result;
    }
}
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> l=new ArrayList<>();
        int count[] =new int[nums.length+1];
      //  if(nums.length==0) return ;
        
        for(int i=0;i<nums.length;i++)
        {
            count[nums[i]]++;
        }
        for(int i=1;i<count.length;i++)
        {
            if(count[i]==0)
            {
                l.add(i);
            }
        }
        return l;
    }
}
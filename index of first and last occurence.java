class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a[]=new int[2];
        int n=nums.length;
        int i;
        if(n==0)
        {
            a[0]=-1;
            a[1]=-1;
        }
        for(i=0;i<n;i++)
        {
            if(nums[i]==target)
            {
                a[0]=i;
                break;
            }
            else
                a[0]=-1;
        }
        for(int j=n-1;j>=0;j--)
        {
            if(nums[j]==target)
            {
                a[1]=j;
                break;
            }
            else
               a[1]=-1;
        }
       
        return a;
        
    }
    
}
/*   Efficient approach: other method to solve this in logn

        int result[] =new int[2];
             result[0]= firstOccurence(arr,n,target);// noted
             result[1]= lastOccurence(arr,n,target);

          return result;


*/



















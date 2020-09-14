class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int n=nums.length;
        Stack<Integer> st=new Stack<Integer>();
        int[] result=new int[n];
        
        for(int i=n-1;i>=0;i--)
        {
            st.push(i);
        }
        for(int i=n-1;i>=0;i--)
        {
            result[i]=-1;
            while(!st.isEmpty() && nums[st.peek()]<=nums[i])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                result[i]=nums[st.peek()];
            }
            st.add(i);
        }
        return result;
    }
}
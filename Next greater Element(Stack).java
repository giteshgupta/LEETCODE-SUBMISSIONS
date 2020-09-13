class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap <Integer, Integer> ng=new HashMap();
        Stack <Integer> st=new Stack();
        
        for(Integer N:nums2)
        {
            while(!st.isEmpty() && st.peek()<N)
            {
                ng.put(st.pop(),N);
            }
            st.push(N);
        }
        for(int i=0;i<nums1.length;i++)
        {
            nums1[i]=ng.getOrDefault(nums1[i],-1);
        }
        return nums1;
    }
}
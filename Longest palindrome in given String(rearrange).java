class Solution {
    public int longestPalindrome(String s) {
        
    int count[]=new int[128];
        int res=0;
        for(char c: s.toCharArray())
        {
            count[c]++;  // basically ascii values k respect mai inc hoga
        }
        for(Integer c: count)
        {
            res+= c/2*2;
            if(res%2==0 && c%2==1)// trick is being used here.
            {
                res+=1;
            }
        }
        return res;
        
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int leftp=0;
        int rightp=0;
        int max=0;
        if(s.length()==0)
        {
            return 0;
        }
        HashSet<Character> hs=new HashSet();
        
        while(rightp<s.length())
        {
            if(!hs.contains(s.charAt(rightp)))
            {
                hs.add(s.charAt(rightp));    check krne k baad add krte jaana na ki pehle add krte jao!!
                rightp++;
                max=Math.max(hs.size(),max);
            }
            else
            {
                hs.remove(s.charAt(leftp));
                leftp++;
            }
        }
        return max;
        
    }
}
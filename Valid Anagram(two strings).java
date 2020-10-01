
class Solution {
    public boolean isAnagram(String s, String t) {
        
        int l1=s.length();
        int l2=t.length();
        
        // System.out.println(l1);
        // System.out.println(l2);
        if(l1!=l2) return false;
        
        int a[]=new int[256];
        for(int i=0;i<l1;i++)
        {
            a[s.charAt(i)]++;
            a[t.charAt(i)]--;
        }
        for(int i=0;i<256;i++)
        {
            if(a[i]!=0)
            {
                return false;
            }
        }
        return true;
        
    }
}
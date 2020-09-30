public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap < Integer, Integer > map = new HashMap < > ();
     
        map.put(0, 1);     // corner case 0 k liye(most imp)


        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);                      // value access hogi get se
            map.put(sum, map.getOrDefault(sum, 0) + 1);         // getdefault wala case same sum repeat ho agar to 
        }                                                       //  dubara space na de ke usi mai change krde
        return count;						// [0,0,0,0,0,0,0,0,0] and sum=0 test case hai ex.
    }
}
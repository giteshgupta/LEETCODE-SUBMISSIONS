class Result
{
  static int getPairsCount(int arr[], int n, int sum)
  {
    int count=0;
    HashMap<Integer,Integer> h=new HashMap<Integer, Integer>();
   // h.put(0,1);
    for(int i=0;i<n;i++)
    {
      if(h.containsKey(sum-arr[i]))
      {
       count+= h.get(sum-arr[i]);
      }
      h.put(arr[i],h.getOrDefault(arr[i],0)+1);   
    }
    return count;  
  }
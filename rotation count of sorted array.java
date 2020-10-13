class Result {
  int rotationCount(int a[], int size)
  {
    // Write your code here
   int min_index=-1;
    int min=a[0];
    for(int i=1;i<size;i++)
    {
      if(min>a[i])
      {
        min=a[i];
        min_index=i;
      }
    }
    
   return min_index;
  }
}
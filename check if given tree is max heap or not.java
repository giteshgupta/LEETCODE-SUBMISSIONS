static int isMaxHeap(int array[], int n)
{
  n=n-1;
for(int i=0;i<=(n-2)/2;i++)
{
  //for left side
  if(array[2*i+1]>array[i])
    return 0;
  //for right
   if(2*i+2<n &&array[2*i+2]>array[i])  // index bhi km hona chahiye na
    return 0;
  
}
  return 1;
}
import java.util.*;
public class CountFrequency{
  public static int[] frequencyCount(int[] arr, int n) {

  int []freq=new int[n];
  for(int i=0;i<n;i++){
int key=arr[i];

// Only count if value is within range 1 to n
if(key>=1 && key<=n){
  freq[key-1]++;
}
  }
  return freq;
}
  // For testing
   public static void main(String[] args){
    int[] arr={2,3,2,3,5};
    int n=arr.length;  
  int [] result=frewuencyCount(arr,n);
System.out.println(Arrays.toString(result)); }
}
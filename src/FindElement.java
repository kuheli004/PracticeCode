
public class FindElement {

  public static void main(String[] args) {
    int arr[] = {5, 1, 4, 3, 6, 8, 10, 7, 9};
    int n=arr.length;
    System.out.println(Search(arr,n));

  }

  private static int Search(int[] arr, int n) {
   int left_max[]=new int[n];
   int right_min2[]=new int[n];
   left_max[0]=Integer.MIN_VALUE;
   right_min2[n-1]=Integer.MAX_VALUE;
   for(int i=n-2;i>=0;i--){    
     right_min2[i]=Math.min(right_min2[i+1], arr[i+1]);     
   }
   for(int i=1;i<n;i++){    
     left_max[i]=Math.max(left_max[i-1], arr[i-1]);     
   }
  // int right_min=Integer.MAX_VALUE;
   for(int i=n-1;i>=0;i--){
     if(arr[i]>left_max[i] && arr[i]<right_min2[i])
       return i;   
    // right_min=Math.min(right_min,arr[i]);
   }
   return -1;
     
  }

}

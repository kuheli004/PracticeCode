
public class AppearOnceElement {

  
  public static void main(String[] args) {

    int arr[]={1, 1, 3, 3, 4, 4, 5, 7, 7};
    int n=arr.length;
  findElement(arr,0,n-1);

}

  private static void findElement(int[] arr, int low, int high) {
    
    if(low>high)
      return;
    if(low==high){
    System.out.println("The required element is::"+arr[low]);
    return;
    }
    int mid=(low+high)/2;
      if(mid%2==0){
        if(arr[mid]==arr[mid+1])
          findElement(arr,mid+2,high);
        else
          findElement(arr,low,mid); 
      }
      else
      {
        if(arr[mid]==arr[mid-1])
          findElement(arr,mid+1,high);
        else
          findElement(arr,low,mid-1); 
      }
  }

}

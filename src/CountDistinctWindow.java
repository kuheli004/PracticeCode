import java.util.HashMap;

public class CountDistinctWindow {

  public static void main(String[] args) {
    int arr[] =  {1, 2, 1, 3, 4, 2, 3};
    int k = 4;
    countDistinct(arr, k);
  }

  private static void countDistinct(int[] arr, int k) {
    HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
    int distCount=0;
      for(int i=0;i<k;i++){
        if (hm.get(arr[i])==null)
        {
         hm.put(arr[i], 1);
         distCount++;
        }
        else
        {
          hm.put(arr[i],hm.get(arr[i])+1);
        }
      }
      System.out.println(distCount);
      for(int i=k;i<arr.length;i++){
          
          if(hm.get(arr[i-k])==1){
              hm.remove(arr[i-k]);
               distCount--; 
          }
          else
          {
            hm.put(arr[i-k],hm.get(arr[i-k])-1);
        
          }
          if (hm.get(arr[i])==null)
          {
           hm.put(arr[i], 1);
           distCount++;
          }
          else
          {
            hm.put(arr[i],hm.get(arr[i])+1);
          }
          
          
          System.out.println(distCount);
      
      }
  }

}

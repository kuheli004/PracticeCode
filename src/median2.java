
public class median2 {

	public static void main(String[] args) {
	
		int arr1[]={1,4,8};
		int arr2[]={3,5,9};
		int n1=arr1.length;
	   int n2=arr2.length;
	    
	   int f1=0;
	   int f2=0;
	 
	   int mid=Median(arr1,arr2);
	   System.out.println(mid);
	  
	   
	}

	private static int getMedian(int[] arr1, int f1,int l1,int[] arr2,int f2,int l2) {
		   int m1=(f1+l1)/2;
		   int m2=(f2+l2)/2;
		   System.out.println("F1:::"+f1+" F2::::"+f2+" L1:::"+l1+" L2:::"+l2+" M1:::"+m1+" M2:::"+m2);
		   if(l1-f1==1)
			   return(Math.max(arr1[f1], (arr2[f2]))+Math.min(arr1[l1],arr2[l2]))/2;
		   if(arr1[m1]==arr2[m2])
			   return m1;
		    if(arr1[m1]<arr2[m2])
		   {
		    	
			   return getMedian(arr1,m1,l1,arr2,f2,m2);
		   }
		   else
		   {
			   return getMedian(arr1,f1,m1,arr2,m2,l2);
		   }
		    
		  
	}

	private static int Median(int[] arr1, int[] arr2) {
		int N=arr1.length;
	    return getMedian(arr1,0,N-1,arr2,0,N-1);
		
	}

}

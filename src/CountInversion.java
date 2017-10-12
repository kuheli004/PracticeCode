import java.util.Arrays;

public class CountInversion {

	public static void main(String[] args) {
		 int arr[] = new int[]{1, 20, 6, 4, 5};
	        System.out.println("Number of inversions are " + mergeSort(arr, 5));

	}

	private static int mergeSort(int[] arr, int array_size) {
		int temp[]=new int[array_size];
		
		return  mergeSort(arr, temp,0,array_size-1);
	}

	private static int mergeSort(int[] arr, int[] temp, int left, int  right) {
	
		int mid=0,inv_count=0;
		if(right>left){
			 mid=(left+right)/2;
		inv_count+=  mergeSort(arr, temp,left,mid);
		inv_count+=  mergeSort(arr, temp,mid+1,right);
		
		inv_count+=  merge(arr, temp,left,mid+1,right);
		}
		return inv_count;
	}

	private static int merge(int[] arr, int[] temp, int left, int mid, int right) {
		
		int inv_count=0;
		int i=0,j=0,k=0;
		i=left;
		j=mid;
		k=left;
		System.out.println("temp-----,,"+Arrays.toString(temp));
		while(i<=(mid-1) && (j<=right))
		{
			System.out.println("Arr[i]:::"+arr[i]+"   Arr[j]::::"+arr[j]);
				if(arr[i]<arr[j]){
					temp[k++]=arr[i++];
				
				}
				else
				{
					System.out.println("mid::"+mid+ " i:::"+i);
					inv_count+=(mid-i);
					temp[k++]=arr[j++];
				}
		}
				while(i<=mid-1){
					temp[k++]=arr[i++];
				}
				
				while(j<=right){
					temp[k++]=arr[j++];
				}
				for(int p=left;p<=right;p++){
					arr[p]=temp[p];
				}
				System.out.println("temp-----,,"+Arrays.toString(temp));
				System.out.println("arr---"+Arrays.toString(arr));

		return inv_count;
	}

}

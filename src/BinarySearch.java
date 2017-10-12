
public class BinarySearch {

	public static void main(String[] args) {

			int arr[]={1,5,7,8,11};
			int n=arr.length;
			int k=7	;
			int pos=BinSearch(arr,0,k,n-1);
			System.out.println(pos+1);

	}

	private static int BinSearch(int[] arr, int i, int k, int j) {
		int pos=0;
		while(j>=i){
			int mid=(i+j)/2;
			if(arr[mid]==k){
				pos=mid;
				return pos;
			}
			else
			{
				if(arr[mid]<k){
					pos=BinSearch(arr,mid+1,k,j);
					return pos;
				}
				else if(arr[mid]>k)
					pos=BinSearch(arr,i,k,mid-1);
				return pos;
				
			}
		}
		return -1;


	}

}

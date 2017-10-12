
public class Median {

	public static void main(String[] args) {
			int arr1[]={1,2,3};
			int arr2[]={7,8,9};
			int n1=arr1.length;
			int n2=arr2.length;
			int mid=getMedian(arr1,arr2,n1);
			System.out.println(mid);

	}

	private static int getMedian(int[] arr1, int[] arr2,int n) {
	int i=0,j=0;
	int m1=-1,m2=-1;
	for(int k=0;k<=n;k++){
		if(arr1[i]<arr2[j])
		{
			m1=m2;
			m2=arr1[i];
			i++;
		}
		else
		{
			m1=m2;
			m2=arr2[j];
			j++;
		}
		if(i==n){
			m1=m2;
			m2=arr2[0];
			break;
		}
		else if(j==n){
			m1=m2;
			m2=arr1[0];
			break;
		}
		System.out.println("m1:::"+m1+"  m2:::"+m2);
	}
	System.out.println("m1 1:::"+m1+"  m2 1:::"+m2);
		return (int)Math.floor(m1+m2)/2;
	}

}

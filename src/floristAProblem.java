import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class floristAProblem {

	public static void main(String[] args) {
		int n=3;
		int k=2;
		int c[]={2,5,6};
		System.out.println(MinimumPrice(n,k,c));

	}

	private static int MinimumPrice(int n, int k, int[] c) {
				Arrays.sort(c);
				int sum=0;
				int N=c.length;
				for(int i=0;i<N;i++)
				{
					int m=(int) (Math.floor(i/k)+1);
					sum+=c[N-1-i]*m;
					
				}
				return sum;
		}

}

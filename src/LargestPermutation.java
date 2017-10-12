import java.util.Arrays;
import java.util.Scanner;

public class LargestPermutation {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    int n = input.nextInt();
		    int k = input.nextInt();
		    int[] a = new int[n];
		    int[] index = new int[n + 1];
		    for (int i = 0; i < n; i++) {
		        a[i] = input.nextInt();
		        index[a[i]] = i;
		    }
		    System.out.println("----before----");
		    System.out.println(Arrays.toString(a));
		    System.out.println(Arrays.toString(index));
		    for (int i = 0; i < n && k > 0; i++) {
		        if (a[i] == n - i) {
		            continue;
		        }
		        a[index[n - i]] = a[i];
		        index[a[i]] = index[n - i];
		        a[i] = n - i;
		        index[n - i] = i;
		        k--; 
		    }
		    
		    System.out.println("----After----");
		    System.out.println(Arrays.toString(a));
		    System.out.println(Arrays.toString(index));
		 /*   for (int i = 0; i < n; i++) {
		        System.out.print(a[i] + " ");
		    }*/

	}

}

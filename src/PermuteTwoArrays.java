import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PermuteTwoArrays {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arrA[]=new int[n];
            int arrB[]=new int[n];
         
            for(int i=0;i<n;i++)
                {
                arrA[i]=sc.nextInt();
                
            }
             for(int i=0;i<n;i++)
                {
                arrB[i]=sc.nextInt();
            }
            Arrays.sort(arrA);
            Arrays.sort(arrB);
            boolean f=true;
            for(int i=0;i<n;i++)
            {
            	int total=arrA[i]+arrB[(n-1)-i];
            	if(total<k){
            	f=false;
            	break;
            	}
            }
            
            if(f)
            	System.out.println("YES");
            else
            	System.out.println("NO");
        }

	}

}

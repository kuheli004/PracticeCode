import java.util.Scanner;

public class SpecialMultiple {

	public static void main(String[] args) {
		   Scanner in=new Scanner(System.in);
	        long t=in.nextLong();
	     for(long j=0;j<t;j++)
	         {
	         long n=in.nextLong();
	    // long[] a=new long[9];
	         int i=1;
	         long num;
	     while(true)
	         {
	         String z=Integer.toBinaryString(i);
	         long f=Long.parseLong(z);
	         num=9*f;
	     System.out.println("z::"+z+" f:::"+f+" num:::"+num);
	         if(num%n==0)
	             {
	             System.out.println(num);
	             break;
	         }
	         i++;
	     }
	        
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	    }
	}

}

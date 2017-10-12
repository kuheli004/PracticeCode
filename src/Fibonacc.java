import java.util.Scanner;

public class Fibonacc {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        while(n-->0){
	            long n0=sc.nextLong();
	        
	            long n1=sc.nextLong();
	   
	            long num=sc.nextLong();
	            num=num+1;
	            long F[][]=new long[][]{{1,1},{1,0}};
	      
              System.out.println(fib(F,num,n1,n0));
	
         
     }

	}

	private static long fib(long[][] F ,long num,long n1,long n0) {
		
		if(num==0)
			return num;
		power(F,num-1);
		
		return (F[1][0]*n1+F[1][1]*n0);
	
	}

	private static void power(long[][] F,long num) {
		if(num==0 || num==1)
			return;
	      long M[][]=new long[][]{{1,1},{1,0}};
		power(F,num/2);
		Multiply(F,F);
		
		if(num%2!=0)
			Multiply(F,M);
	}

	private static void Multiply(long[][] F, long[][] M) {
	
		long x=F[0][0]*M[0][0]+F[0][1]*M[1][0];
		long y=F[0][0]*M[0][1]+F[0][1]*M[1][1];
		long w=F[1][0]*M[0][0]+F[1][1]*M[1][0];
		long z=F[1][0]*M[0][1]+F[1][1]*M[1][1];
		F[0][0]=x;
		F[0][1]=y;
		F[1][0]=w;
		F[1][1]=z;
		
	}

}

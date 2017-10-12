import java.math.BigInteger;
import java.util.Scanner;

public class FibonaaciNumber {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        while(n-->0){
	            long n0=sc.nextLong();
	            BigInteger a=new BigInteger(Long.toString(n0));
	            
	            long n1=sc.nextLong();
	            BigInteger b=new BigInteger(Long.toString(n1));
	            long num=sc.nextLong();
	            BigInteger c=new BigInteger(Long.toString(num));
	            BigInteger one=new BigInteger("1");
	        if(c.equals(one))
	                System.out.println(n1);
	             else
	                 {
	            	    BigInteger i=new BigInteger("1");
	            	   
	            	    BigInteger bigNum=new BigInteger("1000000007");
	             	    BigInteger n2=new BigInteger("0");
	                 while(!i.equals(c)){
	                   n2=(a.add(b)).mod(bigNum);
	                   a=b;
	                   b=n2;
	                   i=i.add(one);
	                  // System.out.println("n2:::"+n2+" i::"+i);
	                     
	                 }
	                n2=n2.mod(bigNum);
	                 System.out.println(n2);
	             }

	}
	}

}

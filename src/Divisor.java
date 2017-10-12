import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        while(n-->0){
	            long num=sc.nextLong();
	            long count=0;
	            if(num%2!=0)
	                count=0;
	            else{
	            for(long i=2;i<=Math.sqrt(num);i++){
	                if(num%i==0 && i%2==0)
	                    count++;
	             
	                if(num%(num/i)==0 && ((num/i)!=i) && ((num/i)%2==0)){
	                	   System.out.println("num/i:::"+(num/i)+" i:::"+i);
	                    count++;
	                }
	               }
	            if(num%2==0)
	            	count++;
	            }
	            System.out.println(count);
	         }

	}

}

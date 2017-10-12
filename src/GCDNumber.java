import java.util.Scanner;

public class GCDNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=gcd(a,b);
		System.out.print(c);

	}

	private static int  gcd(int a, int b) {
		return (a==0? b:gcd(b%a,a));
		
		//return ( (a<=b && a!=0)?( gcd(a,b%a)? b==0?a ):gcd(b,a));
	}

}

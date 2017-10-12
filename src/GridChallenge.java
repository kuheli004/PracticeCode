import java.util.Arrays;
import java.util.Scanner;

public class GridChallenge {

	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
           int t=sc.nextInt();
           while(t-->0)
               {
               int n=sc.nextInt();
               char arr[][]=new char[n][n];
               int row=0;
               while(row<n){
                   String s=sc.next();
               for(int i=0;i<n;i++)
                   {
                       arr[row][i]=s.charAt(i);

               }
                   row++;
               }
               if(isValid(arr))
            	   System.out.println("YES");
               else
            	   System.out.println("NO");
           }
        

	}

	private static boolean isValid(char[][] arr) {
		boolean f=true;
		for(char a[]:arr)
			Arrays.sort(a);
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr[0].length;j++){
				
				if(arr[i][j]>arr[i+1][j])
				{
					f=false;
					break;
				}
			}
			
			
		}
		
		
		
		return f;
	}



}

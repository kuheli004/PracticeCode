
public class RotateMatrixBy90second {
	static int N=3;
	public static void main(String[] args) {
		  int mat[][] =
			    {
			        {1, 2, 3},
			        {4, 5, 6},
			        {7, 8, 9}
			    };
		  rotateMatrix(mat); 
		displayMatrix(mat);	 

	}

	private static void displayMatrix(int[][] mat) {
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	private static void rotateMatrix(int[][] mat) {
		transpose(mat);
		ReverseColumn(mat);
		
	}

	private static void ReverseColumn(int[][] mat) {
		for(int i=0;i<N;i++){
			for(int j=0;j<N-1-j;j++){
			//	swap(mat[i][j],mat[i][N-1-j]);
				int temp=mat[j][i];
				mat[j][i]=mat[N-1-j][i];
				mat[N-1-j][i]=temp;
			}
		}
		
	}

	private static void transpose(int[][] mat) {
		for(int i=0;i<N;i++){
			for(int j=i;j<N;j++)
			{
				int temp=mat[i][j];
				mat[i][j]=mat[j][i];
				mat[j][i]=temp;
			 //	swap(mat[i][j],mat[j][i]);
			}
		}
		
	}

	private static void swap(int i, int j) {
		int temp=i;
		i=j;
		j=temp;
		
	}

}

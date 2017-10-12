
public class RotateMatrixBy90 {
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
		
		for(int x=0;x<N/2;x++)
		{
			for(int y=x;y<N-1-x;y++){
				int temp=mat[x][y];
				mat[x][y]=mat[y][N-1-x];
				mat[y][N-1-x]=mat[N-1-x][N-1-y];
				mat[N-1-x][N-1-y]=mat[N-1-y][x];
				mat[N-1-y][x]=temp;
			}
		}
	}

}

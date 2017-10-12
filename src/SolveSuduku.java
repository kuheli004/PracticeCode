import java.util.HashSet;

public class SolveSuduku {

  static int N  =4;
  public static void main(String args[]){
    char[][] board = {{'1', '4', '2', '.'},
                      {'2', '3', '.', '1'},
                      {'4', '.', '.', '2'},
                      {'3', '.', '.', '.'}};
      
    
      solveSudoku(board);
      printGrid(board);
  }
  private static void printGrid(char[][] grid) {
    for (int row = 0; row < N; row++)
    {
       for (int col = 0; col < N; col++)
       {
        System.out.print(grid[row][col]+" "); 
       }
       System.out.println();
 
    }
    
  }
  
  public static void solveSudoku(char[][] board) {
    solve(board);
}
 
public static boolean solve(char[][] board){
    for(int i=0; i<4; i++){
        for(int j=0; j<4; j++){
            if(board[i][j]!='.')
                continue;
 
            for(int k=1; k<=4; k++){
                board[i][j] = (char) (k+'0');
                if(isValid(board, i, j) && solve(board))
                    return true;
                board[i][j] = '.';    
            }
 
            return false;
        }
    }
 
    return true; // does not matter
}
 
public static boolean isValid(char[][] board, int i, int j){
    HashSet<Character> set = new HashSet<Character>();
 
    for(int k=0; k<4; k++){
        if(set.contains(board[i][k]))
            return false;
 
        if(board[i][k]!='.' ){
            set.add(board[i][k]);
        }
    }
 
    set.clear();
 
    for(int m=0; m<2; m++){
        for(int n=0; n<2; n++){
            int x=i/2*2+m;
            int y=j/2*2+n;
            if(set.contains(board[x][y]))
                return false;
 
            if(board[x][y]!='.'){
                set.add(board[x][y]);
            }    
        }
    }
 
    return true;
}

 /* private static void printGrid(int[][] grid) {
    for (int row = 0; row < N; row++)
    {
       for (int col = 0; col < N; col++)
       {
        System.out.print(grid[row][col]+" "); 
       }
       System.out.println();
 
    }
    
  }

  private static boolean solveSuduku(int[][] grid) {
    int row=0,col=0;
    
    if(!FindUnassignedLocation(grid,row,col))
      return true;
    
    for(int num=1;num<=9;num++){
      
      if(isSafe(grid,row,col,num)){
        grid[row][col]=num;
      
        if(solveSuduku(grid))
          return true;
        
        grid[row][col]=-1;
      }
    }
    return false;
  }

  private static boolean isSafe(int[][] grid, int row, int col, int num) {
    // TODO Auto-generated method stub
    return (!UsedInRow(grid,row,num)&&
        !UsedInCol(grid,col,num)&&
        !UsedInBox(grid,row-row%3,col-col%3,num));
  }

  private static boolean UsedInRow(int[][] grid, int row, int num) {
    for (int col=0;col<N;col++){
        if(grid[row][col]==num)
          return true;
    }
    return false;
  }

  private static boolean UsedInCol(int[][] grid, int col, int num) {
    for(int row=0;row<N;row++){
      if(grid[row][col]==num)
        return true;
    }
    return false;
  }

  private static boolean UsedInBox(int[][] grid, int rowStarter, int colStarter, int num) {
    for(int row=0;row<3;row++){
      for(int col=0;col<3;col++){
        if(grid[row+rowStarter][col+colStarter]==num)
          return true;
      }
    }
    return false;
  }

  private static boolean FindUnassignedLocation(int[][] grid, int row, int col) {
    for(row=0; row<N;row++){
      for(col=0;col<N;col++){
        if(grid[row][col]==-1)
          return true;
        
      }
    }
    return false;
  }
  */
  
}

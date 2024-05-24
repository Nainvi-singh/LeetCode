class Solution {
    //chess borad
    boolean board[][];
    public int totalNQueens(int n) {
        board = new boolean[n][n];//chess board is filled with false value
        return helper(0,n);
        
    } 
    
    boolean willIPlaceAQueen(int row,int col){
        //above row 
        for(int i=row;i>=0;i--){
            if(board[i][col]){
                return false; //i can't place queen
            }
        }
        //left diagonal
        for(int i=row,j=col;i>=0&&j>=0;i--,j--){
            if(board[i][j]){
                return false; //i can't place queen
            }
        }
        //right diagonal
        for(int i=row,j=col;i>=0&&j<board[0].length;i--,j++){
            if(board[i][j]){
                return false; //i can't place queen
            }
        }
        
        return true; //i can place a queen
        
    }
    
    int helper(int row,int n){
        //base case
        if(row==n){
            return 1;
        }
        
        int count=0;
        //try to place queen on coloum
        for(int col=0;col<n;col++){
            if(willIPlaceAQueen(row,col)){
                board[row][col]=true; //i place a queen
                //move to next row and coloum will again start with 0
                count=count+helper(row+1,n);
                //stack fall(backtrack)
                board[row][col]=false;
            }
        }
        return count;
        
    }
}
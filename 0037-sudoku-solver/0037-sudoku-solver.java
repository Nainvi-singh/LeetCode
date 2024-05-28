class Solution {
    char[][] board;
    final int MAX=9;
    boolean isPresentInRow(int row,char digit){
        for(int col=0;col<MAX;col++){
            if(board[row][col]==digit){
                return true;
            }
        }
        return false;
    }
    boolean isPresentInCol(int col,char digit){
        for(int row=0;row<MAX;row++){
            if(board[row][col]==digit){
                return true;
            }
        }
        return false;
    }
    boolean isPresentInGrid(int row,int col,char digit){
        int startRow=row-row%3;
        int startCol=col-col%3;
        for(int i=startRow; i< startRow+3; i++){
            for(int j=startCol; j< startCol+3; j++){
                 if(board[i][j]==digit){
                return true;
            }
            }
        }
        return false;
    }
    boolean isCorrectToPlaceADigit(int row,int col,char digit){
        
        return !isPresentInRow(row,digit) && !isPresentInCol(col,digit) && !isPresentInGrid(row,col,digit);
        //Digit present in a row
        //Digit present in a col
        //Digit present in a subgrid
    }
    boolean solveSudoku(int row,int col){
        //end col reached move to the next row
        if(col==MAX){
            col=0;
            row++;
        }
        // base case
        if(row==MAX){
            return true;
        }
        //if cell is not empty move to the next col
        if(board[row][col]!='.'){
            return solveSudoku(row,col+1);
        }
        for(int i=1;i<=MAX;i++){
            //check that we can place a digit or not
            if(isCorrectToPlaceADigit(row,col,(char)(i+'0'))){
                board[row][col]=(char)(i+'0');    //place a digit
                //after placing move to the next column
                boolean result=solveSudoku(row,col+1);
                if (result){
                    return true;
                }
                //backtrack
                board[row][col]='.';  
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        this.board=board;
         solveSudoku(0,0);   
        
    }
}
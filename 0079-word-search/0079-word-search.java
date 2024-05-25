class Solution {
    public boolean exist(char[][] board, String word) {
        //traverse each cell of board
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(isFound(board,word,i,j)){
                    return true;
                }
            }
        }
        return false;
    }
    int directions[][]={{1,0},{0,1},{-1,0},{0,-1}};
    
    //function for word exist in the board or not
    boolean isFound(char[][] board,String word,int row,int col){
        //base case
        if(word.length()==0){
            return true;
        }
        //negative base case
        if(row<0||col<0||col>=board[0].length||row>=board.length||board[row][col]!=word.charAt(0)){
            return false;
        }
        //mark visit
        
        board[row][col]='#'; //marked visited
        boolean isMatch=false;//not correct result
        //move in all direction
        for(int direct=0;direct<directions.length;direct++){
            int nextRow=directions[direct][0];
            int nextCol=directions[direct][1];
            //recursive call
            isMatch=isFound(board,word.substring(1),row+nextRow, col+nextCol);
            if(isMatch){
                break;
            }
        }
        //stack fall (backtrack)
        //undo the #
        board[row][col]=word.charAt(0);
        return isMatch;
    }    
}
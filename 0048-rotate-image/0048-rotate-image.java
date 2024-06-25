class Solution {
    public void rotate(int[][] matrix) {
        //transpose then reverse each row
         int m = matrix.length;
        int n = matrix[0].length ;  
        for(int i=0;i<m;i++){
            for(int j=i+1;j<n;j++){
                int temp = matrix[i][j];
               matrix[i][j] = matrix[j][i];
               matrix[j][i] = temp;
            }
        }
        // reverse each row
        for(int rows[] : matrix){
            // reverse (2 Pointer Approach)
            for(int i = 0 , j = matrix.length-1 ; i<matrix.length/2; i++, j--){
                int temp = rows[i];
                rows[i] = rows[j];
                rows[j] = temp;
            }
        }
  
    }
}
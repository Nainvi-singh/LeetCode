class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> minRow=new ArrayList<>();
        List<Integer> maxCol=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        for(int row[]:matrix){
            for(int val:row){
                min=Math.min(min,val);
            }
            minRow.add(min);
            min=Integer.MAX_VALUE;
        }
        for(int col=0;col<matrix[0].length;col++){
            for(int row=0;row<matrix.length;row++){
                max=Math.max(max,matrix[row][col]);
            }
            maxCol.add(max);
             max=Integer.MIN_VALUE;
        }
        List<Integer> ans=new ArrayList<>();
        for(int minInRow: minRow){
            if(maxCol.contains(minInRow)){
                ans.add(minInRow);
            }
        }
        return ans;
    }
}
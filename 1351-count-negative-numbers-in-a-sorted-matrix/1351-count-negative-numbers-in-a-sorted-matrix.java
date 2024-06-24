class Solution {
    public int countNegatives(int[][] grid) {
        //Apporach 1
        // int count=0;
        // for(int i=0;i<grid.length;i++){
        //     for(int j=0;j<grid[i].length;j++){
        //         if(grid[i][j]<0)
        //             count++;
        //     }
        // }
        // return count;
        
        //optimal apporach
        int count=0;
        int colLen=grid[0].length;
        for(int row[]:grid){
            int left=0;
            int right=colLen-1;
            while(left<=right){
                int mid=(left+right)/2;
                if(row[mid]<0){
                    right=mid-1;
                }else{
                    left=mid+1;
                    
                }
            }
            count=count+(colLen-left);
        }
        return count;
    }
}
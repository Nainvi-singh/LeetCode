class Solution {
    void helper(int node,int[][] isConnected,boolean visited[]){
        visited[node]=true;
        for(int i=0;i<isConnected.length;i++){
            if(isConnected[node][i]==1 && !visited[i]){  //connection is there
                helper(i,isConnected,visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int countComponent=0;
        boolean visited[]=new boolean[isConnected.length];
        for(int i=0;i<isConnected.length;i++){
            //if vertex not visited
            if(!visited[i]){
                countComponent++;
                helper(i,isConnected,visited);
            }
        }
        return countComponent;
    }
}
//connected component


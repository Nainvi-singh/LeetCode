class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> allPath =new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        helper(0,graph,path,allPath);
        return allPath;
    }
    void helper(int vertex,int[][] graph ,List<Integer> path,List<List<Integer>> allPath ){
        path.add(vertex);
        //base case
        if(vertex==graph.length-1){
            allPath.add(new ArrayList<>(path));
            return;
        }
        
        int neighbours[]=graph[vertex];
        for(int neighbour: neighbours){
            helper(neighbour, graph,path,allPath);
            //backtack
            path.remove(path.size()-1);
        }
    }
}
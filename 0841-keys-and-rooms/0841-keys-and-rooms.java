class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    int n=rooms.size();
     List<Boolean> visited= new ArrayList<>();
     for (int i = 0; i < n; i++) {
    visited.add(false);
}
     int src=0;
     dfs(rooms,visited,src);
     int m=visited.size();
     for(int i=0;i<m;i++)
     {
        if(visited.get(i)==false)
         { return false;}
     }
     return true;
    }
    public void dfs(List<List<Integer>>rooms,List<Boolean> visited,int src)
    {
        visited.set(src,true);
        for(int neigh:rooms.get(src))
        {
            if(visited.get(neigh)==false)
            {
                dfs(rooms,visited,neigh);
            }
        }
    }
}
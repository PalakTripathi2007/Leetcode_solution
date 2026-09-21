class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>>graph=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            graph.add(new ArrayList<>());
        }
        for(int[] edge:edges)
        {
            int u=edge[0];
             int v=edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);

        }
        Queue<Integer>q=new LinkedList<>();
        boolean[] v= new boolean[n];
        q.offer(source);
        while(!q.isEmpty())
        {
            int curr=q.poll();
           

       if (curr == destination) {
         return true;
}
            for(int x:graph.get(curr))
            {
                if(!v[x])
                {
                    v[x]=true;
                    q.offer(x);
                }
            }
        }
        return false;
    }
    }
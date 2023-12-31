package GraphDataStructure;

import java.util.ArrayList;

public class Graph17 {
    static class Edge{
        int source;
        int destination;
        public Edge(int source,int destination){
            this.source=source;
            this.destination=destination;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i< graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,3));
    }

    public static void dfs(ArrayList<Edge> graph[], int current, boolean vis[],boolean Ap[], int dt[], int low[], int time, int parent){
        vis[current]=true;
        dt[current]=low[current]=++time;
        int children = 0;
        for(int i=0;i<graph[current].size();i++){
            Edge e = graph[current].get(i);
            if(e.destination == parent){
                continue;
            }
            else if(!vis[e.destination]){
                dfs(graph, e.destination, vis,Ap, dt, low, time, current);
                low[current] = Math.min(low[current],low[e.destination]);
                if(dt[current] <= low[e.destination] && parent != -1){
                    Ap[current]=true;
                }
                children++;
            }
            else {
                low[current] = Math.min(low[current],dt[e.destination]);
            }
        }
        if(parent == -1 && children > 1){
            Ap[current]=true;
        }
    }

    public static void getAp(ArrayList<Edge> graph[], int v){
        int dt[]=new int[v];
        int low[]=new int[v];
        int time=0;
        boolean vis[]= new boolean[v];
        boolean Ap[]= new boolean[v];
        for(int i=0;i<v;i++){
            if(!vis[i]){
                dfs(graph,i,vis,Ap,dt,low,time,-1);
            }
        }

        for(int i=0;i<v;i++){
            if(Ap[i]){
                System.out.println("AP : "+i);
            }
        }
    }

    public static void main(String[] args) {
        int vertex = 5;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);
        getAp(graph,vertex);
    }
}
//Note : --> Time complexity : O(V+E);
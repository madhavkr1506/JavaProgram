package GraphDataStructure;

import java.util.ArrayList;

public class Graph16 {
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
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
    }

    public static void dfs(ArrayList<Edge> graph[],int current,boolean vis[],int dt[],int low[],int time,int parent){
        vis[current]=true;
        dt[current]=low[current]=++time;
        for(int i=0;i<graph[current].size();i++){
            Edge e = graph[current].get(i);
            if(e.destination == parent){
                continue;
            }
            else if(!vis[e.destination]){
                dfs(graph, e.destination, vis, dt, low, time, current);
                low[current] = Math.min(low[current],low[e.destination]);
                if(dt[current] < low[e.destination]){
                    System.out.println("Bridge is : " + current + " ---- " + e.destination);
                }
            }
            else {
                low[current] = Math.min(low[current],dt[e.destination]);
            }

        }
    }

    public static void getBridge(ArrayList<Edge> graph[],int v){
        int dt[]=new int[v];
        int low[]=new int[v];
        int time=0;
        boolean vis[]= new boolean[v];
        for(int i=0;i<v;i++){
            if(!vis[i]){
                dfs(graph,i,vis,dt,low,time,-1);
            }
        }
    }

    public static void main(String[] args) {
        int vertex = 6;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);
        getBridge(graph,vertex);
    }
}

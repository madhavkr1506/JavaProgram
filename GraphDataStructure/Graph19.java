package GraphDataStructure;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Graph19 {
    static class Edge{
        int source;
        int destination;
        int weight;
        public Edge(int source,int destination,int weight){
            this.source=source;
            this.destination=destination;
            this.weight=weight;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i< graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,6));

        graph[1].add(new Edge(1,0,2));
        graph[1].add(new Edge(1,3,5));

        graph[2].add(new Edge(2,0,6));
        graph[2].add(new Edge(2,3,8));

        graph[3].add(new Edge(3,1,5));
        graph[3].add(new Edge(3,2,8));
        graph[3].add(new Edge(3,4,10));
        graph[3].add(new Edge(3,5,15));

        graph[4].add(new Edge(4,3,10));
        graph[4].add(new Edge(4,6,2));

        graph[5].add(new Edge(5,3,15));
        graph[5].add(new Edge(5,6,6));

        graph[6].add(new Edge(6,4,2));
        graph[6].add(new Edge(6,5,6));
    }

    public static class pair implements Comparable<pair>{
        int node;
        int path;
        public pair(int node,int path){
            this.node=node;
            this.path=path;
        }
        @Override
        public int compareTo(pair p){
            return this.path - p.path;
        }
    }
    public static void DijkstraAlgo(ArrayList<Edge> graph[],int source){
        PriorityQueue<pair> queue = new PriorityQueue<>();
        boolean vis[] = new boolean[graph.length];
        queue.add(new pair(0,0));
        int dis[] = new int[graph.length];
        for(int i=0;i< graph.length;i++){
            if(i!=source) {
                dis[i] = Integer.MAX_VALUE;
            }
        }
        while (!queue.isEmpty()){
            pair current = queue.remove();
            if(!vis[current.node]){
                vis[current.node]=true;
                for(int i=0;i<graph[current.node].size();i++){
                    Edge e = graph[current.node].get(i);
                    int u=e.source;
                    int v=e.destination;
                    if(dis[u] + e.weight < dis[v]){
                        dis[v] = dis[u] + e.weight;
                        queue.add(new pair(v,dis[v]));
                    }
                }
            }
        }
        for(int i=0;i< graph.length;i++){
            System.out.print(dis[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int vertex=7;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);
        DijkstraAlgo(graph,0);
    }
}

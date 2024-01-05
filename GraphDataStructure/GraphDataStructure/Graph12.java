//Note : Dijkstra's Algorithm : Shortest distance from the source to all vertices.

package GraphDataStructure;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Graph12 {
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
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,7));
        graph[2].add(new Edge(2,4,3));
        graph[3].add(new Edge(3,5,1));
        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));
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
    public static void Dijkstra(ArrayList<Edge> graph[],int source,int V){
        PriorityQueue<pair> queue1 = new PriorityQueue<>();
        int dist[] = new int[V];
        boolean vis[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(i != source){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        queue1.add(new pair(0,0));
        while (!queue1.isEmpty()){
            pair current = queue1.remove();
            if(!vis[current.node]){
                vis[current.node]=true;
                for(int i=0;i<graph[current.node].size();i++){
                    Edge e = graph[current.node].get(i);
                    int u = e.source;
                    int v = e.destination;
                    if(dist[u] + e.weight < dist[v]){
                        dist[v] = dist[u] + e.weight;
                        queue1.add(new pair(v,dist[v]));
                    }
                }
            }
        }
        for(int i=0;i<V;i++){
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int vertex = 6;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);
        Dijkstra(graph,0,vertex);
    }
}

//Note :  Bellman Ford Algorithm : Shortest distance from the source to all vertices.
// It is also suitable for negative weight.
//It does not work for negative weight cycle.

package GraphDataStructure;

import java.util.ArrayList;

public class Graph13 {
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
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));
        graph[1].add(new Edge(1,2,-4));
        graph[1].add(new Edge(2,3,2));
        graph[2].add(new Edge(3,4,4));
        graph[3].add(new Edge(4,1,-1));
    }
    public static void bellmanFord(ArrayList<Edge> graph[],int source,int V){
        int dist[] = new int[V];
        for(int i=0;i< V;i++){
            if(i != source){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        for(int k=0;k<V-1;k++){
            for(int i=0;i<V;i++){
                for(int j=0;j<graph[i].size();j++){
                    Edge e = graph[i].get(j);
                    int u=e.source;
                    int v=e.destination;
                    if(dist[u] != Integer.MAX_VALUE && dist[u] + e.weight < dist[v]){
                        dist[v] = dist[u] + e.weight;
                    }
                }
            }
        }
        for(int i=0;i< dist.length;i++){
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int vertex = 5;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);
        bellmanFord(graph,0,vertex);
    }
}

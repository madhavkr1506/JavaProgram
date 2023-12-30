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
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,7));
        graph[2].add(new Edge(2,4,3));
        graph[3].add(new Edge(3,5,1));
        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));
    }
    public static void main(String[] args) {
        int vertex = 6;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);
    }
}

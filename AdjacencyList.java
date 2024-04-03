// It is a jagged array.
// It is a simple graph structure.
// Each node of graph contain list of neighboring vertices.


import java.util.*;

public class AdjacencyList {
    static class Edge{
        int source;
        int destination;
        Edge(int source,int destination){
            this.source = source;
            this.destination = destination;
        }

        public static void creategraph(ArrayList<Edge>[] graph){
            for(int i=0;i<graph.length;i++){
                graph[i] = new ArrayList<Edge>();
            }
            graph[0].add(new Edge(0, 1));
            graph[0].add(new Edge(0, 2));

            graph[1].add(new Edge(1, 3));

            graph[2].add(new Edge(2, 4));


        }
    }
    public static void main(String[] args) {
        int vertex = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[vertex];

        Edge.creategraph(graph);
        for(int i=0;i<graph[1].size();i++){
            Edge e = graph[1].get(i);
            System.out.println(e.destination);
        }


        // for(int i = 0;i < graph.length;i++){
        //     for(Edge e : graph[i]){
        //         System.out.println(e.destination);
        //     }
        // }
        
    }
}















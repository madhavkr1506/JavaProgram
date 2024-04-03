import java.util.ArrayList;


public class AdjacencyList2 {
    static class Edge{
        int source;
        int destination;
        int weight;
        Edge(int source,int destination,int weight){
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
        public static void creategraph(ArrayList<Edge>[] graph){
            for(int i=0;i<graph.length;i++){
                graph[i] = new ArrayList<Edge>();
            }

            graph[0].add(new Edge(0, 1, 10));
            graph[0].add(new Edge(0, 2, 5));

            graph[1].add(new Edge(1, 3, 6));

            graph[2].add(new Edge(2, 4, 7));

            graph[3].add(new Edge(3, 5, 8));
            graph[4].add(new Edge(4, 5, 9));


        }
    }
    public static void main(String[] args) {
        int vertex = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[vertex];

        Edge.creategraph(graph);

        for(int i=0;i<graph.length;i++){
            for(Edge e : graph[i]){
                System.out.println("source = "+e.source+" destination = "+e.destination+" weight = "+e.weight);
            }
        }


        
    }
}

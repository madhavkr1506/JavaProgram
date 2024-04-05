


import java.util.ArrayList;

public class AdjacencyList3 {
    static class Edge{
        String source;
        String destination;
        int price;
        Edge(String source,String destination,int price){
            this.source = source;
            this.destination = destination;
            this.price = price;
        }

        public static void creategraph(ArrayList<Edge>[] graph){
            for(int i=0;i<graph.length;i++){
                graph[i] = new ArrayList<Edge>();
            }
            graph[0].add(new Edge("Madhav","Ram", 10));
            graph[0].add(new Edge("Madhav","Krishna", 20));
            graph[0].add(new Edge("Madhav","Mahadev", 30));

            graph[1].add(new Edge("Krishna","Balram", 40));

            graph[2].add(new Edge("Mahadev","Ganesh", 50));

            graph[3].add(new Edge("Ganesh","Ram", 60));

        }
    }
    public static void main(String[] args) {

        int vertex = 6;

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[vertex];

        Edge.creategraph(graph);

        // for(int i=0;i<graph[0].size();i++){
        //     Edge e = graph[0].get(i);
        //     System.out.println(e.destination);
        // }


        for(int i=0;i<graph.length;i++){
            for(Edge e : graph[i]){
                System.out.println("source = " + e.source + " destination = " + e.destination + " price = " + e.price);
            }
        }
        
    }
}

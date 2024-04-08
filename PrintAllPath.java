import java.util.ArrayList;

public class PrintAllPath{
    static class Edge{
        int source;
        int destination;
        Edge(int source,int destination){
            this.source = source;
            this.destination = destination;
        }
        public static void creategraph(ArrayList<Edge>[] graph){
            for(int i = 0;i < graph.length;i++){
                graph[i] = new ArrayList<Edge>();
            }
            graph[0].add(new Edge(0, 1));
            graph[0].add(new Edge(0, 2));

            graph[1].add(new Edge(1, 0));
            graph[1].add(new Edge(1, 2));
            graph[1].add(new Edge(1, 3));

            graph[2].add(new Edge(2, 0));
            graph[2].add(new Edge(2, 1));
            graph[2].add(new Edge(2, 4));

            graph[3].add(new Edge(3, 1));
            graph[3].add(new Edge(3, 4));

            graph[4].add(new Edge(4, 2));
            graph[4].add(new Edge(4, 3));
        }

        public static void printallPath(ArrayList<Edge> graph[],int current, boolean vis[],String path,int target){
            if(current == target){
                System.out.println(path);
                return;
            }
            for(int i=0;i<graph[current].size();i++){
                Edge e = graph[current].get(i);
                if(vis[e.destination] == false){
                    vis[current] = true;
                    printallPath(graph, e.destination, vis, path+e.destination, target);
                    vis[current] = false;
                }
            }
        }
    }
    public static void main(String[] args) {

        int vertex = 5;

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[vertex];

        Edge.creategraph(graph);
        boolean[] vis = new boolean[vertex];
        

        int source = 0;
        int target = 4;

        Edge.printallPath(graph, source, vis, "0", target);
        
    }
}



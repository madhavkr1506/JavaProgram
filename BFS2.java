import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS2 {
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

            graph[0].add(new Edge(0,1,10));
            graph[0].add(new Edge(0,2,2));
            graph[1].add(new Edge(1,3,10));
            graph[2].add(new Edge(2,4,2));
            graph[3].add(new Edge(3,5,10));
            graph[4].add(new Edge(4,5,20));
        }


        public static void bfs(ArrayList<Edge>[] graph,boolean[] vis,int start){
            Queue<Integer> queue = new LinkedList<>();
            queue.add(start);
            while(!queue.isEmpty()){
                int current = queue.remove();
                if(vis[current] == false){
                    System.out.print(current+" ");
                    vis[current] = true;
                    for(int i=0;i<graph[current].size();i++){
                        Edge e = graph[current].get(i);
                        queue.add(e.destination);
                    }

                }
            }
        }
    }
    public static void main(String[] args) {

        int vertex = 6;

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[vertex];

        Edge.creategraph(graph);
        boolean[] vis = new boolean[vertex];

        for(int i = 0;i < vertex;i++){
            if(vis[i] == false){
                Edge.bfs(graph, vis, i);
            }

        }
        
    }
}

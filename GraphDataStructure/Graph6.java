package GraphDataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph6 {
    static class Edge{
        int source;
        int destination;
        public Edge(int source,int destination){
            this.source=source;
            this.destination=destination;
        }
    }
    public static void createGraph(ArrayList<Edge> GarphArray[]){
        for(int i=0;i<GarphArray.length;i++){
            GarphArray[i] = new ArrayList<Edge>();
        }
        GarphArray[0].add(new Edge(0,1));
        GarphArray[0].add(new Edge(0,2));

        GarphArray[1].add(new Edge(1,0));
        GarphArray[1].add(new Edge(1,2));
        GarphArray[1].add(new Edge(1,3));

        GarphArray[2].add(new Edge(2,0));
        GarphArray[2].add(new Edge(2,1));
        GarphArray[2].add(new Edge(2,4));

        GarphArray[3].add(new Edge(3,1));
        GarphArray[3].add(new Edge(3,4));

        GarphArray[4].add(new Edge(4,2));
        GarphArray[4].add(new Edge(4,3));

    }

    public static void bfs(ArrayList<Graph5.Edge> graph[], int v, boolean vis[], int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()){
            int current = q.remove();
            if(vis[current] == false){
                System.out.print(current + " ");
                vis[current] = true;
                for (int i=0;i<graph[current].size();i++){
                    Graph5.Edge e = graph[current].get(i);
                    q.add(e.destination);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge> graph[],int current,boolean vis[]){
        System.out.print(current+" ");
        vis[current] = true;
        for(int i=0;i<graph[current].size();i++){
            Edge e = graph[current].get(i);
            if(vis[e.destination] == false){
                dfs(graph,e.destination,vis);
            }
        }
    }
    public static void main(String[] args) {
        int vertex = 5;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);
        boolean vis[] = new boolean[vertex];
        for(int i=0;i<vertex;i++){
            if(vis[i] == false){
                dfs(graph,i,vis);
            }
        }
    }
}

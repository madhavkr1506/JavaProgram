package GraphDataStructure;

import java.util.ArrayList;

public class Graph20 {
    static class Edge{
        int source;
        int destination;
        public Edge(int source,int destination){
            this.source=source;
            this.destination=destination;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i< graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,3));
        graph[2].add(new Edge(2,0));

        graph[3].add(new Edge(3,3));
    }

    public static boolean IsCycleUtil(ArrayList<Edge> graph[],int current,boolean vis[],boolean rec[]){
        vis[current]=true;
        rec[current]=true;
        for(int i=0;i< graph[current].size();i++){
            Edge e = graph[current].get(i);
            if(rec[e.destination]){
                return true;
            }
            else if(!vis[e.destination]){
                if(IsCycleUtil(graph,e.destination,vis,rec)){
                    return true;
                }
            }
        }
        rec[current]=false;
        return false;
    }
    public static boolean isCycle(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        boolean rec[] = new boolean[graph.length];
        for(int i=0;i< graph.length;i++){
            if(!vis[i]){
                boolean IsCycle = IsCycleUtil(graph,i,vis,rec);
                if(IsCycle){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int vertex = 4;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);
        System.out.println(isCycle(graph));
    }
}

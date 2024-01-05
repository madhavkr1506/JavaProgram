
// Cycle detection in Directed Graph :

package GraphDataStructure;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Graph9 {
    static  class Edge{
        int source;
        int destination;
        public Edge(int source,int destination){
            this.source=source;
            this.destination=destination;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,0));
    }
    public static boolean isCycleutil(ArrayList<Edge> graph[],int current,boolean vis[],boolean rec[]){
        vis[current]=true;
        rec[current]=true;
        for(int i=0;i<graph[current].size();i++){
            Edge e = graph[current].get(i);
            if(rec[e.destination]){
                return true;
            }
            else if(!vis[e.destination]){
                if(isCycleutil(graph, e.destination, vis, rec)){
                    return true;
                }
            }
        }
        rec[current]=false;
        return false;
    }

    public static boolean isCycle(ArrayList<Edge> graph[]){
        boolean[] vis = new boolean[graph.length];
        boolean[] rec = new boolean[graph.length];
        for(int i=0;i< graph.length;i++){
            if(!vis[i]){
                boolean IsCycle = isCycleutil(graph,i,vis,rec);
                if(IsCycle){
                    return true;
//                    System.out.println(IsCycle);
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

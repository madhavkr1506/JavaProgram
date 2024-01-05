//Note : Cycle detection for undirected graph.
package GraphDataStructure;

import java.util.ArrayList;
import java.util.List;

public class Graph22 {
    static class Edge{
        int source;
        int destination;
        public Edge(int source,int destination){
            this.source=source;
            this.destination=destination;
        }
    }
    public static void createGraph(List<List<Edge>> graph,int vertex){
        for(int i=0;i<vertex;i++){
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(new Edge(0, 1));
        graph.get(0).add(new Edge(0, 2));
        graph.get(1).add(new Edge(1, 0));
        graph.get(1).add(new Edge(1, 2));
        graph.get(2).add(new Edge(2, 0));
        graph.get(2).add(new Edge(2, 1));
        graph.get(2).add(new Edge(2, 3));
        graph.get(3).add(new Edge(3, 2));
    }
//    public static boolean IsCycleUtil(List<List<Edge>> graph,int current,boolean vis[],int parent){
//        vis[current]=true;
//        for(Edge e : graph.get(current)){
//            if(vis[e.destination] && parent != e.destination){
//                return true;
//            }
//            if(!vis[e.destination]){
//                if(IsCycleUtil(graph, e.destination, vis, current)){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    public static boolean IsCycleUtil(List<List<Edge>> graph,int current,boolean vis[],int parent){
        vis[current]=true;
        for(int i=0;i<graph.get(current).size();i++){
            Edge e = graph.get(current).get(i);
            if(vis[e.destination] && parent != e.destination){
                return true;
            }
            if(!vis[e.destination]){
                if(IsCycleUtil(graph, e.destination, vis, current)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean IsCycle(List<List<Edge>> graph){
        int vertex = graph.size();
        boolean vis[] = new boolean[graph.size()];
        for(int i=0;i<vertex;i++){
            if(!vis[i]){
                boolean isCycle = IsCycleUtil(graph,i,vis,-1);
                if(isCycle){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int vertex = 4;
        List<List<Edge>> graph = new ArrayList<>();
        createGraph(graph,vertex);
        System.out.println(IsCycle(graph));

    }
}

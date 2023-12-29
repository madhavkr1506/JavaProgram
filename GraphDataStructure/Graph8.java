// Cycle detection in Directed graph : 
package GraphDataStructure;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph8 {
    static class Edge{
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
//        graph[3].add(new Edge(3,0));
    }
    public static void bfs(ArrayList<Edge> graph[],int v,boolean vis[],int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int current = q.remove();
            if(vis[current] == false){
                System.out.print(current+" ");
                vis[current]=true;
                for(int i=0;i<graph[current].size();i++){
                    Edge e = graph[current].get(i);
                    q.add(e.destination);
                }
            }
        }
    }
    public static void dfs(ArrayList<Edge> graph[],int current,boolean vis[]){
        System.out.print(current+" ");
        vis[current]=true;
        for(int i=0;i<graph[current].size();i++){
            Edge e = graph[current].get(i);
            if(vis[e.destination] == false){
                dfs(graph,e.destination,vis);
            }
        }
    }
    public static void printAllPath(ArrayList<Edge> graph[],int current,boolean vis[],String path,int target){
        if(current == target){
            System.out.println(path);
            return;
        }
        for(int i=0;i<graph[current].size();i++){
            Edge e = graph[current].get(i);
            if(vis[e.destination] == false){
                vis[current]=true;
                printAllPath(graph, e.destination, vis, path+e.destination, target);
                vis[current]=false;
            }
        }
    }
    public static boolean isCycle(ArrayList<Edge> graph[],int current,boolean vis[],boolean rec[]){
        vis[current]=true;
        rec[current]=true;
        for(int i=0;i<graph[current].size();i++){
            Edge e = graph[current].get(i);
            if(rec[e.destination]){
                return true;
            } else if (!vis[e.destination]) {
                if(isCycle(graph, e.destination, vis, rec)){
                    return true;
                }
            }
        }
        rec[current]=false;
        return false;
    }
    public static void main(String[] args) {
        int vertex = 4;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);
        System.out.println(isCycle(graph,0,new boolean[vertex],new boolean[vertex]));
    }

}

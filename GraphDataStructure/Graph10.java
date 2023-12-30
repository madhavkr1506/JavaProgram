//Note : Topological sorting : It is used only for Directed graph with no cycle.


package GraphDataStructure;

import java.util.ArrayList;
import java.util.Stack;

public class Graph10 {
    static class Edge{
        int source;
        int destination;
        public Edge(int source,int destination){
            this.source=source;
            this.destination=destination;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<>();
        }
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }
    public static void TopologicalSortingUtil(ArrayList<Edge> graph[], int current, boolean vis[], Stack<Integer> stack){
        vis[current]=true;
        for(int i=0;i<graph[current].size();i++){
            Edge e = graph[current].get(i);
            if(!vis[current]){
                TopologicalSortingUtil(graph,e.destination,vis,stack);
            }
        }
        stack.push(current);
    }

    public static void TopologicalSorting(ArrayList<Edge> graph[]){
        boolean[] vis = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                TopologicalSortingUtil(graph,i,vis,stack);
            }
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
    public static void main(String[] args) {
        int vertex = 6;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);
        TopologicalSorting(graph);
    }
}

//Note  : Strongly connected component : --> It is a component in which we can
// reach every vertex of the component from every other vertex in that component.
//  --> Kosaraju's algorithm --> O(V+E)
//--> Reverse depth first search : To find strongly connected component in a graph
//Steps :
//1. Get nodes in stack(topological sorting) --> O(V+E)
//2. Transpose the graph. --> O(V+E)
//3. Do dfs according to stack nodes on the transpose graph. --> O(V+E)
//Note : Strongly connected graph are used only for directed graph.

package GraphDataStructure;

import java.util.ArrayList;
import java.util.Stack;

public class Graph15 {
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
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,4));
    }

    public static void dfs(ArrayList<Edge> graph[],int current,boolean vis[]){
        vis[current]=true;
        System.out.print(current + " ");
        for(int i=0;i< graph[current].size();i++){
            Edge e = graph[current].get(i);
            if(!vis[e.destination]){
                dfs(graph,e.destination,vis);
            }
        }
    }


    public static void topSort(ArrayList<Edge> graph[],int current,boolean vis[],Stack<Integer> stack1){
        vis[current]=true;
        for(int i=0;i<graph[current].size();i++){
            Edge e = graph[current].get(i);
            if(!vis[e.destination]){
                topSort(graph, e.destination, vis, stack1);
            }
        }
        stack1.push(current);
    }


    public static void KosarajuAlgo(ArrayList<Edge> graph[]){
        Stack<Integer> stack1 = new Stack<>();
        boolean vis[] = new boolean[graph.length];
        for(int i=0;i< graph.length;i++){
            if(!vis[i]){
                topSort(graph,i,vis,stack1);
            }
        }

        ArrayList<Edge> transpose[] = new ArrayList[graph.length];
        for(int i=0;i<graph.length;i++){
            vis[i] = false;
            transpose[i] = new ArrayList<Edge>();
        }
        for(int i=0;i< graph.length;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e = graph[i].get(j);
                transpose[e.destination].add(new Edge(e.destination,e.source));
            }
        }
        while(!stack1.isEmpty()){
            int cur = stack1.pop();
            if(!vis[cur]){
                dfs(transpose,cur,vis);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int vertex = 5;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);
        KosarajuAlgo(graph);
    }
}

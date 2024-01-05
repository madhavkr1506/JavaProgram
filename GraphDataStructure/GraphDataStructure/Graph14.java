//Note : Minimum spanning tree : Prim algorithm

package GraphDataStructure;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Graph14 {
    static class Edge{
        int source;
        int destination;
        int weight;
        public Edge(int source,int destination,int weight){
            this.source=source;
            this.destination=destination;
            this.weight=weight;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i< graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,15));
        graph[0].add(new Edge(0,3,30));

        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,3,40));

        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,3,50));

        graph[3].add(new Edge(3,1,40));
        graph[3].add(new Edge(3,2,50));
    }
    public static class pair implements Comparable<pair>{
        int node;
        int cost;
        public pair(int node,int cost){
            this.node=node;
            this.cost=cost;
        }
        @Override
        public int compareTo(pair p){
            return this.cost - p.cost;
        }
    }
    public static void primAlgorithm(ArrayList<Edge>graph[]){
        PriorityQueue<pair> queue1 = new PriorityQueue<pair>();
        boolean vis[] = new boolean[graph.length];
        queue1.add(new pair(0,0));
        int mstCost=0;
        while(!queue1.isEmpty()){
            pair current = queue1.remove();
            if(!vis[current.node]){
                vis[current.node]=true;
                mstCost+= current.cost;
                for(int i=0;i<graph[current.node].size();i++){
                    Edge e = graph[current.node].get(i);
                    if(!vis[e.destination]){
                        queue1.add(new pair(e.destination,e.weight));
                    }
                }
            }
        }
        System.out.println("Minimum cost of mst is " + mstCost);
    }
    public static void main(String[] args) {
        int vertex = 4;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);
        primAlgorithm(graph);
    }
}

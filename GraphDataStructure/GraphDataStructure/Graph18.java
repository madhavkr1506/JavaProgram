package GraphDataStructure;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Graph18 {
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
    public static class pair implements Comparable<pair>{
        int node;
        int cost;
        public pair(int node,int cost){
            this.node=node;
            this.cost=cost;
        }
        @Override
        public int compareTo(pair p){
            return this.cost-p.cost;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i< graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1,4));
        graph[0].add(new Edge(0,2,3));
        graph[1].add(new Edge(1,0,4));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,2));
        graph[2].add(new Edge(2,0,3));
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,4));
        graph[3].add(new Edge(3,1,2));
        graph[3].add(new Edge(3,2,4));
        graph[3].add(new Edge(3,4,2));
        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,6));
        graph[5].add(new Edge(5,4,6));
    }

    public static void primAlgo(ArrayList<Edge> graph[]){
        PriorityQueue<pair> queue = new PriorityQueue<pair>();
        boolean vis[] = new boolean[graph.length];
        queue.add(new pair(0,0));
        int minCost=0;
        while(!queue.isEmpty()){
            pair current = queue.remove();
            if(!vis[current.node]){
                vis[current.node]=true;
                minCost+= current.cost;
                for(int i=0;i<graph[current.node].size();i++){
                    Edge e = graph[current.node].get(i);
                    if(!vis[e.destination]){
                        queue.add(new pair(e.destination,e.weight));
                    }
                }

            }
        }
        System.out.println("Minimum cost of minimum spanning tree is : " + minCost);
    }
    public static void main(String[] args) {
        int vertex=6;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);
        primAlgo(graph);
    }
}

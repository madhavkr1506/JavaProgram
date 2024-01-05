//Note : Cycle detection for undirected graph.

package GraphDataStructure;

import java.util.ArrayList;
import java.util.List;

public class Graph23 {
    static class Edge{
        int source;
        int destination;
        public Edge(int source,int destination){
            this.source=source;
            this.destination=destination;
        }
    }
    static class DisjointSet{
        int[] parent;
        public DisjointSet(int size){
            parent = new int[size];
            for(int i=0;i<size;i++){
                parent[i] = i;
            }
        }
        public int find(int vertex){
            if(parent[vertex] == vertex){
                return vertex;
            }
            return find(parent[vertex]);
        }
        public void union(int x,int y){
            int rootX = find(x);
            int rootY = find(y);
            if(rootX != rootY){
                parent[rootX] = rootY;
            }
        }
    }
    public static void createGraph(List<Edge> edges,int vertex){
        edges.add(new Edge(0, 1));
        edges.add(new Edge(0, 2));
        edges.add(new Edge(1, 2));
        edges.add(new Edge(2, 0));
        edges.add(new Edge(2, 3));
    }
    public static boolean IsCycle(List<Edge> edges,int vertex){
        DisjointSet disjointSet = new DisjointSet(vertex);
        for(Edge edge : edges){
            int rootX = disjointSet.find(edge.source);
            int rootY = disjointSet.find(edge.destination);
            if(rootX == rootY){
                return true;
            }
            disjointSet.union(rootX,rootY);
        }
        return false;
    }

    public static void main(String[] args) {
        int vertex = 4;
        List<Edge> edges = new ArrayList<>();
        createGraph(edges,vertex);
        System.out.println(IsCycle(edges,vertex));
    }
}

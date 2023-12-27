//  Note : Adjacency List
package GraphDataStructure;
import java.util.*;
class Edge{
    int source;
    int destination;
    public Edge(int source,int destination){
        this.source=source;
        this.destination=destination;
    }
    public static void createGraph(ArrayList<Edge> GraphArray[]){
        for(int i=0;i< GraphArray.length;i++){
            GraphArray[i] = new ArrayList<Edge>();
        }
        GraphArray[0].add(new Edge(0,2));

        GraphArray[1].add(new Edge(1,2));
        GraphArray[1].add(new Edge(1,3));

        GraphArray[2].add(new Edge(2,0));
        GraphArray[2].add(new Edge(2,1));
        GraphArray[2].add(new Edge(2,3));

        GraphArray[3].add(new Edge(3,1));
        GraphArray[3].add(new Edge(3,2));

    }
}

public class Graph1 {

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        Edge.createGraph(graph);

        for(int i=0;i<graph[1].size();i++){
            Edge e = graph[1].get(i);
            System.out.println(e.destination);
        }
    }
}

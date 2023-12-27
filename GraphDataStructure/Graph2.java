package GraphDataStructure;

import java.util.*;

class Edge2{
    int source;
    int destination;
    int weight;
    public Edge2(int source,int destination,int weight){
        this.source=source;
        this.destination=destination;
        this.weight=weight;
    }
    public static void createGraph(ArrayList<Edge2> graphArray[]){
        for(int i=0;i< graphArray.length;i++){
            graphArray[i] = new ArrayList<Edge2>();
        }
        graphArray[0].add(new Edge2(0,2,2));

        graphArray[1].add(new Edge2(1,2,10));
        graphArray[1].add(new Edge2(1,3,0));

        graphArray[2].add(new Edge2(2,0,2));
        graphArray[2].add(new Edge2(2,1,10));
        graphArray[2].add(new Edge2(2,3,-1));

        graphArray[3].add(new Edge2(3,1,0));
        graphArray[3].add(new Edge2(3,2,-1));
    }
}

public class Graph2 {
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge2> graphArray[] = new ArrayList[V];
        Edge2.createGraph(graphArray);
        for(int i=0;i< graphArray[2].size();i++){
            Edge2 e = graphArray[2].get(i);
            System.out.println(e.source + " " + e.destination + " " + e.weight);
        }
    }
}

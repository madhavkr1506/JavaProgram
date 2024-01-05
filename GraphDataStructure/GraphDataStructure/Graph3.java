package GraphDataStructure;
import java.util.*;
class Edge3{
    int source;
    int destination;

    public Edge3(int source,int destination){
        this.source=source;
        this.destination=destination;

    }

    public static void createGraph(ArrayList<Edge3> graphArray[]){
        for(int i=0;i< graphArray.length;i++){
            graphArray[i] = new ArrayList<Edge3>();
        }
        graphArray[0].add(new Edge3(0,1));
        graphArray[0].add(new Edge3(0,2));

        graphArray[1].add(new Edge3(1,0));
        graphArray[1].add(new Edge3(1,3));

        graphArray[2].add(new Edge3(2,0));
        graphArray[2].add(new Edge3(2,4));


        graphArray[3].add(new Edge3(3,1));
        graphArray[3].add(new Edge3(3,4));
        graphArray[3].add(new Edge3(3,5));

        graphArray[4].add(new Edge3(4,2));
        graphArray[4].add(new Edge3(4,3));
        graphArray[4].add(new Edge3(4,5));

        graphArray[5].add(new Edge3(5,3));
        graphArray[5].add(new Edge3(5,4));
        graphArray[5].add(new Edge3(5,6));

        graphArray[6].add(new Edge3(6,5));
    }

    public static void bfs(ArrayList<Edge3> graphArray[],int v){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[v];
        q.add(0);
        while(!q.isEmpty()){
            int current = q.remove();
            if(vis[current] == false){
                System.out.print(current + " ");
                vis[current]=true;
                for(int i=0;i<graphArray[current].size();i++){
                    Edge3 e = graphArray[current].get(i);
                    q.add(e.destination);
                }
            }
        }
    }
}
public class Graph3 {
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge3> graphArray[] = new ArrayList[V];
        Edge3.createGraph(graphArray);
        Edge3.bfs(graphArray,V);
        System.out.println();
    }
}

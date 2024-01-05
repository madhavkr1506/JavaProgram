package GraphDataStructure;
import java.util.*;
class EdgeClass{
    int source;
    int destination;
    public EdgeClass(int source,int destination){
        this.source=source;
        this.destination=destination;
    }
    public static void createGraph(ArrayList<EdgeClass> ArrayGraph[]){
        for(int i=0;i<ArrayGraph.length;i++){
            ArrayGraph[i] = new ArrayList<EdgeClass>();
        }
        ArrayGraph[0].add(new EdgeClass(0,1));
        ArrayGraph[0].add(new EdgeClass(0,2));

        ArrayGraph[1].add(new EdgeClass(1,0));
        ArrayGraph[1].add(new EdgeClass(1,3));

        ArrayGraph[2].add(new EdgeClass(2,0));
        ArrayGraph[2].add(new EdgeClass(2,4));

        ArrayGraph[3].add(new EdgeClass(3,1));
        ArrayGraph[3].add(new EdgeClass(3,4));
        ArrayGraph[3].add(new EdgeClass(3,5));

        ArrayGraph[4].add(new EdgeClass(4,2));
        ArrayGraph[4].add(new EdgeClass(4,3));
        ArrayGraph[4].add(new EdgeClass(4,5));

        ArrayGraph[5].add(new EdgeClass(5,3));
        ArrayGraph[5].add(new EdgeClass(5,4));
        ArrayGraph[5].add(new EdgeClass(5,6));

        ArrayGraph[6].add(new EdgeClass(6,5));
    }
    public static void bfs(ArrayList<EdgeClass> graphArray[],int v,boolean visited[],int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int current = q.remove();
            if(visited[current] == false){
                System.out.print(current + " ");
                visited[current] = true;
                for(int i=0;i<graphArray[current].size();i++){
                    EdgeClass e = graphArray[current].get(i);
                    q.add(e.destination);
                }
            }
        }
    }
}
public class Graph4 {
    public static void main(String[] args) {
        int V = 7;
        ArrayList<EdgeClass> ArrayGraph[] = new ArrayList[V];
        EdgeClass.createGraph(ArrayGraph);
        boolean vis[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(vis[i] == false){
                EdgeClass.bfs(ArrayGraph,V,vis,i);
            }
        }


    }
}

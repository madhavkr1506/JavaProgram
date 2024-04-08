// It has time complexity of O(V^V)


import java.util.ArrayList;

public class FriendCircle {

    static class Edge{
        String source;
        String destination;
        Edge(String source,String destination){
            this.source = source;
            this.destination = destination;
        }

        public static void creategraph(ArrayList<Edge>[] graph){
            for(int i=0;i<graph.length;i++){
                graph[i] = new ArrayList<Edge>();
            }

            graph[0].add(new Edge("Madhav", "Satyam"));
            graph[0].add(new Edge("Madhav", "Ravi"));


            graph[1].add(new Edge("Satyam", "Madhav"));
            graph[1].add(new Edge("Satyam", "Ravi"));
            graph[1].add(new Edge("Satyam", "Rahul"));

            graph[2].add(new Edge("Ravi", "Madhav"));
            graph[2].add(new Edge("Ravi", "Satyam"));
            graph[2].add(new Edge("Ravi", "Kishan"));

            graph[3].add(new Edge("Rahul", "Satyam"));
            graph[3].add(new Edge("Rahul", "Kishan"));

            graph[4].add(new Edge("Kishan", "Rahul"));
            graph[4].add(new Edge("Kishan", "Ravi"));



        }


        public static void printcircle(ArrayList<Edge>[] graph,String current,boolean[] vis,String path,String target){
            if(current.equals(target)){
                System.out.println(path);
                return;
            }

            for(int i=0;i<graph[getIndex(current)].size();i++){
                Edge e = graph[getIndex(current)].get(i);
                if(vis[getIndex(e.destination)] == false){
                    vis[getIndex(current)] = true;
                    printcircle(graph, e.destination, vis, path+"-->"+e.destination, target);
                    vis[getIndex(current)] = false;
                }

            }
        }

        public static int getIndex(String name){
            switch (name) {
                case "Madhav":
                    return 0;  
                case "Satyam":
                    return 1;  
                case "Ravi":
                    return 2;
                case "Rahul":
                    return 3;
                case "Kishan":
                    return 4;

                default:
                    return -1;
                    
            }
        }
    }
    public static void main(String[] args) {

        int vertex = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[vertex];

        Edge.creategraph(graph);

        boolean[] vis = new boolean[vertex];

        String path = "Madhav";

        String source = "Madhav";

        String target = "Kishan";

        Edge.printcircle(graph, source, vis, path, target);
        
    }
}

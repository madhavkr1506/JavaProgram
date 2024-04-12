import java.util.ArrayList;
import java.util.Scanner;

public class Graph1 {
    static class Edge{
        String source;
        String destination;
        Edge(String source,String destination){
            this.source = source;
            this.destination = destination;
        }
        public static void creategraph(ArrayList<Edge>[] graph){
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            for(int i=0;i<graph.length;i++){
                graph[i] = new ArrayList<>();
            }
            System.out.println("Number of books you want to enter : ");
            int edgeNum = sc.nextInt();
            sc.nextLine();

            for(int i=0;i<edgeNum;i++){
                System.out.println("Enter book name : ");
                String book = sc.nextLine();
                System.out.println("Enter author name : ");
                String author = sc.nextLine();

                Edge edge = new Edge(book, author);
                graph[i].add(edge);
            }

        }
    }

    public static void deleteEdge(ArrayList<Edge>[] graph,String source,String destination){
        for(int i=0;i<graph.length;i++){
            for(Edge e : graph[i]){
                if((e.source.equals(source)) && (e.destination.equals(destination))){
                    graph[i].remove(e);
                    System.out.println("Book name : " + source + " and Author name : " + destination + " has been deleted.");
                    return;
                }
            }
        }
        System.out.println("Book name : " + source + " and Author name : " + destination + " not found in the graph.");
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[10];

        Edge.creategraph(graph);

        System.out.println("Print all the books along with author name : ");
        
        for(int i=0;i<graph.length;i++){
            for(Edge e : graph[i]){
                System.out.println("Book name : " + e.source + " || Author name : " + e.destination);
            }
        }

        System.out.println("Book that you wish to remove : ");
        System.out.println("Enter book name : ");
        String bookname = sc.nextLine();
        System.out.println("Enter author name : ");
        String authorname = sc.nextLine();

        deleteEdge(graph,bookname,authorname);
        
        sc.close();
        
    }
}

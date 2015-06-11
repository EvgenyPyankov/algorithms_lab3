import java.util.*;

public class Main {
    static final int INF = 9999999; // "Бесконечность"
    public static void main(String args[]) {
        int n = 3000;
        int q = 1;
        int r = 1000000;
        final int COEFFICIENT1 = 1; //the more value, the less number of edges
        final int COEFFICIENT2 = 10;
//        int[][]matrix = {
//                {-1,7,9,-1,-1,14},
//                {-1,-1,10,15,-1,-1},
//                {-1,-1,-1,11,-1,2},
//                {-1,-1,-1,-1,-1},
//                {-1,-1,-1,6,-1,-1},
//                {-1,-1,-1,-1,9,-1}
//        };
//        int[][] matrix = new int[n][n];
//
//        for (int i=0; i<n; i++){
//            for (int j=0; j<n; j++)
//                matrix[i][j]=INF;
//        }
//        matrix[0][1] = 6;
//        matrix[0][2] = 3;
//        matrix[1][0] = 6;
//        matrix[1][2] = 2;
//        matrix[2][0] = 3;
//        matrix[2][1] = 2;
//        matrix[2][3] = 5;
//        matrix[3][2] = 5;
//
//        Edge[]edges = new Edge[8];
//        edges[0]=new Edge(0,1,6);
//        edges[1]=new Edge(1,0,6);
//        edges[2]=new Edge(0,2,3);
//        edges[3]=new Edge(2,0,3);
//        edges[4]=new Edge(1,2,2);
//        edges[5]=new Edge(2,1,2);
//        edges[6]=new Edge(2,3,5);
//        edges[7]=new Edge(3,2,5);

//        Graph graph = new Graph(matrix,edges,8,4);

//        Graph graph = new Graph(matrix, 8, 4);
//        graph.printGraph();

        Graph graph = GraphGenerator.generateGraph(n,q,r,COEFFICIENT2);
        //graph.printGraph();
//        System.out.println(graph.getGraphInfo());
//        Prim prim = new Prim(graph);
//        System.out.println("\n"+prim.runPrim());
        Prim prim = new Prim(graph);
        System.out.println("\nPrim: " + prim.runPrim());
        Kruskal kruskal = new Kruskal(graph);
        System.out.println("\nKruskal: "+kruskal.runKruskal());
    }

    static void printArr(int[] arr) {
        System.out.println("\nArray:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

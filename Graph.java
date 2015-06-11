public class Graph {
    int [][]adjacencyMatrix;
    Edge[]edges;
    int m;
    int n;

    public Graph(int[][]adjacencyMatrix, Edge[]edges, int m, int n){
        this.m=m;
        this.n=n;
        this.adjacencyMatrix=adjacencyMatrix;
        this.edges=edges;
    }

    void printGraph(){
        System.out.println("Graph:");
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            System.out.println();
            for (int j = 0; j < adjacencyMatrix[i].length; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
        }
    }

    public String getGraphInfo(){
        return "\namount of edges = "+m +"\namout of verticies = "+n+"\nmax amout of edges = "+n*(n-1)/2;
    }

    public int getN(){
        return n;
    }

    public int[] getRow(int i){
        return adjacencyMatrix[i];
    }
}

import java.util.Random;

public class GraphGenerator {
    static Graph generateGraph(int n, int q, int r, int coefficient) {
        int INF = Main.INF;
        int[][] adjacencyMatrix = new int[n][n];
        int edgesAmount = 0;
        Edge[]edges;

        int l=0;
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            adjacencyMatrix[i][i] = INF;
            for (int j = i + 1; j < n; j++) {
                if (rand.nextInt(coefficient) == 0) {

                    adjacencyMatrix[i][j] = adjacencyMatrix[j][i] = rand.nextInt(r - q) + q;
                    edgesAmount+=2;
                } else {
                    adjacencyMatrix[i][j] =adjacencyMatrix[j][i]  = adjacencyMatrix[j][i] = INF;
                }
            }
        }
        edges = new Edge[edgesAmount];
        int f=0;
        for (int i=0; i<n; i++)
            for (int j=i; j<n; j++){
                if (adjacencyMatrix[i][j]<INF){
                    edges[f]=new Edge(i,j,adjacencyMatrix[i][j]);
//                    System.out.println(edges[f].getInfo());
                    f++;
                    edges[f]=new Edge(j,i,adjacencyMatrix[i][j]);
//                    System.out.println(edges[f].getInfo());
                    f++;
                }
            }

        return new Graph(adjacencyMatrix, edges,edgesAmount, n);
    }
}

import java.util.Random;

public class GraphGenerator {
    static Graph generateGraph(int n, int q, int r, int coefficient) {
        int INF = Main.INF;
        int[][] adjacencyMatrix = new int[n][n];
        int edgesAmount = 0;

        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            adjacencyMatrix[i][i] = INF;
            for (int j = i + 1; j < n; j++) {
                if (rand.nextInt(coefficient) == 0) {

                    adjacencyMatrix[i][j] = adjacencyMatrix[j][i] = rand.nextInt(r - q) + q;
                    edgesAmount++;
                } else {
                    adjacencyMatrix[i][j] =adjacencyMatrix[j][i]  = adjacencyMatrix[j][i] = INF;
                }
            }
        }
        return new Graph(adjacencyMatrix, edgesAmount, n);
    }
}

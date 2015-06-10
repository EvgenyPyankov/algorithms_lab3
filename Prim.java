import static java.util.Arrays.fill;

public class Prim {
    Graph graph;
    int INF;
    int vNum; // количество вершин
    int[][] adjacencyMatrix; // матрица смежности
    int[][]MST;

    public Prim(Graph graph){
        this.graph=graph;
        adjacencyMatrix=graph.adjacencyMatrix;
        vNum=graph.getN();
        INF=Main.INF;
        MST = new int[vNum][vNum];
    }


    int runPrim() {
        boolean[] used = new boolean[vNum];
        int[] dist = new int[vNum];

        fill(dist, INF);
        dist[0] = 0;

        for (; ; ) {
            int v = -1;
            for (int nv = 0; nv < vNum; nv++)
                if (!used[nv] && dist[nv] < INF && (v == -1 || dist[v] > dist[nv])) // выбираем самую близкую непомеченную вершину
                    v = nv;
            if (v == -1) break;
            used[v] = true;
            for (int nv = 0; nv < vNum; nv++)
                if (!used[nv] && adjacencyMatrix[v][nv] < INF)
                    dist[nv] = Math.min(dist[nv], adjacencyMatrix[v][nv]);
        }
        int ret = 0; // вес MST
        for (int v = 0; v < vNum; v++)
            ret += dist[v];
        return ret;
    }
}

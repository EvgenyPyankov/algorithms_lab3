import java.util.*;

public class Kruskal {
    int vNum;
    Graph graph;
    Edge[]edges;

    public Kruskal( Graph graph){
        this.graph=graph;
        this.vNum=graph.getN();
        edges=graph.edges;

    }

    int runKruskal() {
        DSF dsf = new DSF(vNum); // ���

        //shellSort(edges);


        Arrays.sort(edges); // ��������� �����
//        for (int i=0; i<edges.length; i++)
//            System.out.println(edges[i].getInfo());
        int ret = 0; // ���������
        for (Edge e : edges) // ���������� ����� � ������� �����������
            if (dsf.union(e.u, e.v)) // ���� ����� ����������� ������ �����������
                ret += e.w; // ��������� ��� ����� � ��������� MST
        return ret;
    }

    void shellSort(Edge[]edges)
    {
        int j;
        int step = edges.length / 2;
        while (step > 0)
        {
            for (int i = 0; i < (edges.length - step); i++)
            {
                j = i;
                while ((j >= 0) && (edges[j].w > edges[j + step].w))
                {
                    int tmp = edges[j].w;
                    edges[j].w = edges[j + step].w;
                    edges[j + step].w = tmp;
                    j-=step;
                }
            }
            step = step / 2;
        }
    }
}

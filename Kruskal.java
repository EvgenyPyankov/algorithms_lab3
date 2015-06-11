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
        DSF dsf = new DSF(vNum); // СНМ

        //shellSort(edges);


        Arrays.sort(edges); // Сортируем ребра
//        for (int i=0; i<edges.length; i++)
//            System.out.println(edges[i].getInfo());
        int ret = 0; // результат
        for (Edge e : edges) // перебираем ребра в порядке возрастания
            if (dsf.union(e.u, e.v)) // если ребра принадлежат разным компонентам
                ret += e.w; // добавляем вес ребра к стоимости MST
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

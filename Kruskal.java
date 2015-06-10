import java.util.*;

public class Kruskal {
    int vNum;

    public Kruskal(int vNum){
        this.vNum=vNum;
    }

    int runKruskal(Edge[] edges) {
        DSF dsf = new DSF(vNum); // СНМ
        Arrays.sort(edges); // Сортируем ребра
        int ret = 0; // результат
        for (Edge e : edges) // перебираем ребра в порядке возрастания
            if (dsf.union(e.u, e.v)) // если ребра принадлежат разным компонентам
                ret += e.w; // добавляем вес ребра к стоимости MST
        return ret;
    }
}

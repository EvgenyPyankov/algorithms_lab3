import java.util.*;

public class Kruskal {
    int vNum;

    public Kruskal(int vNum){
        this.vNum=vNum;
    }

    int runKruskal(Edge[] edges) {
        DSF dsf = new DSF(vNum); // ���
        Arrays.sort(edges); // ��������� �����
        int ret = 0; // ���������
        for (Edge e : edges) // ���������� ����� � ������� �����������
            if (dsf.union(e.u, e.v)) // ���� ����� ����������� ������ �����������
                ret += e.w; // ��������� ��� ����� � ��������� MST
        return ret;
    }
}

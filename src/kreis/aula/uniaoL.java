package kreis.aula;

import java.util.ArrayList;
import java.util.List;

public class uniaoL {
	 
    public static List<Integer> iListas(List<Integer> listaA, List<Integer> listaB) {
        List<Integer> interseccao = new ArrayList<>();
        for (int elemento : listaA) {
            if (listaB.contains(elemento)) {
                interseccao.add(elemento);
            }
        }
        return interseccao;
    }

    public static List<Integer> uniaoListas(List<Integer> listaA, List<Integer> listaB) {
        List<Integer> uniao = new ArrayList<>(listaA);
        for (int elemento : listaB) {
            if (!uniao.contains(elemento)) {
                uniao.add(elemento);
            }
        }
        return uniao;
    }
}
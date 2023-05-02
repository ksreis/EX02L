package kreis.aula;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Integer> listaA = new ArrayList<>();
        listaA.add(3);
        listaA.add(5);
        listaA.add(8);
        listaA.add(12);
        listaA.add(9);
        listaA.add(7);
        listaA.add(16);

        List<Integer> listaB = new ArrayList<>();
        listaB.add(9);
        listaB.add(6);
        listaB.add(2);
        listaB.add(3);
        listaB.add(7);

        List<Integer> interseccao = uniaoL.iListas(listaA, listaB);
        System.out.println("Intersecção: " + interseccao);

        List<Integer> uniao = uniaoL.uniaoListas(listaA, listaB);
        System.out.println("União: " + uniao);
    }
}


package Esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InvertitoreLista {
    public static List<Integer> inverteLista(List<Integer> lista) {
        List<Integer> listaInvertita = new ArrayList<>(lista);
        Collections.reverse(listaInvertita);
        lista.addAll(listaInvertita);
        return lista;
    }
}

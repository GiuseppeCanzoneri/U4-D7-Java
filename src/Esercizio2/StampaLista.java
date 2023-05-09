package Esercizio2;

import java.util.List;

public class StampaLista {
    public static void stampaLista(List<Integer> lista, boolean pari) {
        if (pari) {
            for (int i = 0; i < lista.size(); i += 2) {
                System.out.print(lista.get(i) + " ");
            }
        } else {
            for (int i = 1; i < lista.size(); i += 2) {
                System.out.print(lista.get(i) + " ");
            }
        }
        System.out.println();
    }
}

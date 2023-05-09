package Esercizio2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        List<Integer> numeri = GeneratoreNumeriCasuali.generaNumeriCasuali(n);
        System.out.println("Lista originale: " + numeri);

        List<Integer> listaInvertita = InvertitoreLista.inverteLista(numeri);
        System.out.println("Lista invertita: " + listaInvertita);

        System.out.print("Numeri in posizioni pari: ");
        StampaLista.stampaLista(numeri, true);

        System.out.print("Numeri in posizioni dispari: ");
        StampaLista.stampaLista(numeri, false);
    }
}


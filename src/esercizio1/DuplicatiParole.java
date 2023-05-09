package esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicatiParole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiedi all'utente il numero di parole da inserire
        System.out.print("Inserisci il numero di parole: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consuma il carattere di fine riga

        Set<String> parole = new HashSet<>();

        // Chiedi all'utente di inserire le parole
        for (int i = 0; i < n; i++) {
            System.out.print("Inserisci la parola #" + (i+1) + ": ");
            String parola = scanner.nextLine();
            parole.add(parola);
        }

        // Stampa le parole duplicate
        Set<String> duplicati = new HashSet<>();
        for (String parola : parole) {
            if (!duplicati.add(parola)) {
                System.out.println("Parola duplicata: " + parola);
            }
        }

        // Stampa il numero di parole distinte
        System.out.println("Numero di parole distinte: " + parole.size());

        // Stampa l'elenco delle parole distinte
        System.out.println("Elenco delle parole distinte:");
        for (String parola : parole) {
            System.out.println("- " + parola);
        }
    }
}

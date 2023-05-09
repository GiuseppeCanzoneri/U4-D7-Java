package esercizio3;

public class Main {
    public static void main(String[] args) {
        RubricaTelefonica rubrica = new RubricaTelefonica();

        rubrica.inserisciContatto("Mario Rossi", "1234567890");
        rubrica.inserisciContatto("Luigi Verdi", "0987654321");

        rubrica.stampaContatti();
        // Output: 
        // Luigi Verdi: 0987654321
        // Mario Rossi: 1234567890

        rubrica.cancellaContatto("Luigi Verdi");

        String numeroMario = rubrica.ricercaNumeroPerPersona("Mario Rossi");
        System.out.println("Numero di Mario Rossi: " + numeroMario);
        // Output: Numero di Mario Rossi: 1234567890

        String nome1234567890 = rubrica.ricercaPersonaPerNumero("1234567890");
        System.out.println("Nome associato al numero 1234567890: " + nome1234567890);
        // Output: Nome associato al numero 1234567890: Mario Rossi
    }
}


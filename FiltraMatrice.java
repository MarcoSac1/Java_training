import java.util.ArrayList;

public class FiltraMatrice {
    public static int[] filtraMatrice(int[][] matrice) {
        // Lista per contenere gli elementi filtrati
        ArrayList<Integer> filtrati = new ArrayList<>();

        // Itera su tutte le righe di indice pari
        for (int i = 0; i < matrice.length; i += 2) {
            boolean tuttiDispari = true;

            // Controlla se tutti gli elementi della riga sono dispari
            for (int j = 0; j < matrice[i].length; j++) {
                if (matrice[i][j] % 2 == 0) { // Se c'è un elemento pari
                    tuttiDispari = false;
                    break;
                }
            }

            // Se la riga contiene solo elementi dispari, aggiungili all'array di output
            if (tuttiDispari) {
                for (int j = 0; j < matrice[i].length; j++) {
                    filtrati.add(matrice[i][j]);
                }
            }
        }

        // Converte la lista in un array
        return filtrati.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        // Esempio di matrice
        int[][] matrice = {
            {1, 3, 5},       // Riga 0: solo dispari -> inclusa
            {2, 4, 6},       // Riga 1: esclusa
            {7, 9, 11},      // Riga 2: solo dispari -> inclusa
            {8, 10, 12},     // Riga 3: esclusa
            {13, 15, 17}     // Riga 4: solo dispari -> inclusa
        };

        // Chiamata al metodo
        int[] risultato = filtraMatrice(matrice);

        // Stampa del risultato
        System.out.print("Elementi filtrati: ");
        for (int elemento : risultato) {
            System.out.print(elemento + " ");
        }
    }
}

public class AStrisce {
    public static boolean[] aStrisce(int M[][]) {
        // Array per memorizzare il risultato per ogni riga
        boolean[] risultato = new boolean[M.length];

        // Itera sulle righe
        for (int i = 0; i < M.length; i++) {
            boolean valida = true;

            // Controlla gli elementi della riga i
            for (int j = 0; j < M[i].length; j++) {
                if ((i % 2 == 0 && M[i][j] == 0) || (i % 2 != 0 && M[i][j] != 0)) {
                    valida = false;
                    break; // Interrompi il controllo della riga
                }
            }

            // Salva il risultato della riga
            risultato[i] = valida;
        }

        return risultato;
    }

    public static void main(String[] args) {
        // Esempio di matrice
        int[][] matrice = {
            {0, 0, 0},       // Riga 1: valida
            {1, 3, 5},       // Riga 0: valida
            {0, 0, 0},       // Riga 3: valida
            {0, 0, 0},     // Riga 4: valida
            {7, 9, 11}      // Riga 2: valida
        };

        // Chiamata al metodo
        boolean[] risultato = aStrisce(matrice);

        // Stampa del risultato
        System.out.print("Elementi filtrati: ");
        for (boolean elemento : risultato) {
            System.out.print(elemento + " ");
        }
    }
}

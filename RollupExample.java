public class RollupExample {
    // Metodo rollup
    public static int[] rollup(int[] l) {
        // Creazione di un array con la metà della lunghezza di l
        int[] ris = new int[l.length / 2];
        
        // Ciclo per calcolare la somma delle coppie
        for (int i = 0; i < l.length / 2; i++) {
            ris[i] = l[2 * i] + l[2 * i + 1];
        }
        
        return ris; // Restituisce l'array risultato
    }

    // Metodo main per far partire il programma
    public static void main(String[] args) {
        // Array di esempio
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        
        // Chiamata al metodo rollup
        int[] result = rollup(input);

        // Stampa del risultato
        System.out.print("Risultato: ");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}

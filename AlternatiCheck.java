public class AlternatiCheck {
    public static boolean alternati(int[] l) {
        // Itera attraverso gli elementi dell'array
        for (int i = 0; i < l.length - 1; i++) {
            // Controlla se due elementi consecutivi sono entrambi pari o entrambi dispari
            if ((l[i] % 2 == 0 && l[i + 1] % 2 == 0) || (l[i] % 2 != 0 && l[i + 1] % 2 != 0)) {
                return false; // Non alternano
            }
        }
        return true; // Tutti alternano
    }

    public static void main(String[] args) {
        // Esempio 1: array che alterna
        int[] array1 = {2, 3, 4, 5, 6, 7};
        System.out.println("Array 1 alterna? " + alternati(array1)); // Output: true

        // Esempio 2: array che non alterna
        int[] array2 = {2, 4, 6, 8};
        System.out.println("Array 2 alterna? " + alternati(array2)); // Output: false

        // Esempio 3: array che alterna
        int[] array3 = {1, 2, 3, 4, 5, 6};
        System.out.println("Array 3 alterna? " + alternati(array3)); // Output: true

        // Esempio 4: array vuoto o con un solo elemento (considerati sempre alternati)
        int[] array4 = {};
        System.out.println("Array 4 alterna? " + alternati(array4)); // Output: true
    }
}
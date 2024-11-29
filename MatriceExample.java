public class MatriceExample {
    public static boolean[][] costruisciMatrice(int[][] M) {
        int rows = M.length;
        int cols = M[0].length;
        boolean[][] B = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    B[i][j] = false;
                } else {
                    int sommaAdiacenti = M[i - 1][j] + M[i + 1][j] + M[i][j - 1] + M[i][j + 1];
                    B[i][j] = (sommaAdiacenti == M[i][j]);
                }
            }
        }
        return B;
    }

    public static boolean verificaMatrice(int[][] M) {
        int rows = M.length;
        int cols = M[0].length;

        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows - 1; i++) {
                if (j % 2 == 0) { // Colonna pari
                    if (M[i][j] < M[i + 1][j]) {
                        return false;
                    }
                } else { // Colonna dispari
                    if (M[i][j] > M[i + 1][j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Matrice di esempio
        int[][] M = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // Costruzione della matrice booleana
        boolean[][] B = costruisciMatrice(M);
        System.out.println("Matrice Booleana:");
        for (boolean[] row : B) {
            for (boolean cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }

        // Verifica della matrice
        boolean verifica = verificaMatrice(M);
        System.out.println("La matrice soddisfa la condizione? " + verifica);
    }
    
}

package multiplicarMatrices;

import java.io.IOException;

public class Main {
    
    public static boolean esMultiplicable(int[][] a, int[][]b) {
        return a[0].length == b.length;
    }
    
    public static int[][] multiplicaMatrices( int[][]a, int[][]b ) {
        int[][]c = new int[a.length][b[0].length];
        
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }
    
    public static void imprimeMatriz(int[][] c) {
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(c[i][j] +  " 〰 ");
            }
            System.out.println("");
        }
    
    }
    
    public static void main(String[] args) throws IOException {
        Matriz a = new Matriz();
        Matriz b = new Matriz();
        
        System.out.println("☣ ☣ ☣ ☣ ☣ ☣ MATRIZ A ☣ ☣ ☣ ☣ ☣ ☣\n");
        int[][]matrizA = a.setTamaño();
        System.out.println("☣ ☣ ☣ ☣ ☣ ☣ MATRIZ B ☣ ☣ ☣ ☣ ☣ ☣\n");
        int[][]matrizB = b.setTamaño();
        
        if(esMultiplicable(matrizA, matrizB)) {
            System.out.println("OK. Las matrices que has ingresado son multiplicables.");
            
            System.out.println("\nIngresa los datos de la matriz A");
            matrizA = a.setDatos();
            System.out.println("\nIngresa los datos de la matriz B");
            matrizB = b.setDatos();
            
            int[][]matrizC = multiplicaMatrices(matrizA, matrizB);
            System.out.println("\n👌👌 👌👌 👌👌 AQUÍ VIENE EL RESULTADO DE LA MULTIPLICACIÓN 👌👌 👌👌 👌👌");
            imprimeMatriz(matrizC);
            
            
        } else {
            System.out.println("Las matrices no son multiplicables. Vuelve a intentar");
        }
        
        
        
    }
}

package multiplicarMatrices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matriz {
    private int[][]matriz;
    
    public BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    // METODOS
    
    public int[][] setTamaño() throws IOException {
        System.out.println("Ingresa la cantidad de filas para la matriz: ");
        int y = Integer.parseInt(bf.readLine());
        System.out.println("Ingresa la cantidad de columnas para la matriz: ");
        int x = Integer.parseInt(bf.readLine());
        
        matriz = new int[y][x];
        
        return matriz;
    }
    
    public int[][] setDatos() throws IOException {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Ingresa el valor para [" + i + "] [" + j + "]");
                this.matriz[i][j] = Integer.parseInt(bf.readLine());
            }
        }
        return matriz;
    }
    
}

import java.util.Scanner;

public class MatricesParesImpares {
    
    public static void main(String[] args) {
        
        Proceso();

    }

    private static void Proceso(){

        int n = SolicitarDimension();
        int[][] matriz = new int[n][n];

        matriz = LlenarMatriz(n);

        LeerMatriz(matriz, n);

        ParesImpares(n, matriz);
    }

}

import java.util.Scanner;

public class MatricesParesImpares {
    
    static Metodos met = new Metodos();
    public static void main(String[] args) {
        
        Proceso();

    }

    private static void Proceso(){

        int n = met.SolicitarDimension();
        int[][] matriz = new int[n][n];

        matriz = met.LlenarMatriz(n);

        met.LeerMatriz(matriz, n);

        met.ParesImpares(n, matriz);
    }

}

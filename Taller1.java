import java.util.Scanner;

public class Taller1 {

    static Metodos met = new Metodos();

    public static void main(String[] args) {
        
        Proceso();

    }

    private static void Proceso(){

        int n = met.SolicitarDimension(), suma = 0;
        int[][] matriz = new int[n][n];

        matriz = met.LlenarMatriz(n);

        met.LeerMatriz(matriz, n);

    }
}

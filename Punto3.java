import java.util.Scanner;

public class Punto3 {

    static Metodos met = new Metodos();

    public static void main(String[] args) {
        
        Proceso();
    
    }

    private static void Proceso(){

        int n = met.SolicitarDimension();
        int[][] matriz = new int[n][n];

        matriz = met.LlenarMatriz(n);

        met.LeerMatriz(matriz, n);

        SumaPorFilas(matriz);

    }

    private static void SumaPorFilas(int[][] matriz){

        int i, j;
        String txt = "Suma por filas\n";

        for (i = 0; i < matriz.length; i++){

            int suma = 0;

            for (j = 0; j < matriz.length; j++){

                suma += matriz[i][j];

            }

            txt += "Suma de la fila " + (i+1) + ": " + suma + "\n";

        }

        System.out.println(txt);

    }

}

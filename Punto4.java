import java.util.Scanner;

public class Punto4 {

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

        int i, j, mayor = -999, ColumnaMayor = 0;
        String txt = "Suma por filas\n";

        for (j = 0; j < matriz.length; j++){

            int suma = 0;

            for (i = 0; i < matriz.length; i++){

                suma += matriz[i][j];

                if (suma > mayor){

                    mayor = suma;
                    ColumnaMayor = j;

                }

            }

            txt += "Suma de la fila " + (i+1) + ": " + suma + "\n";

        }

        System.out.println(txt);
        System.out.println("La columna con mayor suma es la " + (ColumnaMayor + 1) + " con un total de: " + mayor);

    }

}

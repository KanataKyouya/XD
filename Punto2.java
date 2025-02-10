import java.util.Scanner;

public class Punto2 {
    
    static Metodos met = new Metodos();

    public static void main(String[] args) {
        
        Proceso();

    }

    private static void Proceso(){

        int n = met.SolicitarDimension(), mayor;
        int[][] matriz = new int[n][n];

        matriz = met.LlenarMatriz(n);

        met.LeerMatriz(matriz, n);

        mayor = NumMay(matriz, n);

        System.out.println("El numero mayor es: " + mayor);

    } 

    private static int NumMay(int[][] matriz, int n){

        int i, j, Mayor = -999;

        for (i = 0; i < matriz.length; i++){

            for (j = 0; j < matriz.length; j++){

                if (matriz[i][j] > Mayor){
                    
                    Mayor = matriz[i][j];

                }

            }

        }


        return Mayor;

    }
}

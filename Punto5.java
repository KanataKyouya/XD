import java.util.Arrays;

public class Punto5 {

    static Metodos met = new Metodos();

    public static void main(String[] args) {
        
        Proceso();
    
    }

    private static void Proceso(){

        int n = met.SolicitarDimension();
        int[][] matriz = new int[n][n];

        matriz = met.LlenarMatriz(n);

        met.LeerMatriz(matriz, n);

        NuevoVector(matriz, n);

    }

    private static void NuevoVector(int[][] matriz, int n){

        int i, j, index = 0;
        int[] vector = new int[n*n];

        for (i = 0; i < matriz.length; i++){

            for (j = 0; j < matriz.length; j++){

                vector[index] = matriz[i][j];

                index += 1;

            }

        }

        System.out.println("El nuevo vector es: " + Arrays.toString(vector));

    }

}

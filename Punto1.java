public class Punto1 {
    
    static Metodos met = new Metodos();
    public static void main(String[] args) {
        
        proceso();

    }

    private static void proceso(){

        int n = met.SolicitarDimension(), suma = 0;
        int[][] matriz = new int[n][n];

        matriz = met.LlenarMatriz(n);

        met.LeerMatriz(matriz, n);

        suma = suma(matriz, n);

        System.out.println("La suma de la matriz es: " + suma);

    }

    private static int suma(int[][] matriz, int n){

        int acom = 0, i, j;

        for (i = 0; i < matriz.length; i++){

            for (j = 0; j < matriz.length; j++){

                acom += matriz[i][j];

            }

        }

        return acom;
    }

}

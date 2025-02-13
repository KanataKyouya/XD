import java.util.Scanner;

public class Metodos {
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
    }

    public int SolicitarDimension(){
        
        int d = 0;
        System.out.println("Ingrese la dimensión de la matriz: ");
        d = sc.nextInt();

        return d;
    }

    public int[][] LlenarMatriz(int n) {

        int i, j;

        int[][] matriz = new int[n][n];

        for (i = 0; i < n; i++) {

            for (j = 0; j < n; j++) {

                matriz[i][j] = (int) (Math.random() * 50 + 1);

            }

        }

        return matriz;

    }

    public void LeerMatriz(int[][] matriz, int n) {

        int i, j;
        System.out.println("Matriz aleatoria " + n + "x" + n + "\n");

        for (i = 0; i < n; i++) {

            for (j = 0; j < n; j++) {

                if (j != 0) {

                    System.out.print(" - " + matriz[i][j]);
                } else {

                    System.out.print(matriz[i][j]);

                }

            }

            System.out.println();

        }

    }

    public void ParesImpares(int n, int[][] matriz) {

        String pares = "Los numeros pares son ", impares = "Los numeros impares son ";
        int i, j;

        for (i = 0; i < n; i++) {

            for (j = 0; j < n; j++) {

                if (matriz[i][j] % 2 == 0) {

                    pares = pares + matriz[i][j] + " ";

                } else {

                    impares = impares + matriz[i][j] + " ";

                }

            }

        }

        System.out.println(pares + "\n" + impares);

    }

    public int SolicitarPunto(){

        int punto;

        System.out.println("¿Que punto desea realizar?\n " +
                            "1- Generar matriz nxn\n " +
                            "2- Posicion del numero mayor de la matriz\n " +
                            "3- Sumas de filas y columnas\n " +
                            "4- Mayor suma de columnas\n" +
                            "5- Matriz a vector\n" +
                            "6- Salir");
        punto = sc.nextInt();

        if (punto < 1 || punto > 6){

            System.out.println("Punto no valido, debe estar entre 1 y 6");

            return SolicitarPunto();
        }

        return punto;
   
    }


}

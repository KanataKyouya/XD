import java.util.Arrays;
import java.util.Scanner;

public class Taller1 {

    static Metodos met = new Metodos();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        Proceso();

    }

    private static void Proceso(){

        int n = met.SolicitarDimension(), punto, i, j;
        int[][] matriz = new int[n][n];

        do {

            punto = met.SolicitarPunto();

            switch (punto) {

                case 1:

                    matriz = met.LlenarMatriz(n);
                    
                    met.LeerMatriz(matriz, n);

                    break;
            
                case 2:

                    int Mayor = -999;

                    for (i = 0; i < matriz.length; i++){
            
                        for (j = 0; j < matriz.length; j++){
            
                            if (matriz[i][j] > Mayor){
                                
                                Mayor = matriz[i][j];
            
                            }
            
                        }
            
                    }

                    System.out.println("El numero mayor es: " + Mayor);
                    
                    break;
            
                case 3:

                    String txt = "Suma por filas\n";

                    for (i = 0; i < matriz.length; i++){

                        int suma = 0;

                        for (j = 0; j < matriz.length; j++){

                            suma += matriz[i][j];

                        }

                        txt += "Suma de la fila " + (i+1) + ": " + suma + "\n";

                    }

                    txt += "\nSuma por columnas\n";

                    for (j = 0; j < matriz.length; j++){

                        int suma = 0;

                        for (i = 0; i < matriz.length; i++){

                            suma += matriz[i][j];

                        }

                        txt += "Suma de la columna " + (i+1) + ": " + suma + "\n";

                    }

                    System.out.println(txt);
                        
                    break;
            
                case 4:

                    int mayor = -999, ColumnaMayor = 0;
                    String txt4 = "Suma por columnas\n";
            
                    for (j = 0; j < matriz.length; j++){
            
                        int suma = 0;
            
                        for (i = 0; i < matriz.length; i++){
            
                            suma += matriz[i][j];
            
                            if (suma > mayor){
            
                                mayor = suma;
                                ColumnaMayor = j;
            
                            }
            
                        }
            
                        txt4 += "Suma de la columna " + (i+1) + ": " + suma + "\n";
            
                    }
            
                    System.out.println(txt4);
                    System.out.println("La columna con mayor suma es la " + (ColumnaMayor + 1) + " con un total de: " + mayor);
                    break;
                
                case 5:
                    
                    int index = 0;
                    int[] vector = new int[n*n];

                    for (i = 0; i < matriz.length; i++){

                        for (j = 0; j < matriz.length; j++){

                            vector[index] = matriz[i][j];

                            index += 1;

                        }

                    }

                    System.out.println("El nuevo vector es: " + Arrays.toString(vector));
        
                    break;
            
                case 6:
                    
                    System.out.println("Fin del programa");
                    
                    break;
            
                default:
                    break;
            }
        }

        while (punto != 6);

    }

}

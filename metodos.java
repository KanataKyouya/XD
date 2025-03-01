import java.util.Scanner;


public class metodos {

    static Scanner sc = new Scanner(System.in);
    static Obj8 Obj8 = new Obj8();

    public int SolicitarDimension(){

        int d = 0;
        System.out.println("Ingrese la dimensión de la matriz de productos: ");
        d = sc.nextInt();

        return d;

    }

    public Obj8[][] LlenarMatriz8(int n) {

        Obj8[][] matriz = new Obj8[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                

                String nombre, categoria;
                int peso, precio;
                Obj8 obj = new Obj8();

                System.out.print("Producto " + i + "-" + j + ": \n");

                if(i == 0 && j == 0){  

                    sc.nextLine();

                }

                System.out.println("Ingrese el nombre: ");
                nombre = sc.nextLine();
                obj.setNombre(nombre);

                System.out.println("Ingrese el peso: ");
                peso = sc.nextInt();
                obj.setPeso(peso);

                
                System.out.println("Ingrese el precio: ");
                precio = sc.nextInt();
                obj.setPrecio(precio);

                System.out.println("Ingrese la categoria: ");
                categoria = sc.nextLine();
                categoria = sc.nextLine();
                obj.setCategoria(categoria);

                matriz[i][j] = obj;

            }

        }

        return matriz;

    }

    public void LeerMatriz8(Obj8[][] matriz, int n) {

        String txt = "Productos Agricolas\n";

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                
                txt += "Producto " + i + "-" + j + ": \nNombre: " + matriz[i][j].getNombre() + "\nPeso: " + matriz[i][j].getPeso() + "\nPrecio: " + matriz[i][j].getPrecio()  + "\nCategoria: " + matriz[i][j].getCategoria() + "\n";

            }

            

        }

        System.out.println(txt);

    }

    public void SepararCategorias(Obj8[][] matriz, int n){

        int kCategorias, contador = 0;
        String txt = "Ordenado por categorias: \n";

        System.out.print("Ingrese la cantidad de categorias: ");
        kCategorias = sc.nextInt();

        for (int i = 0; i < kCategorias; i++){

            String nombre; 

            if(i == 0){  

                sc.nextLine();

            }

            System.out.print("Ingrese el nombre de la categoria: ");
            nombre = sc.nextLine();

            txt += "\nCategoria: " + nombre + "\n";
            
            for (int j = 0; j < n; j++) {

                for (int k = 0; k < n; k++) {
                    
                    if (nombre.equals(matriz[j][k].getCategoria())){

                        contador++;

                        txt += "Producto #" + contador + ":\nNombre: " + matriz[j][k].getNombre() + "\nPeso: " + matriz[j][k].getPeso() + "\nPrecio: " + matriz[j][k].getPrecio()  + "\nCategoria: " + matriz[j][k].getCategoria() + "\n";

                    }
    
                }
    
            }

        }

        System.out.println(txt);

    }
    
}

public class punto8 {
    
    static metodos met = new metodos();
    static Obj8 Obj8 = new Obj8();

    public static void main(String[] args) {
        
        proceso();

    }

    private static void proceso(){

        int n = met.SolicitarDimension();
        Obj8[][] matriz = new Obj8[n][n];

        matriz = met.LlenarMatriz8(n);

        met.LeerMatriz8(matriz, n);

        met.SepararCategorias(matriz, n);

    }

}
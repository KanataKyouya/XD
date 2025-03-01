public class Obj8 {

    String nombre;
    int peso;
    int precio;
    String categoria;

    public Obj8(){

    }

    public Obj8(String nombre, int peso, int precio, String categoria){

        this.nombre = nombre;
        this.peso = peso;
        this.precio = precio;
        this.categoria = categoria;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}

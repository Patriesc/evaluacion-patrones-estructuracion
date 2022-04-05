package tipos;

public class Elemento implements Partes {
    protected double precio;
    protected int codigo;

    public Elemento(double precio, int codigo) {
        this.precio = precio;
        this.codigo = codigo;
    }

    public double getPrecio() {
        return this.precio;
    }

    public int getCodigo() {
        return this.codigo;
    }

}

package editor;

import tipos.Kit;

public class KitEditor {
    private Kit allElements;
    private int codigo;
    private double precio;

    public KitEditor(Kit allElements, int codigo) {
        this.allElements = allElements;
        this.codigo = codigo;
    }


    public int getCodigo() {
        return codigo;
    }

    public double getPrecio() {

        precio = allElements.getPrecio();
        return precio;
    }

}

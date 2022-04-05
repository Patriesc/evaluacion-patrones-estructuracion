// Patrón Composite

import editor.KitEditor;
import tipos.Elemento;
import tipos.Kit;

public class App {
    public static void main(String[] args) {

        Kit kitPrueba = new Kit(new Elemento(9, 222),
                new Elemento(1, 333));
        KitEditor editor = new KitEditor(kitPrueba, 2343);

        System.out.println("El código del kit es: " + editor.getCodigo());
        System.out.println("El precio del kit es: " + editor.getPrecio());
    }
}

package tipos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kit extends Elemento {

    protected List<Elemento> children = new ArrayList<>();

    public Kit(Elemento... components) {
        super(0, 0);
        add(components);
    }


    public void add(Elemento... components) {
        children.addAll(Arrays.asList(components));
    }


    @Override
    public double getPrecio() {
        if (children.size() == 0) {
            return 0;
        }
        double precio = 0;
        for (Elemento child : children) {
            precio += child.getPrecio();
        }

        return precio * 0.9;
    }


}

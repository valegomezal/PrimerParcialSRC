package portafolios;

import java.util.ArrayList;
import productos.producto.Producto;

/**
 *
 * @author juana
 */
public class Portafolio {

    public Portafolio() {
    }
    
    private ArrayList<Producto> lista_producto = new ArrayList<Producto>();
    
    public boolean agregarProducto(Producto producto) {
        return lista_producto.add(producto);
    }

}

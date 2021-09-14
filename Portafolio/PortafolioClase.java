package Portafolio;

import java.util.ArrayList;
import productos.producto.Producto;


public class PortafolioClase {

    public PortafolioClase() {
    }
    
    private ArrayList<Producto> lista_producto = new ArrayList<Producto>();
    
    public boolean agregarProducto(Producto producto) {
        return lista_producto.add(producto);
    }

}

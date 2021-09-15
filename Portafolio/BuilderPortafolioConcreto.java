package Portafolio;

import Portafolio.PortafolioClase;
import Portafolio.BuilderPortafolio;
import java.util.ArrayList;

import productos.producto.Producto;

public class BuilderPortafolioConcreto implements BuilderPortafolio{
    
    PortafolioClase portafolio = new PortafolioClase();

    @Override
    public BuilderPortafolio setProducto(Producto producto) {
        portafolio.agregarProducto(producto);
        return this;
    }
}



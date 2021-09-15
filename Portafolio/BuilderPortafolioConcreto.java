package Portafolio;

import Portafolio.PortafolioClase;
import Portafolio.BuilderPortafolio;
import java.util.ArrayList;

import productos.producto.Producto;

public class BuilderPortafolioConcreto extends BuilderPortafolio{
    
    PortafolioClase portafolio = new PortafolioClase();
    
    public BuilderPortafolioConcreto setProducto(Producto producto){
        portafolio.agregarProducto(producto);
        return this;
    }
    
    

}



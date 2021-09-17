package portafolios;

import portafolios.Portafolio;
import portafolios.BuilderPortafolio;
import java.util.ArrayList;

import productos.producto.Producto;

public class BuilderPortafolioConcreto implements BuilderPortafolio{
    
    Portafolio portafolio = new Portafolio();

    @Override
    public BuilderPortafolio setProducto(Producto producto) {
        portafolio.agregarProducto(producto);
        return this;
    }
    
    public Portafolio build(){
        Portafolio portafolioAuxiliar = this.portafolio;
        this.portafolio = new Portafolio();
        
        return portafolioAuxiliar;
    }
}



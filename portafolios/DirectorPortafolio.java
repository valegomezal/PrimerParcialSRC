package portafolios;

import Clientes.Cliente;
import portafolios.BuilderPortafolio;
import portafolios.BuilderPortafolioConcreto;
import portafolios.Portafolio;
import productos.Credito.*;
import productos.CuentaAhorros.*;
import productos.CuentaCorriente.*;
import productos.CuentaCredito.*;
import productos.Tarjeta.*;
import productos.cdt.*;

public class DirectorPortafolio {
    
    BuilderPortafolioConcreto builderPortafolio = new BuilderPortafolioConcreto();
    
    public Portafolio getPortafolioMenorDeEdad(Cliente propietario) {
        this.builderPortafolio.setProducto(new MenorEdadAhorros(propietario));
        this.builderPortafolio.setProducto(new MenorEdadCredito(propietario));
        this.builderPortafolio.setProducto(new MenorEdadCdt(propietario));
        this.builderPortafolio.setProducto(new MenorEdadCuentaCredita(propietario));
        
        return this.builderPortafolio.build();
    }
    
    public Portafolio getPortafolioTrabajador(Cliente propietario) {
        this.builderPortafolio.setProducto(new TrabajadorCdt(propietario));
        this.builderPortafolio.setProducto(new TrabajadorCorriente(propietario));
        this.builderPortafolio.setProducto(new TrabajadorCredito(propietario));
        this.builderPortafolio.setProducto(new TrabajadorCuentaCredito(propietario));
        
        return this.builderPortafolio.build();
    }
    
    public Portafolio getPortafolioMilitar(Cliente propietario) {
        this.builderPortafolio.setProducto(new MilitarAhorros(propietario));
        this.builderPortafolio.setProducto(new MilitarCdt(propietario));
        this.builderPortafolio.setProducto(new MilitarCorriente(propietario));
        this.builderPortafolio.setProducto(new MilitarCredito(propietario));
        
        return this.builderPortafolio.build();
    }
    
    public Portafolio getPortafolioCincuentaniero(Cliente propietario) {
        this.builderPortafolio.setProducto(new CincuentaAhorros(propietario));
        this.builderPortafolio.setProducto(new CincuentaCdt(propietario));
        this.builderPortafolio.setProducto(new CincuentaCorriente(propietario));
        this.builderPortafolio.setProducto(new CincuentaCredito(propietario));
        
        return this.builderPortafolio.build();
    }
    
}

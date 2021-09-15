package productos.CuentaCredito;

import java.util.Date;

import Launcher.Cliente;
import Launcher.Director;
import productos.Tarjeta.Tarjeta;

public class MenorEdadCuentaCredita extends CuentaCreditoPadre {
    
    public MenorEdadCuentaCredita(Cliente propietario){
        this.setSaldo(1000000);
    }
	
}

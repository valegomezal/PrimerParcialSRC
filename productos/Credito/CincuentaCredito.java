package productos.Credito;

import java.util.Date;

import Launcher.Cliente;
import Launcher.Director;

public class CincuentaCredito extends CreditoPadre{
    
    public CincuentaCredito(Cliente propietario){
        this.setPropietario(propietario);
        this.setValorCredito(2500000);
        this.setCuotas(36);
    }
}

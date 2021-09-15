package productos.Credito;

import java.util.Date;

import Launcher.Cliente;
import Launcher.Director;

public class TrabajadorCredito extends CreditoPadre{
    public TrabajadorCredito(Cliente propietario){
        this.setPropietario(propietario);
        this.setValorCredito(2000000);
        this.setCuotas(36);
    }
}

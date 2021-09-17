package productos.Credito;

import java.util.Date;

import Clientes.Cliente;
import Launcher.Director;

public class MilitarCredito extends CreditoPadre{
    
    public MilitarCredito(Cliente propietario){
        this.setPropietario(propietario);
        this.setValorCredito(5000000);
        this.setCuotas(36);
    }
}

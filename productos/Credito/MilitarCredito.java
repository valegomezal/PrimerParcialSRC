package productos.Credito;

import java.util.Date;

import Launcher.Cliente;
import Launcher.Director;

public class MilitarCredito extends CreditoPadre{
    
    public MilitarCredito(Cliente propietario){
        this.setPropietario(propietario);
        this.setValorCredito(5000000);
        this.setCuotas(36);
    }

    public MilitarCredito() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

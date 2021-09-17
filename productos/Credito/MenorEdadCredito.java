package productos.Credito;

import java.util.Date;

import Launcher.Cliente;
import Launcher.Director;

public class MenorEdadCredito extends CreditoPadre{
    
    public MenorEdadCredito(Cliente propietario){
        this.setPropietario(propietario);
        this.setValorCredito(0);
    }

}

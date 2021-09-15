package productos.Credito;

import java.util.Date;

import Launcher.Cliente;
import Launcher.Director;

public class MenorEdadCredito extends CreditoPadre{
    
    private long ValorCredito;
    private int cuotas;
    private Date FechasPago;
    private Cliente propietario;
    
    public MenorEdadCredito(Cliente propietario){
        this.setPropietario(propietario);
        this.setValorCredito(1000000);
        this.setCuotas(36);
    }

}

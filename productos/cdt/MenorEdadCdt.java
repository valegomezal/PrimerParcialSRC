package productos.cdt;

import java.util.Date;
import Clientes.Cliente;
import java.time.LocalDate;

public class MenorEdadCdt extends CdtPadre{
    
    public MenorEdadCdt(Cliente propietario) {
        this.setPropietario(propietario);
        this.setSaldo(0);
        this.setMinimoApertura(1000000);
    }
    
}

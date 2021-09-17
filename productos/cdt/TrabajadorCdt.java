package productos.cdt;

import java.util.Date;

import Clientes.Cliente;
import java.time.LocalDate;

public class TrabajadorCdt extends CdtPadre {
    
    public TrabajadorCdt(Cliente propietario){
        this.setPropietario(propietario);
        this.setSaldo(0);
        this.setMinimoApertura(2000000);
    }

}

package productos.cdt;

import java.util.Date;

import Clientes.Cliente;

public class CincuentaCdt extends CdtPadre {

    public CincuentaCdt(Cliente propietario){
        this.setPropietario(propietario);
        this.setSaldo(0);
        this.setMinimoApertura(4000000);
    }
}

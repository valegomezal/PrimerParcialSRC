package productos.cdt;

import java.util.Date;

import Launcher.Cliente;

public class MilitarCdt extends CdtPadre {

    public MilitarCdt(Cliente propietario){
        this.setPropietario(propietario);
        this.setSaldo(0);
        this.setMinimoApertura(5000000);
    }

}

package productos.CuentaCredito;

import java.util.Date;

import Clientes.Cliente;
import Launcher.Director;
import productos.Tarjeta.Tarjeta;

public class MilitarCuentaCredito extends CuentaCreditoPadre{

    public MilitarCuentaCredito(Cliente propietario){
        this.setPropietario(propietario);
        this.setTarjeta(new Tarjeta());
        this.setCuenta("000"+propietario.getId_cliente());
        this.setCuotaManejo(10);
        this.setInteres(5);
        this.setSaldo(40000000);
    }

}

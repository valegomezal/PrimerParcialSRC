package productos.CuentaAhorros;

import Launcher.Cliente;
import Launcher.Director;
import productos.Tarjeta.Tarjeta;

public class CincuentaAhorros extends CuentaAhorrosPadre{
    public TrabajosAhorros(Cliente propietario){
        this.setTarjeta(new Tarjeta());
        this.setSaldo(0);
        this.numeroCuenta("000"+propietario.getId_cliente());
        this.setCuotaManejo(5);
        this.setPropietario(propietario);
    }
}

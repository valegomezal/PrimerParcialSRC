package productos.CuentaAhorros;

import Clientes.Cliente;
import Launcher.Director;
import productos.Tarjeta.Tarjeta;

public class TrabajosAhorros extends CuentaAhorrosPadre {
    public TrabajosAhorros(Cliente propietario){
        this.setTarjeta(new Tarjeta());
        this.setSaldo(0);
        this.setCuotaManejo(5);
        this.setPropietario(propietario);
    }
}

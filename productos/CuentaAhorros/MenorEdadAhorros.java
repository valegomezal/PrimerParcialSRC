package productos.CuentaAhorros;

import Clientes.Cliente;
import Launcher.Director;
import productos.Tarjeta.Tarjeta;

public class MenorEdadAhorros extends CuentaAhorrosPadre{
    public MenorEdadAhorros(Cliente propietario){
        this.setTarjeta(new Tarjeta(200000));
        this.setSaldo(0);
        this.setCuotaManejo(5);
        this.setPropietario(propietario);
    }
}

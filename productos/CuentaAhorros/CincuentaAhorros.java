package productos.CuentaAhorros;

import Clientes.Cliente;
import Launcher.Director;
import productos.Tarjeta.Tarjeta;

public class CincuentaAhorros extends CuentaAhorrosPadre{
    public CincuentaAhorros(Cliente propietario){
        this.setTarjeta(new Tarjeta());
        this.setSaldo(0);
        this.numeroCuenta(Integer.parseInt("000"+propietario.getId_cliente()));
        this.setCuotaManejo(5);
        this.setPropietario(propietario);
    }
}

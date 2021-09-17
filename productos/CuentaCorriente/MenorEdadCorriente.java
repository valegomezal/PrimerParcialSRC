package productos.CuentaCorriente;

import Clientes.Cliente;
import Launcher.Director;
import productos.Tarjeta.Tarjeta;

public class MenorEdadCorriente extends  CuentaCorrientePadre{
    public MenorEdadCorriente(Cliente propietario){
        this.setPropietario(propietario);
        this.setCuenta("000"+propietario.getId_cliente());
        this.setCuotaManejo(10);
        this.setSaldo(0);
        this.setNumeroCuenta(Integer.parseInt(propietario.getId_cliente() + "000"));
    }
}

package productos.CuentaCredito;

import java.util.Date;

import Launcher.Cliente;
import Launcher.Director;
import java.time.LocalDate;
import productos.Tarjeta.Tarjeta;

public class MenorEdadCuentaCredita extends CuentaCreditoPadre {
    
    private Cliente propietario;
    private Tarjeta tarjeta;
    private String cuenta;
    private int Saldo;
    private int numeroCuenta;
    private int CuotaManejo;
    private int interes;
    private LocalDate fechaCorte;
    
    public MenorEdadCuentaCredita(Cliente propietario){
        this.setPropietario(propietario);
        this.setTarjeta(new Tarjeta());
        this.setCuenta("000"+propietario.getId_cliente());
        this.setCuotaManejo(10);
        this.setInteres(5);
        this.setSaldo(1000000);
    }
	
}

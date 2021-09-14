package productos.CuentaCredito;

import java.util.Date;

import Launcher.Cliente;
import productos.Tarjeta.Tarjeta;

public interface ICuentaCredito {
	
	    public Cliente propietario();
	    public Tarjeta tarjeta();
		public String cuenta();
		public int Saldo();
		public int numeroCuenta();
		public int CuotaManejo();
		public int interes();
		public Date fechaCorte();
}

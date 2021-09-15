package productos.CuentaCredito;

import java.util.Date;

import Launcher.Cliente;
import productos.CuentaAhorros.ICuentaAhorros;
import productos.Tarjeta.Tarjeta;

public interface ICuentaCredito {
	
	    public Cliente propietario(Cliente pro);
	    public Tarjeta tarjeta(Tarjeta tar);
		public String cuenta(String cuenta);
		public int Saldo(int Saldo);
		public int numeroCuenta(int numeroCuenta);
		public int CuotaManejo(int CuotaManej);
		public int interes(int interes);
		public Date fechaCorte(Date fechaCorte);
		public ICuentaCredito IClonarCredito();
}

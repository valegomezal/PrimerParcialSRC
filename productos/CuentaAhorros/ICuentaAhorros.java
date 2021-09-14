package productos.CuentaAhorros;

import Launcher.Cliente;
import productos.Tarjeta.Tarjeta;

public interface ICuentaAhorros {

	public Cliente propietario();
	public Tarjeta tarjeta();
	public String cuenta();
	public int Saldo();
	public int numeroCuenta();
	public int CuotaManejo();
}

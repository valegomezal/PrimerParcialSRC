package productos.CuentaCorriente;

import Launcher.Cliente;
import productos.Tarjeta.Tarjeta;

public interface ICuentaCorriente {
	
	public Cliente propietario();
	public Tarjeta tarjeta();
	public  String cuenta();
	public int Saldo();
	public int numeroCuenta();
	public int CuotaManejo();
	
}

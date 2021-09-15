package productos.CuentaCorriente;

import Launcher.Cliente;
import productos.CuentaAhorros.ICuentaAhorros;
import productos.Tarjeta.Tarjeta;

public interface ICuentaCorriente {
	
	public Cliente propietario(Cliente pro);
	public Tarjeta tarjeta(Tarjeta tar);
	public  String cuenta(String cuenta);
	public int Saldo(int Saldo);
	public int numeroCuenta(int numeroCuenta);
	public int CuotaManejo(int Cuota);
	public ICuentaCorriente IClonarCorriente();
	
}

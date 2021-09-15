package productos.CuentaAhorros;

import Launcher.Cliente;
import productos.Tarjeta.Tarjeta;
import productos.cdt.ICdt;

public interface ICuentaAhorros {

	public Cliente propietario(Cliente pro);
	public Tarjeta tarjeta(Tarjeta Boo);
	public String cuenta(String Cuenta);
	public int Saldo(int Saldo);
	public int numeroCuenta(int numC);
	public int CuotaManejo(int CuotaM);
	public ICuentaAhorros ICuentaAhorros();
}

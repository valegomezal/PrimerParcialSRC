package productos.CuentaCorriente;

import Clientes.Cliente;
import productos.CuentaAhorros.ICuentaAhorros;
import productos.Tarjeta.Tarjeta;
import productos.producto.Producto;

public interface ICuentaCorriente extends Producto{
	
	public Cliente propietario(Cliente pro);
	public Tarjeta tarjeta(Tarjeta tar);
	public  String cuenta(String cuenta);
	public int Saldo(int Saldo);
	public int numeroCuenta(int numeroCuenta);
	public int CuotaManejo(int Cuota);
	public ICuentaCorriente IClonarCorriente();
	
}

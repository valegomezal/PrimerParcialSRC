package productos.cdt;

import Clientes.Cliente;
import ProtoType.Clone;
import java.time.LocalDate;

import java.util.Date;
import productos.producto.Producto;

public interface ICdt extends Producto{
	
	
	public Cliente propietario(Cliente pro);
	public LocalDate FechaApertura(LocalDate fecha);
	public LocalDate FechaCierre(LocalDate fecha);
	public long NumeroCuenta(long NumC);
	public long saldo(long saldo);
	public double interes();
	public long MinimoApertura();
	public ICdt clonar();
	


}

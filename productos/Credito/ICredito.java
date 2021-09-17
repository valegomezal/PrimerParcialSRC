package productos.Credito;

import java.util.Date;
import Clientes.Cliente;
import productos.cdt.ICdt;
import productos.producto.Producto;

public interface ICredito extends Producto{

	public Cliente propietario(Cliente pro);
	public long ValorCredito(long ValorCredito);
	public int cuotas(int cuotas);
	public Date FechasPago(Date FechasPago);
	public ICredito clonarICredito();
}

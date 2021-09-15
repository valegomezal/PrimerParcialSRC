package productos.Credito;

import java.util.Date;
import Launcher.Cliente;
import productos.cdt.ICdt;

public interface ICredito {

	public Cliente propietario(Cliente pro);
	public long ValorCredito(long ValorCredito);
	public int cuotas(int cuotas);
	public Date FechasPago(Date FechasPago);
	public ICredito clonarICredito();
}

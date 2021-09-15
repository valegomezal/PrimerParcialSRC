package productos.Credito;

import java.util.Date;
import Launcher.Cliente;

public interface ICredito {

	public Cliente propietario();
	public long ValorCredito();
	public int cuotas();
	public Date FechasPago();
	
	
}

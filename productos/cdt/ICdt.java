package productos.cdt;

import Launcher.Cliente;
import java.util.Date;

public interface ICdt {
	
	public Cliente propietario();
	public Date FechaApertura();
	public Date FechaCierre();
	public long NumeroCuenta();
	public long saldo();
	public int interes();
	public long MinimoApertura();
}

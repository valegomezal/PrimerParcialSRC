package productos.cdt;

import Launcher.Cliente;
import ProtoType.Clone;

import java.util.Date;

public interface ICdt   {
	
	
	public Cliente propietario(Cliente pro);
	public Date FechaApertura(Date FechA);
	public Date FechaCierre(Date FechC);
	public long NumeroCuenta(long NumC);
	public long saldo(long saldo);
	public double interes();
	public long MinimoApertura();
	public ICdt clonarICdt();
	


}

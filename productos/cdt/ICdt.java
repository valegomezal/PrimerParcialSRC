package productos.cdt;

import Launcher.Cliente;
import ProtoType.Clone;

import java.util.Date;

public interface ICdt  {
	




	public String propietario(String pro);
	public Date FechaApertura(Date FechA);
	public Date FechaCierre(Date FechC);
	public long NumeroCuenta(long NumC);
	public long saldo(long saldo);
	public int interes(int inte);
	public long MinimoApertura(long Apert);
	public String toString();


	

}

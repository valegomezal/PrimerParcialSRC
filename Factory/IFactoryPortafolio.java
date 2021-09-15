package Factory;

import productos.Credito.ICredito;
import productos.CuentaAhorros.ICuentaAhorros;
import productos.CuentaCorriente.ICuentaCorriente;
import productos.CuentaCredito.ICuentaCredito;
import productos.cdt.ICdt;

public interface IFactoryPortafolio {

	public ICdt darCdt();
	public ICredito darCredito();
	public ICuentaAhorros darCuentaAhorros();
	public ICuentaCorriente darCuentaCorriente();
	public ICuentaCredito darCuentaCredito();
		




}

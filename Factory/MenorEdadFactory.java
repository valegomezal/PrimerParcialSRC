package Factory;

import productos.Credito.ICredito;
import productos.CuentaAhorros.ICuentaAhorros;
import productos.CuentaCorriente.ICuentaCorriente;
import productos.CuentaCredito.ICuentaCredito;
import productos.cdt.ICdt;

public class MenorEdadFactory implements  IFactoryPortafolio {

	@Override
	public ICdt darCdt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ICredito darCredito() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ICuentaAhorros darCuentaAhorros() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ICuentaCorriente darCuentaCorriente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ICuentaCredito darCuentaCredito() {
		// TODO Auto-generated method stub
		return null;
	}

	

}

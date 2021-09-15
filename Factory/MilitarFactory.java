package Factory;

import productos.Credito.ICredito;

import productos.CuentaAhorros.ICuentaAhorros;
import productos.CuentaCorriente.ICuentaCorriente;
import productos.CuentaCredito.ICuentaCredito;
import productos.cdt.ICdt;
import productos.cdt.*;
import productos.Credito.*;
import productos.CuentaAhorros.*;
import productos.CuentaCorriente.*;
import productos.CuentaCredito.*;


public class MilitarFactory implements  IFactoryPortafolio {

	@Override
	public ICdt darCdt() {
		// TODO Auto-generated method stub
		return new MilitarCdt();
	}

	@Override
	public ICredito darCredito() {
		// TODO Auto-generated method stub
		return new MilitarCredito();
	}

	@Override
	public ICuentaAhorros darCuentaAhorros() {
		// TODO Auto-generated method stub
		return new MilitarAhorros();
	}

	@Override
	public ICuentaCorriente darCuentaCorriente() {
		// TODO Auto-generated method stub
		return new MilitarCorriente();
	}

	@Override
	public ICuentaCredito darCuentaCredito() {
		// TODO Auto-generated method stub
		return new MilitarCuentaCredito();
	}

}

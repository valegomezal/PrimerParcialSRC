package Factory;

import productos.Credito.ICredito;

import productos.cdt.*;
import productos.Credito.*;
import productos.CuentaAhorros.*;
import productos.CuentaCorriente.*;
import productos.CuentaCredito.*;
import productos.CuentaAhorros.ICuentaAhorros;
import productos.CuentaCorriente.ICuentaCorriente;
import productos.CuentaCredito.ICuentaCredito;
import productos.cdt.ICdt;

public class TrabajadorFactory implements  IFactoryPortafolio {

	@Override
	public ICdt darCdt() {
		// TODO Auto-generated method stub
		return new TrabajadorCdt();
	}

	@Override
	public ICredito darCredito() {
		// TODO Auto-generated method stub
		return new TrabajadorCredito();
	}

	@Override
	public ICuentaAhorros darCuentaAhorros() {
		// TODO Auto-generated method stub
		return new TrabajosAhorros();
	}

	@Override
	public ICuentaCorriente darCuentaCorriente() {
		// TODO Auto-generated method stub
		return new TrabajadorCorriente();
	}

	@Override
	public ICuentaCredito darCuentaCredito() {
		// TODO Auto-generated method stub
		return new TrabajadorCuentaCredito();
	}



}

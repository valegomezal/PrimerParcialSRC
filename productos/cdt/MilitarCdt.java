package productos.cdt;

import java.util.Date;

import Launcher.Cliente;

public class MilitarCdt extends CdtPadre {

	public Cliente propietario(Cliente pro) {
		// TODO Auto-generated method stub
		return pro;
	}

	@Override
	public Date FechaApertura(Date FechA) {
		// TODO Auto-generated method stub
		return FechA;
	}

	@Override
	public Date FechaCierre(Date FechC) {
		// TODO Auto-generated method stub
		return FechC;
	}

	@Override
	public long NumeroCuenta(long NumC) {
		// TODO Auto-generated method stub
		return 92019283;
	}

	@Override
	public long saldo(long saldo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double interes() {
		// TODO Auto-generated method stub
		return 0.5;
	}

	@Override
	public long MinimoApertura() {
		// TODO Auto-generated method stub
		return 5000000;
	}

	@Override
	public String toString() {
	    return getPropietario() + "" + getfechaApertura() + ""+ getFechaCierre()+ getNumeroCuenta()+""+ getSaldo()+""+getInteres()+""+getMinimoApertura();
	}
	

	
	

}

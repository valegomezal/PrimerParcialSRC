package productos.CuentaCorriente;

import Launcher.Cliente;
import Launcher.Director;
import productos.Tarjeta.Tarjeta;

public class TrabajadorCorriente implements ICuentaCorriente{

	Director d = new Director();
	@Override
	public Tarjeta tarjeta() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String cuenta() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int Saldo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int numeroCuenta() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int CuotaManejo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Cliente propietario() {
		// TODO Auto-generated method stub
		return null;
	}

}

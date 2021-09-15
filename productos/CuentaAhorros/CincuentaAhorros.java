package productos.CuentaAhorros;

import Launcher.Cliente;
import Launcher.Director;
import productos.Tarjeta.Tarjeta;

public class CincuentaAhorros implements ICuentaAhorros{
	
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
		return 200000;
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

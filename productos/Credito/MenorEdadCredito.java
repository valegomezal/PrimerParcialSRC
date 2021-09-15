package productos.Credito;

import java.util.Date;

import Launcher.Cliente;
import Launcher.Director;

public class MenorEdadCredito implements ICredito{
	Director d = new Director();
	@Override
	public Cliente propietario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long ValorCredito() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int cuotas() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Date FechasPago() {
		// TODO Auto-generated method stub
		return null;
	}

}

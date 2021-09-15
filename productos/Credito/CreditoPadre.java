package productos.Credito;

import java.util.Date;

import Launcher.Cliente;
import productos.cdt.CdtPadre;
import productos.cdt.ICdt;

public class CreditoPadre implements ICredito {

	private long ValorCredito;
	private int cuotas;
	private Date FechasPago;
	private Cliente propietario;
	
	
	private CreditoPadre(CreditoPadre Cr) {
		super();
		this.propietario=Cr.propietario;
		this.cuotas=Cr.cuotas;
		this.FechasPago=Cr.FechasPago;
		this.ValorCredito=Cr.ValorCredito;
		
	}
	public Cliente getPropietario() {
		return propietario;
	}



	public void setPropietario(Cliente propietario) {
		this.propietario = propietario;
	}



	public long getValorCredito() {
		return ValorCredito;
	}


	public void setValorCredito(long valorCredito) {
		ValorCredito = valorCredito;
	}



	public int getCuotas() {
		return cuotas;
	}



	public void setCuotas(int cuotas) {
		this.cuotas = cuotas;
	}



	public Date getFechasPago() {
		return FechasPago;
	}



	public void setFechasPago(Date fechasPago) {
		FechasPago = fechasPago;
	}
	
	
	public CreditoPadre() {}
	
	
	
	@Override
	public Cliente propietario(Cliente pro) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public long ValorCredito(long ValorCredito) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int cuotas(int cuotas) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Date FechasPago(Date FechasPago) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ICredito clonarICredito() {
		// TODO Auto-generated method stub
		return new  CreditoPadre(this);
	}
	
}

package productos.cdt;

import java.util.Date;


import Launcher.Cliente;
import java.time.LocalDate;


public class CdtPadre implements ICdt {
	
	private Cliente propietario;
	private LocalDate fechaApertura;
	private LocalDate fechaCierre;
	private long NumeroCuenta;
	private long saldo;
	private int interes;
	private long MinimoApertura;
	
	public CdtPadre() {}
        /*
	public CdtPadre(CdtPadre c) {
		
		this.propietario=c.propietario;
		this.fechaApertura=c.fechaApertura;
		this.fechaCierre=c.fechaCierre;
		this.NumeroCuenta=c.NumeroCuenta;
		this.saldo=c.saldo;
		this.interes=c.interes;
		this.MinimoApertura=c.MinimoApertura;
		
	}
        */
        
        private CdtPadre(CdtPadre c) {
		
		this.propietario=c.propietario;
		this.fechaApertura=c.fechaApertura;
		this.fechaCierre=c.fechaCierre;
		this.NumeroCuenta=c.NumeroCuenta;
		this.saldo=c.saldo;
		this.interes=c.interes;
		this.MinimoApertura=c.MinimoApertura;
		
	}
        
	public Cliente getPropietario() {
		return propietario;
	}

	public void setPropietario(Cliente propietario) {
		this.propietario = propietario;
	}

	public LocalDate getfechaApertura() {
		return fechaApertura;
	}

	public void setfechaApertura(Date fechaApertura) {
		fechaApertura = fechaApertura;
	}

	public long getMinimoApertura() {
		return MinimoApertura;
	}

	public void setMinimoApertura(long minimoApertura) {
		MinimoApertura = minimoApertura;
	}

	public int getInteres() {
		return interes;
	}

	public void setInteres(int interes) {
		this.interes = interes;
	}

	public long getSaldo() {
		return saldo;
	}

	public void setSaldo(long saldo) {
		this.saldo = saldo;
	}

	public LocalDate getFechaCierre() {
		return fechaCierre;
	}

	public void setFechaCierre(LocalDate fechaCierre) {
		this.fechaCierre = fechaCierre;
	}

	public long getNumeroCuenta() {
		return NumeroCuenta;
	}

	public void setNumeroCuenta(long numeroCuenta) {
		NumeroCuenta = numeroCuenta;
	}
	
	@Override
	public ICdt clonar() {
		// TODO Auto-generated method stub
		return new  CdtPadre(this);
	}
	@Override
	public Cliente propietario(Cliente pro) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public LocalDate FechaApertura(LocalDate fecha) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public LocalDate FechaCierre(LocalDate fecha) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public long NumeroCuenta(long NumC) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public long saldo(long saldo) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double interes() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public long MinimoApertura() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}

package productos.CuentaCredito;

import java.util.Date;

import Launcher.Cliente;
import productos.Tarjeta.Tarjeta;

public class CuentaCreditoPadre implements ICuentaCredito{
	
	private Cliente propietario;
	   private Tarjeta tarjeta;
	   private String cuenta;
	   private int Saldo;
	   private int numeroCuenta;
	   private int CuotaManejo;
	   private int interes;
	   private Date fechaCorte;
	   
	   
	 public CuentaCreditoPadre() {
		 
	 }
	   public Cliente getPropietario() {
		return propietario;
	}

	public void setPropietario(Cliente propietario) {
		this.propietario = propietario;
	}

	public Tarjeta getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public int getSaldo() {
		return Saldo;
	}

	public void setSaldo(int saldo) {
		Saldo = saldo;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public int getCuotaManejo() {
		return CuotaManejo;
	}

	public void setCuotaManejo(int cuotaManejo) {
		CuotaManejo = cuotaManejo;
	}

	public int getInteres() {
		return interes;
	}

	public void setInteres(int interes) {
		this.interes = interes;
	}

	public Date getFechaCorte() {
		return fechaCorte;
	}

	public void setFechaCorte(Date fechaCorte) {
		this.fechaCorte = fechaCorte;
	}



	@Override
	public Cliente propietario() {
		// TODO Auto-generated method stub
		return null;
	}

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
	public int interes() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Date fechaCorte() {
		// TODO Auto-generated method stub
		return null;
	}

}

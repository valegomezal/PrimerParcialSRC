package productos.CuentaAhorros;

import Launcher.Cliente;
import productos.Credito.CreditoPadre;
import productos.Tarjeta.Tarjeta;

public class CuentaAhorrosPadre implements ICuentaAhorros{
	
	
	private Tarjeta tarjeta;
	private String cuenta;
	private int Saldo;
	private int numeroCuenta;
	private int CuotaManejo;
	private Cliente propietario;
	
	public CuentaAhorrosPadre() {}
	private CuentaAhorrosPadre(CuentaAhorrosPadre ca) {
		this.tarjeta=ca.tarjeta;
		this.cuenta=ca.cuenta;
		this.Saldo=ca.Saldo;
		this.numeroCuenta=ca.numeroCuenta;
		this.CuotaManejo=ca.CuotaManejo;
		this.propietario=ca.propietario;
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


	@Override
	public Cliente propietario(Cliente pro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tarjeta tarjeta(Tarjeta Boo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String cuenta(String Cuenta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int Saldo(int Saldo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int numeroCuenta(int numC) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int CuotaManejo(int CuotaM) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ICuentaAhorros IClonarAhorros() {
		// TODO Auto-generated method stub
		 return new  CuentaAhorrosPadre(this);
	}






}

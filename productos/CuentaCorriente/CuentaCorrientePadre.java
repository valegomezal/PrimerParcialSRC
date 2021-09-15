package productos.CuentaCorriente;

import Launcher.Cliente;
import productos.CuentaAhorros.CuentaAhorrosPadre;
import productos.Tarjeta.Tarjeta;

public class CuentaCorrientePadre implements ICuentaCorriente{
	
	
	private Tarjeta tarjeta;
	private  String cuenta;
    private int Saldo;
	private int numeroCuenta;
	private int CuotaManejo;
	private Cliente propietario;
	
	public CuentaCorrientePadre() {}
	
	private CuentaCorrientePadre(CuentaCorrientePadre cp) {
		
		this.tarjeta=cp.tarjeta;
		this.cuenta=cp.cuenta;
		this.Saldo=cp.Saldo;
		this.numeroCuenta=cp.numeroCuenta;
		this.CuotaManejo=cp.CuotaManejo;
		this.propietario=cp.propietario;
		
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
	public Tarjeta tarjeta(Tarjeta tar) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String cuenta(String cuenta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int Saldo(int Saldo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int numeroCuenta(int numeroCuenta) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int CuotaManejo(int Cuota) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public ICuentaCorriente IClonarCorriente() {
		// TODO Auto-generated method stub
		return new  CuentaCorrientePadre(this);
	}

}

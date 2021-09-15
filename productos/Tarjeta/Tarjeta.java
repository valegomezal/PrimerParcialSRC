package productos.Tarjeta;

import Launcher.Cliente;

public class Tarjeta {
	
	private long number;
	private int NumeroMes;
	private int AnoVencimiento;
	private int Cvv;
	//Cuenta TipodeCuenta=new Cuenta();
	
	
	
	public Tarjeta(Cliente propietario,long number,int NumeroMes,int AnoVencimiento,int Cvv) {
		
		this.number=number;
		this.NumeroMes=NumeroMes;
		this.AnoVencimiento=AnoVencimiento;
		this.Cvv=Cvv;
	
	}
	



	public long getnumber() {
		return number;
	}
	public void setnumber(long number) {
		this.number  = number;
	}
	public int getNumeroMes() {
		return NumeroMes;
	}
	public void setNumeroMes(int numeroMes) {
		NumeroMes = numeroMes;
	}
	public int getAnoVencimiento() {
		return AnoVencimiento;
	}
	public void setAnoVencimiento(int anoVencimiento) {
		AnoVencimiento = anoVencimiento;
	}
	public int getCvv() {
		return Cvv;
	}
	public void setCvv(int cvv) {
		Cvv = cvv;
	}
	
}

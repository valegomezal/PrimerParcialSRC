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

    public CdtPadre() {
    }

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

        this.propietario = c.propietario;
        this.fechaApertura = c.fechaApertura;
        this.fechaCierre = c.fechaCierre;
        this.NumeroCuenta = c.NumeroCuenta;
        this.saldo = c.saldo;
        this.interes = c.interes;
        this.MinimoApertura = c.MinimoApertura;

    }
    
    /**
     * @return the propietario
     */
    public Cliente getPropietario() {
        return propietario;
    }

    /**
     * @param propietario the propietario to set
     */
    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    /**
     * @return the fechaApertura
     */
    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    /**
     * @param fechaApertura the fechaApertura to set
     */
    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    /**
     * @return the fechaCierre
     */
    public LocalDate getFechaCierre() {
        return fechaCierre;
    }

    /**
     * @param fechaCierre the fechaCierre to set
     */
    public void setFechaCierre(LocalDate fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    /**
     * @return the NumeroCuenta
     */
    public long getNumeroCuenta() {
        return NumeroCuenta;
    }

    /**
     * @param NumeroCuenta the NumeroCuenta to set
     */
    public void setNumeroCuenta(long NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    /**
     * @return the saldo
     */
    public long getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the interes
     */
    public int getInteres() {
        return interes;
    }

    /**
     * @param interes the interes to set
     */
    public void setInteres(int interes) {
        this.interes = interes;
    }

    /**
     * @return the MinimoApertura
     */
    public long getMinimoApertura() {
        return MinimoApertura;
    }

    /**
     * @param MinimoApertura the MinimoApertura to set
     */
    public void setMinimoApertura(long MinimoApertura) {
        this.MinimoApertura = MinimoApertura;
    }
    
    
    @Override
    public ICdt clonar() {
        // TODO Auto-generated method stub
        return new CdtPadre(this);
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

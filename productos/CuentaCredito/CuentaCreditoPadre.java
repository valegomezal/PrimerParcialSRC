package productos.CuentaCredito;

import java.util.Date;

import Clientes.Cliente;
import java.time.LocalDate;
import productos.Credito.CreditoPadre;
import productos.Tarjeta.Tarjeta;

public class CuentaCreditoPadre implements ICuentaCredito {

    private Cliente propietario;
    private Tarjeta tarjeta;
    private String cuenta;
    private int Saldo;
    private int numeroCuenta;
    private int CuotaManejo;
    private int interes;
    private LocalDate fechaCorte;

    public CuentaCreditoPadre() {
    }

    private CuentaCreditoPadre(CuentaCreditoPadre cc) {

        this.propietario = cc.propietario;
        this.tarjeta = cc.tarjeta;
        this.cuenta = cc.cuenta;
        this.Saldo = cc.Saldo;
        this.numeroCuenta = cc.numeroCuenta;
        this.CuotaManejo = cc.CuotaManejo;
        this.interes = cc.interes;
        this.fechaCorte = cc.fechaCorte;

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
     * @return the tarjeta
     */
    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    /**
     * @param tarjeta the tarjeta to set
     */
    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the Saldo
     */
    public int getSaldo() {
        return Saldo;
    }

    /**
     * @param Saldo the Saldo to set
     */
    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }

    /**
     * @return the numeroCuenta
     */
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * @param numeroCuenta the numeroCuenta to set
     */
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * @return the CuotaManejo
     */
    public int getCuotaManejo() {
        return CuotaManejo;
    }

    /**
     * @param CuotaManejo the CuotaManejo to set
     */
    public void setCuotaManejo(int CuotaManejo) {
        this.CuotaManejo = CuotaManejo;
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
     * @return the fechaCorte
     */
    public LocalDate getFechaCorte() {
        return fechaCorte;
    }

    /**
     * @param fechaCorte the fechaCorte to set
     */
    public void setFechaCorte(LocalDate fechaCorte) {
        this.fechaCorte = fechaCorte;
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
    public int CuotaManejo(int CuotaManej) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int interes(int interes) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public LocalDate fechaCorte(LocalDate fechaCorte) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ICuentaCredito clonar() {
        // TODO Auto-generated method stub
        return new CuentaCreditoPadre(this);
    }

}

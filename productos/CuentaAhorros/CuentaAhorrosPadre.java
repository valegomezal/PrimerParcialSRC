package productos.CuentaAhorros;

import Launcher.Cliente;
import productos.Credito.CreditoPadre;
import productos.Tarjeta.Tarjeta;

public class CuentaAhorrosPadre implements ICuentaAhorros {

    private Tarjeta tarjeta;
    private String cuenta;
    private int Saldo;
    private int numeroCuenta;
    private int CuotaManejo;
    private Cliente propietario;

    public CuentaAhorrosPadre() {
    }

    private CuentaAhorrosPadre(CuentaAhorrosPadre ca) {
        this.tarjeta = ca.tarjeta;
        this.cuenta = ca.cuenta;
        this.Saldo = ca.Saldo;
        this.numeroCuenta = ca.numeroCuenta;
        this.CuotaManejo = ca.CuotaManejo;
        this.propietario = ca.propietario;
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
    public ICuentaAhorros clonar() {
        // TODO Auto-generated method stub
        return new CuentaAhorrosPadre(this);
    }

}

package productos.CuentaCorriente;

import Clientes.Cliente;
import productos.CuentaAhorros.CuentaAhorrosPadre;
import productos.Tarjeta.Tarjeta;

public class CuentaCorrientePadre implements ICuentaCorriente {

    private Tarjeta tarjeta;
    private String cuenta;
    private int Saldo;
    private int numeroCuenta;
    private int CuotaManejo;
    private Cliente propietario;

    public CuentaCorrientePadre() {
    }

    private CuentaCorrientePadre(CuentaCorrientePadre cp) {

        this.tarjeta = cp.tarjeta;
        this.cuenta = cp.cuenta;
        this.Saldo = cp.Saldo;
        this.numeroCuenta = cp.numeroCuenta;
        this.CuotaManejo = cp.CuotaManejo;
        this.propietario = cp.propietario;

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
        return new CuentaCorrientePadre(this);
    }

}

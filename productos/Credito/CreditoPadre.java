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

    public CreditoPadre() {
    }

    private CreditoPadre(CreditoPadre Cr) {
        super();
        this.propietario = Cr.propietario;
        this.cuotas = Cr.cuotas;
        this.FechasPago = Cr.FechasPago;
        this.ValorCredito = Cr.ValorCredito;

    }
    
    /**
     * @return the ValorCredito
     */
    public long getValorCredito() {
        return ValorCredito;
    }

    /**
     * @param ValorCredito the ValorCredito to set
     */
    public void setValorCredito(long ValorCredito) {
        this.ValorCredito = ValorCredito;
    }

    /**
     * @return the cuotas
     */
    public int getCuotas() {
        return cuotas;
    }

    /**
     * @param cuotas the cuotas to set
     */
    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    /**
     * @return the FechasPago
     */
    public Date getFechasPago() {
        return FechasPago;
    }

    /**
     * @param FechasPago the FechasPago to set
     */
    public void setFechasPago(Date FechasPago) {
        this.FechasPago = FechasPago;
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
        return new CreditoPadre(this);
    }

}

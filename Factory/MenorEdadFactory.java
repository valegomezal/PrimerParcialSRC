package Factory;

import productos.Credito.ICredito;
import productos.CuentaAhorros.ICuentaAhorros;
import productos.CuentaCorriente.ICuentaCorriente;
import productos.CuentaCredito.ICuentaCredito;
import productos.cdt.ICdt;
import productos.CuentaAhorros.*;
import productos.cdt.*;
import productos.Credito.*;
import productos.CuentaCorriente.*;
import productos.CuentaCredito.*;

public class MenorEdadFactory implements IFactoryPortafolio {

    @Override
    public ICdt darCdt() {
        // TODO Auto-generated method stub
        return new MenorEdadCdt();
    }

    @Override
    public ICredito darCredito() {
        // TODO Auto-generated method stub
        return new MenorEdadCredito();
    }

    @Override
    public ICuentaAhorros darCuentaAhorros() {
        // TODO Auto-generated method stub
        return new MenorEdadAhorros();
    }

    @Override
    public ICuentaCorriente darCuentaCorriente() {
        // TODO Auto-generated method stub
        return new MenorEdadCorriente();
    }

    @Override
    public ICuentaCredito darCuentaCredito() {
        // TODO Auto-generated method stub
        return new MenorEdadCuentaCredita();
    }

}

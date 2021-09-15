package productos.Tarjeta;

import Launcher.Cliente;

public class Tarjeta {

    

    private String number;
    private int NumeroMes;
    private int AnoVencimiento;
    private int Cvv;
    private int maximoTransaccion;
    //Cuenta TipodeCuenta;

    private Tarjeta(Tarjeta ta) {

        this.number = ta.number;
        this.NumeroMes = ta.NumeroMes;
        this.AnoVencimiento = ta.AnoVencimiento;
        this.Cvv = ta.Cvv;

    }

    public Tarjeta() {
        // TODO Auto-generated constructor stub
    }
    
    public Tarjeta(int maximoTransaccion){
        this.maximoTransaccion = maximoTransaccion;
    }
    
    
    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return the NumeroMes
     */
    public int getNumeroMes() {
        return NumeroMes;
    }

    /**
     * @param NumeroMes the NumeroMes to set
     */
    public void setNumeroMes(int NumeroMes) {
        this.NumeroMes = NumeroMes;
    }

    /**
     * @return the AnoVencimiento
     */
    public int getAnoVencimiento() {
        return AnoVencimiento;
    }

    /**
     * @param AnoVencimiento the AnoVencimiento to set
     */
    public void setAnoVencimiento(int AnoVencimiento) {
        this.AnoVencimiento = AnoVencimiento;
    }

    /**
     * @return the Cvv
     */
    public int getCvv() {
        return Cvv;
    }

    /**
     * @param Cvv the Cvv to set
     */
    public void setCvv(int Cvv) {
        this.Cvv = Cvv;
    }

    /**
     * @return the maximoTransaccion
     */
    public int getMaximoTransaccion() {
        return maximoTransaccion;
    }

    /**
     * @param maximoTransaccion the maximoTransaccion to set
     */
    public void setMaximoTransaccion(int maximoTransaccion) {
        this.maximoTransaccion = maximoTransaccion;
    }

}

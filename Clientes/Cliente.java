
package Clientes;

import java.util.Date;
import java.time.*;

/**
 *
 * @author andresdavidcontrerasgonzalez
 */
public class Cliente {
     public LocalDate Fechadenacimiento;
     public String id_cliente;
     public String ocupacion;
     public String Nombre;
     public boolean portafolio=false;

    public Cliente(LocalDate Fechadenacimiento, String ocupacion) {
        this.Fechadenacimiento = Fechadenacimiento;
        this.ocupacion = ocupacion;
    }

    public LocalDate getFechadenacimiento() {
        return Fechadenacimiento;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public boolean isPortafolio() {
        return portafolio;
    }

    public void setFechadenacimiento(LocalDate Fechadenacimiento) {
        this.Fechadenacimiento = Fechadenacimiento;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPortafolio(boolean portafolio) {
        this.portafolio = portafolio;
    }

    @Override
    public String toString() {
        return "Clientes{" + "Fechadenacimiento=" + Fechadenacimiento + ", id_cliente=" + id_cliente + ", ocupacion=" + ocupacion + ", Nombre=" + Nombre + ", portafolio=" + portafolio + '}';
    }
     
     
}

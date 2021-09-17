
package Clientes;

import java.util.Date;
import java.time.*;
import portafolios.Portafolio;
import portafolios.DirectorPortafolio;

/**
 *
 * @author andresdavidcontrerasgonzalez
 */
public class Cliente {

    
     private LocalDate Fechadenacimiento;
     private String id_cliente = "";
     private String ocupacion;
     private String Nombre;
     private Portafolio portafolio;

    public Cliente(LocalDate Fechadenacimiento, String ocupacion) {
        this.Fechadenacimiento = Fechadenacimiento;
        this.ocupacion = ocupacion;
    }
    
    public int getEdad(){
        return Period.between(getFechadenacimiento(), java.time.LocalDate.now()).getYears();
        
    }
    
    public void asignarPortafolio(){
        int edad = this.getEdad();
        DirectorPortafolio director = new DirectorPortafolio();
        System.out.println("Asignando portafolio");
        System.out.println("Edad: "+edad+"| ocupación:"+this.ocupacion);
        
        if  (edad >= 18 && this.ocupacion.equals("Estudiante")) {
            this.portafolio = director.getPortafolioMenorDeEdad(this);
            System.out.println("Hola");
            
        } else if  (edad >= 18 && this.ocupacion.equals("Trabajador")) {
            this.portafolio = director.getPortafolioTrabajador(this);
            
        } else if  (edad >= 18 && this.ocupacion.equals("Militar")) {
            this.portafolio = director.getPortafolioMilitar(this);
            
        } else if  (edad >= 18 && this.ocupacion.equals("Pensionado")) {
            this.portafolio = director.getPortafolioCincuentaniero(this);
        }
        
        
    }
    
    /**
     * @return the Fechadenacimiento
     */
    public LocalDate getFechadenacimiento() {
        return Fechadenacimiento;
    }

    /**
     * @param Fechadenacimiento the Fechadenacimiento to set
     */
    public void setFechadenacimiento(LocalDate Fechadenacimiento) {
        this.Fechadenacimiento = Fechadenacimiento;
    }

    /**
     * @return the id_cliente
     */
    public String getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * @return the ocupacion
     */
    public String getOcupacion() {
        return ocupacion;
    }

    /**
     * @param ocupacion the ocupacion to set
     */
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the portafolio
     */
    public Portafolio getPortafolio() {
        return portafolio;
    }

    /**
     * @param portafolio the portafolio to set
     */
    public void setPortafolio(Portafolio portafolio) {
        this.portafolio = portafolio;
    }

    @Override
    public String toString() {
        return "Clientes{" + "Fechadenacimiento=" + getFechadenacimiento() + ", id_cliente=" + getId_cliente() + ", ocupacion=" + getOcupacion() + ", Nombre=" + getNombre() + ", portafolio=" + getPortafolio() + '}';
    }
     
     
}

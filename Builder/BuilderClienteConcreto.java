package Builder;

import Clientes.Clientes;
import java.util.Date;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author andresdavidcontrerasgonzalez
 */
public class BuilderClienteConcreto implements IBuilderCliente {

    private Clientes clienteAuxiliar;

    public Clientes reset(String fecha, String ocupacion) {
        LocalDate date;
        
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            date = LocalDate.parse(fecha, formatter);
            System.out.printf("%s%n", date);
        }
        catch (DateTimeParseException exc) {
            System.out.printf("%s Fecha incorrecta!%n", fecha);
            throw exc;      // Rethrow the exception.
        }
        clienteAuxiliar = new Clientes(date, ocupacion);
        return clienteAuxiliar;
    }

    @Override
    public IBuilderCliente setID(String Id) {
        clienteAuxiliar.id_cliente = Id;
        return this;
    }

    @Override
    public IBuilderCliente setOcupacion(String Ocupacion) {
        clienteAuxiliar.ocupacion = Ocupacion;
        return this;
    }

    @Override
    public IBuilderCliente setNombre(String nombre) {
        clienteAuxiliar.Nombre = nombre;
        return this;
    }

    @Override
    public IBuilderCliente setPortafolio() {
        clienteAuxiliar.portafolio = true;
        return this;
    }

    @Override
    public Clientes getCliente() {
        return this.clienteAuxiliar;
    }
}

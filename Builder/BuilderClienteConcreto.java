package Builder;

import Clientes.Cliente;
import java.util.Date;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import portafolios.Portafolio;

/**
 *
 * @author andresdavidcontrerasgonzalez
 */
public class BuilderClienteConcreto implements IBuilderCliente {

    private Cliente clienteAuxiliar;

    public Cliente reset(String fecha, String ocupacion) {
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
        clienteAuxiliar = new Cliente(date, ocupacion);
        return clienteAuxiliar;
    }

    @Override
    public IBuilderCliente setID(String Id) {
        clienteAuxiliar.setId_cliente(Id);
        return this;
    }

    @Override
    public IBuilderCliente setOcupacion(String Ocupacion) {
        clienteAuxiliar.setOcupacion(Ocupacion);
        return this;
    }

    @Override
    public IBuilderCliente setNombre(String nombre) {
        clienteAuxiliar.setNombre(nombre);
        return this;
    }

    @Override
    public IBuilderCliente setPortafolio(Portafolio port) {
        clienteAuxiliar.setPortafolio(port);
        return this;
    }

    @Override
    public Cliente getCliente() {
        return this.clienteAuxiliar;
    }
}

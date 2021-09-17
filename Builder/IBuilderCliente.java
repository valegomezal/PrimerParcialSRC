
package Builder;

import Clientes.Cliente;
import portafolios.Portafolio;

/**
 *
 * @author andresdavidcontrerasgonzalez
 */
public interface IBuilderCliente {
    
    public IBuilderCliente setID(String Id);
    public IBuilderCliente setOcupacion(String Ocupacion);
    public IBuilderCliente setNombre(String nombre);
    public IBuilderCliente setPortafolio(Portafolio port);
    public Cliente getCliente();
}

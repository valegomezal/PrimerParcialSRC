
package Builder;

import Clientes.Cliente;

/**
 *
 * @author andresdavidcontrerasgonzalez
 */
public interface IBuilderCliente {
    
    public IBuilderCliente setID(String Id);
    public IBuilderCliente setOcupacion(String Ocupacion);
    public IBuilderCliente setNombre(String nombre);
    public IBuilderCliente setPortafolio();
    public Cliente getCliente();
}

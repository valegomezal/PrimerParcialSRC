package luancher;

import Builder.BuilderClienteConcreto;
import Builder.IBuilderCliente;
import Clientes.Clientes;

public class Director {
    private IBuilderCliente b;
    
    public Clientes Cliente_estudiante(){
      BuilderClienteConcreto cle = new BuilderClienteConcreto(); 
      cle.reset("2003/12/01", "Estudiante");
      cle.setID("1019131750");
      cle.setNombre("david Contreras");
      cle.setPortafolio();
      return cle.getCliente();
    }
    public Clientes Cliente_trabjador(){
      BuilderClienteConcreto cle = new BuilderClienteConcreto(); 
      cle.reset("1993/07/01", "Trabajador");
      cle.setID("1902349512");
      cle.setNombre("juan gonzalez");
      cle.setPortafolio();
      return cle.getCliente();
    }
    public Clientes Cliente_cincuentanero(){
      BuilderClienteConcreto cle = new BuilderClienteConcreto(); 
      cle.reset("1975/10/01", "Cincuentañero");
      cle.setID("12230491");
      cle.setNombre("Doni Contreras");
      cle.setPortafolio();
      return cle.getCliente();
    }
    public Clientes Cliente_militar(){
      BuilderClienteConcreto cle = new BuilderClienteConcreto(); 
      cle.reset("1980/12/01", "Militar");
      cle.setID("11232934");
      cle.setNombre("Diego Alvares");
      cle.setPortafolio();
      return cle.getCliente();
    }
}

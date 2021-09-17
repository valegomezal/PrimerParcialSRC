/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luancher;

import Clientes.Clientes;
import java.util.Calendar;
import java.util.Date;
import Clientes.ClienteMenu;

/**
 *
 * @author andresdavidcontrerasgonzalez
 */
public class Main {
    public static void main(String[] args) {
      /*
      Director d = new Director();
      Clientes Estudiante = d.Cliente_estudiante();
      Clientes Trabajador = d.Cliente_trabjador();
      Clientes Cincuentanero= d.Cliente_cincuentanero();
      Clientes Militar = d.Cliente_militar();
      
        System.out.println(Estudiante.toString());
        System.out.println("");
        */
      ClienteMenu creadorCliente = new ClienteMenu();
      Clientes cliente1 = creadorCliente.createCliente();
        System.out.println("Hola");
        System.out.println(cliente1.toString());
    }   
}

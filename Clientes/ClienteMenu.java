package Clientes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Clientes.Cliente;
import java.util.Scanner;
import Builder.BuilderClienteConcreto;

/**
 *
 * @author juana
 */
public class ClienteMenu {
    
    public String getMenu(){
        String menu = "1. Establecer fecha de nacimiento.\n"
                + "2. Establecer ocupación.\n"
                + "3. Establecer nombre.\n"
                + "4. Establecer ID.\n"
                + "5. Guardar Cliente";
        return menu;
    }
    
    public Cliente createCliente(){
        String fecha = "";
        String ocupacion = "";
        String nombre = "";
        String id = "";
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int option;
        BuilderClienteConcreto builder = new BuilderClienteConcreto();
        
        
        while (true) {
            System.out.println(getMenu());
            
            System.out.println("Opción:");
            option = scanner.nextInt();
            
            if (option == 1) {
                System.out.println("Fecha de nacimiento:");
                fecha = scanner2.nextLine();
                
                if (fecha != "" && ocupacion != "") {
                    builder.reset(fecha, ocupacion);
                }
            } else if (option == 2) {
                System.out.println("Ocupacion:");
                ocupacion = scanner2.nextLine();
                
                if (fecha != "" && ocupacion != "") {
                    builder.reset(fecha, ocupacion);
                }
            } else if (option == 3) {
                System.out.println("Nombre:");
                nombre = scanner2.nextLine();
                
                //builder.setNombre(nombre);
            } else if (option == 4) {
                System.out.println("ID:");
                //id = scanner2.nextLine();
            } else if (option == 5) {
                if (fecha != "" && ocupacion != "") {
                    builder.setID(id);
                    builder.setNombre(nombre);
                    Cliente client = builder.getCliente();
                    client.asignarPortafolio();
                    
                    return client;
                } else {
                    System.out.println("Los campos Fecha de nacimiento y Ocupación son mandatorios.");
                }
                
            }
        }
    }
}

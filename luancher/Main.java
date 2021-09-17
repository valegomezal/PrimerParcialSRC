/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luancher;

import Clientes.Cliente;
import java.util.Calendar;
import java.util.Date;
import Clientes.ClienteMenu;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import Clientes.ClienteMenu;

/**
 *
 * @author andresdavidcontrerasgonzalez
 */
public class Main {

    public static void main(String[] args) {
        
        ClienteMenu creadorCliente = new ClienteMenu();
        Cliente client1 = creadorCliente.createCliente();
        System.out.println(client1.toString());
        System.out.println(client1.getEdad());
    }
}

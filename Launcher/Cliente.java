package Launcher;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Factory.IFactoryPortafolio;
import Factory.MenorEdadFactory;
import productos.cdt.ICdt;
import productos.cdt.MenorEdadCdt;


public class Cliente {
	
	   public static void main(String[] args) {
	       
		   Scanner leer=new Scanner(System.in);
		   int cuenta=leer.nextInt();
		  
		   
		   System .out.println("BIENVENIDO");
		   System .out.println("");
		   System .out.println("Que producto desea solicitar");
		   System .out.println("1.CDT");
		   System .out.println("2.CREDITO");
		   System .out.println("3.CUENTA AHORROS");
		   System .out.println("4.CUENTA CORRIENTE");
		   System .out.println("5.CUENTA CREDITO");
		   
		   if(cuenta==1) {
			   
			   System .out.println("Ingrese Nombre");
			   String nombre=leer.toString();
			   System.out.println("Edad");
			   int edad=leer.nextInt();
			   if (edad<18) {
				   
				   System .out.println("BIENVENIDO AL CDT PARA MENORES DE EDAD");
				   
				   System.out.println("Introduzca la fecha con formato dd/mm/yyyy");
			        Scanner sc = new Scanner(System.in);
			        String fecha = sc.nextLine();
			        
			        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			        Date testDate = null;
			        String date = fecha;
			        try{
			            testDate = df.parse(date);
			            System.out.println("Ahora hemos creado un objeto date con la fecha indicada, "+testDate);
			        } catch (Exception e){ System.out.println("invalid format");}
			 
			        if (!df.format(testDate).equals(date)){
			            System.out.println("invalid date!!");
			        } else {
			            System.out.println("valid date");
			        }
				   
				   
			   }
			   
			   
		   }
	    }

}

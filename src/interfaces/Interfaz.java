package interfaces;

import dominio.Catalogo;
import dominio.Ropa;
import java.lang.ArrayIndexOutOfBoundsException;

public class Interfaz{
	private static Catalogo catalogo = new Catalogo();

	private static void mostrarAyuda(){
            System.out.println("Las instrucciones posibles son las siguientes:");
            System.out.println("   1. Mostrar Ropa: java -jar catalogo.jar show");
	    System.out.println("   2. Mostrar esta ayuda: java -jar catalogo.jar help");
	    System.out.println("   3. Añadir ropa: java -jar catalogo.jar add <tipo> <marca>, por ejemplo, ");
	    System.out.println("                   java -jar catalogo.jar add Camiseta Decathlon");
	}


	public static void ejecutar(String[] args){
	   try
           {
	       if(args[0].equalsIgnoreCase("add"))
		  catalogo.annadirRopa(new Ropa(args[1], args[2]));
	       else if (args[0].equalsIgnoreCase("show"))
		  catalogo.mostrarRopas();
	       else if (args[0].equalsIgnoreCase("help")) mostrarAyuda();
	       else mostrarAyuda();
	   }catch(ArrayIndexOutOfBoundsException ex){
		   mostrarAyuda();
	   }
	}
}

	
	

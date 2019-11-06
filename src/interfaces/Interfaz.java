package interfaces;

import dominio.Catalogo;
import dominio.Ropa;
import java.lang.ArrayIndexOutOfBoundsException;

//Esta clase es responsable de la interfaz de texto desde el terminal. 

public class Interfaz{
	private static Catalogo catalogo = new Catalogo();

	private static void mostrarAyuda(){
            System.out.println("Las instrucciones posibles son las siguientes:");
            System.out.println("   1. Mostrar Ropa: java -jar catalogo.jar show");
	    System.out.println("   2. Mostrar esta ayuda: java -jar catalogo.jar help");
	    System.out.println("   3. Añadir ropa: java -jar catalogo.jar add <tipo> <marca>, por ejemplo, ");
	    System.out.println("                   java -jar catalogo.jar add Camiseta Decathlon");
	}

	//Permite ejecutar según los siguientes parámetros:
	//1."Show"> Mostrar la ropa del catalogo.
	//2."Help"> Para obtener ayuda.
	//3."Add"> Para agregar ropa al catalogo.
	//args[1]> Tipo de ropa.
	//args[2]> Marca de ropa.


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

//Copyright [2019] [Nicholas Seideman]Licensed under the Apache License, Version 2.0 (the "License");you may not use this file except in compliance with the License.You may obtain a copy of the License athttp://www.apache.org/licenses/LICENSE-2.0Unless required by applicable law or agreed to in writing, softwaredistributed under the License is distributed on an "AS IS" BASIS,WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.See the License for the specific language governing permissions andlimitations under the License.	
	

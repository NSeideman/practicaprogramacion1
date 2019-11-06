package dominio;

import java.util.ArrayList;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

//Clase responsable de cada catalogo de ropa.


public class Catalogo{
	private ArrayList<Ropa> listaRopas = new ArrayList<>();
	private static String nombreFichero = "ropas.txt";
	
        //En caso de que haya ropa almacenada en ropas.txt, lo carga. 

	public Catalogo(){
		cargarDesdeFichero();
	}

	//Añade ropa al catalogo.
	
	public void annadirRopa(Ropa ropa){
		listaRopas.add(ropa);
		volcarAFichero();
	}

	//Muestra la ropa del catalogo.

	public void mostrarRopas()
	{
	   for(Ropa ropa : listaRopas) System.out.println(ropa);
	}

	private void volcarAFichero(){
	    try{
		FileWriter fw = new FileWriter(nombreFichero);
		fw.write(this.toString());
		fw.close();
	    }catch(IOException ex){
	        System.err.println("Error al intentar escribir en fichero");
	    }
	}

	private void cargarDesdeFichero(){
            try{
		File fichero = new File(nombreFichero);
		if (fichero.createNewFile()){
		    System.out.println("Acaba de crearse un nuevo fichero");
	       } else {
		   Scanner sc = new Scanner(fichero);
		   while(sc.hasNext()){
		       listaRopas.add(new Ropa(sc.next(), sc.next()));
		   }
	       }
	   }catch(IOException ex){
	   }
	}

	//Devuelve el toString() de cada prenda.

	@Override
	public String toString(){
	    StringBuilder sb = new StringBuilder();
	    for(Ropa ropa : listaRopas) sb.append(ropa + "\n");
	    return sb.toString();
	}
}


//Copyright [2019] [Nicholas Seideman]Licensed under the Apache License, Version 2.0 (the "License");you may not use this file except in compliance with the License.You may obtain a copy of the License athttp://www.apache.org/licenses/LICENSE-2.0Unless required by applicable law or agreed to in writing, softwaredistributed under the License is distributed on an "AS IS" BASIS,WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.See the License for the specific language governing permissions andlimitations under the License. 











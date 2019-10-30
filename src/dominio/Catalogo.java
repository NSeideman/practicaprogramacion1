package dominio;

import java.util.ArrayList;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;


public class Catalogo{
	private ArrayList<Ropa> listaRopas = new ArrayList<>();
	private static String nombreFichero = "ropas.txt";
	public Catalogo(){
		cargarDesdeFichero();
	}
	public void annadirRopa(Ropa ropa){
		listaRopas.add(ropa);
		volcarAFichero();
	}

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

	@Override
	public String toString(){
	    StringBuilder sb = new StringBuilder();
	    for(Ropa ropa : listaRopas) sb.append(ropa + "\n");
	    return sb.toString();
	}
}














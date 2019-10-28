package dominio;

import java.util.ArrayList;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

public class Catalogo{
	private ArrayList<Ropa> listaRopa = new ArrayList<>();
	private static String nombreFichero = "ropa.txt";
	public Catalogo(){
		cargarDesdeFichero();
	}

	public void annadirRopa(Ropa ropa){
		listaRopa.add(ropa);
		volcarAFichero();
	}

	public void mostrarRopa()
	{
	   for(Ropa ropa : listaRopa) System.out.println(ropa);
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
		       listaRopa.add(new Ropa(sc.next(), sc.next()));
		   }
	       }
	   }catch(IOException ex){
	   }
	}

	@Override
	public String toString(){
	    StringBuilder sb = new StringBuilder();
	    for(Ropa ropa : listaRopa) sb.append(ropa + "\n");
	    return sb.toString();
	}
}













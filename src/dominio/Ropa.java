package dominio;

public class Ropa{
	private String marca;
	private String tipo;

public void setMarca(String Marca){
	this.marca = marca;
}

public String getMarca(){
	return marca;
}

public void setTipo(String Tipo){
	this.tipo = tipo;
}

public String getTipo(){
	return tipo;
}

public Ropa(String marca, String tipo){
	this.marca = marca;
	this.tipo = tipo;

@Override
public String toString(){
	return getTipo() + " " + getMarca();
}

        

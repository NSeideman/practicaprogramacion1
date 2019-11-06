package dominio;


// La clase que contiene la información de toda la ropa.
 


public class Ropa{
	private String tipo;
	private String marca;


	// Establece la marca de ropa.

        public void setMarca(String marca){
	    this.marca = marca;
	}

	// Recupera la marca de ropa.

        public String getMarca(){
	    return marca;
        }
       
        // Establece el tipo de ropa.


        public void setTipo(String tipo){
	    this.tipo = tipo;
        }

	// Recupera el tipo de ropa.

        public String getTipo(){
	    return tipo;
        }

	// Crea la ropa a partir del tipo y la marca.

        public Ropa(String tipo, String marca){
	    this.tipo = tipo;
	    this.marca = marca;
	}

	// Devuelve el tipo y la marca de la ropa en forma de cadena de caracteres.

        @Override
        public String toString(){
	    return getTipo() + " " + getMarca();
        }

}

//Copyright [2019] [Nicholas Seideman]Licensed under the Apache License, Version 2.0 (the "License");you may not use this file except in compliance with the License.You may obtain a copy of the License athttp://www.apache.org/licenses/LICENSE-2.0Unless required by applicable law or agreed to in writing, softwaredistributed under the License is distributed on an "AS IS" BASIS,WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.See the License for the specific language governing permissions andlimitations under the License.

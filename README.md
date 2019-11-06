

1. Mostrar ropa: 

~~~~
java -jar catalogo.jar show
~~~~

2. Mostrar ayuda:

~~~~
java -jar catalogo.jar help
~~~~

3. Añadir ropa:

~~~~
java -jar catalogo.jar add <tipo> <marca>
~~~~

    por ejemplo,
~~~~
java -jar catalogo.jar add Pantalones Decathlon
~~~~

# Notas para los desarolladores

## Generación de Javadoc:

Se ejecuta la siguiente instrucción:

~~~~
make javadoc
~~~~

Suponiendo que tiene instalado "firefox", se ejecuta:

~~~~
firefox html/index.html
~~~~

## Sobre el fichero _makefile_

Se han utlizado comandos propios de Linux, por tanto, sólo ejecuta en este sistema operativo.


//Copyright [2019] [Nicholas Seideman]Licensed under the Apache License, Version 2.0 (the "License");you may not use this file except in compliance with the License.You may obtain a copy of the License athttp://www.apache.org/licenses/LICENSE-2.0Unless required by applicable law or agreed to in writing, softwaredistributed under the License is distributed on an "AS IS" BASIS,WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.See the License for the specific language governing permissions andlimitations under the License. 

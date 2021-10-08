//: Numerosc.java
/** Primer ejercicio de tipo de datos
 *  Creamos una clase Numeros
 *  Creamos un objeto
 * @author Manuel Molino
 * @author correo@iesvirgendelcarmen.com
 * @version 1.0
*/
public class Numeros {
//variable de instancia denomina numero
	private int numero=0;
/**  Constructor que asigna un entero
* al objeto
* @param int numero que se asigna a la 
* variable de instancia numero
*/
	public Numeros(int numero){
		this.numero=numero;
	}
/**  Método que devuelve el valor doble
* de la variable de instancia
* @return int  numero que es el doble de la 
* variable de instancia numero
*/
	public int Doble(){
		return 2*numero;
	}

// Método main, que es el que inicia el programa

        public static void main(String[] args) {
	//Creamos un objeto Numeros con valor 7
	Numeros ejercicio = new Numeros(7);
	//Creamos una variable que recoja el valor
	//doble de dicha variable
	int doble = ejercicio.Doble();
	//imprimimos los valores del objeto
	System.out.println("Valor inicial del objeto: "+ejercicio.numero);
	//imprimimos el valor doble
	System.out.println("Valor doble del objeto: "+doble);

        }
}


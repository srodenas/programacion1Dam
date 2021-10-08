//: Ejercicio3.java
/** Tercer ejercicio de tipo de datos
 *  aprobechamos que tenemos una clase
 *  denominada Ejercicio1
 *  pero ahora leemos los datos desde
 *  la línea de comandos
 * @author Manuel Molino
 * @author correo@iesvirgendelcarmen.com
 * @version 1.0
*/

// Necesito importa funcionalidades
// de las librerías standar de java
import java.util.Scanner;

	public class TestNumeros{

// Método main, que es el que inicia el programa

        public static void main(String[] args) {
	//Creamos un objeto Scanner para leer de la entrada standar
	Scanner in = new Scanner(System.in);
	System.out.println("Introduce un número");
	//Guardamos en una variable de tipo entero el valor
	int valor = in.nextInt();
	//Creamos un objeto Ejercicio1 con valor anteriormente leído
	Ejercicio1 ejercicio = new Ejercicio1(valor);
	//Creamos una variable que recoja el valor
	//doble de dicha variable
	int doble = ejercicio.Doble();
	//imprimimos los valores del objeto
	System.out.println("Valor inicial del objeto: "+valor);
	//imprimimos el valor doble
	System.out.println("Valor doble del objeto: "+doble);

        }
}


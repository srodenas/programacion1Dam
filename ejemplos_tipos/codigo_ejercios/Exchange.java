import java.util.Scanner;

public class Exchange {
	private double moneda=0;
	
	public Exchange(double moneda){
		this.moneda=moneda;
	}

	public double cambiarADolares(){
	//Completar el código aquí
	//	 return ;
	}

	//Añade dos nuevos métodos para que cambie
	//a yenes y libras

        public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Introduce la cantidad a cambiar: ");
		double cantidad = in.nextDouble();
		Exchange cambio = new Exchange(cantidad);
		System.out.println(cantidad+" € son: "+cambio.cambiarADolares()+" $");
		//Completar código para que cambie a yenes y libras
        }
}


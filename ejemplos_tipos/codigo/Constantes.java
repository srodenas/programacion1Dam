public class Constantes{
	public static final double CONSTANTE0= 0.0;
	public static void main(String[] ar){

		final int CONSTANTE1=11;
		final int CONSTANTE2=22;
		//Intento cambiar su valor
		//CONSTANTE1 =23;
		//CONSTANTE0 =23;
		{
		// Defino una constante en este bloque
			final int CONSTANTE3=33;
		//Intento acceder a constantes definidas en bloque padre
			System.out.println("Constante0: "+CONSTANTE0);
			System.out.println("Constante1: "+CONSTANTE1);
			System.out.println("Constante2: "+CONSTANTE2);
			System.out.println("Constante3: "+CONSTANTE3);
		}
		{
		// Defino una constante en este bloque
			final int CONSTANTE4=44;
		//Intento acceder a constantes definidas en bloque padre
			System.out.println("Constante0: "+CONSTANTE0);
			System.out.println("Constante1: "+CONSTANTE1);
			System.out.println("Constante2: "+CONSTANTE2);
	// Intento acceder a una constante definida en otro bloque
	//		System.out.println("Constante3: "+CONSTANTE3);
			System.out.println("Constante:4 "+CONSTANTE4);
		}
		//Intento acceder a todas las constantes definidas 
			System.out.println("Constante0: "+CONSTANTE0);
			System.out.println("Constante1: "+CONSTANTE1);
			System.out.println("Constante2: "+CONSTANTE2);
//			System.out.println("Constante3: "+CONSTANTE3);
//			System.out.println("Constante:4 "+CONSTANTE4);
		

	}
}

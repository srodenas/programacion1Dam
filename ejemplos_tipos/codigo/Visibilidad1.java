public class Visibilidad1{
	public static void main(String[] arg){
		String fuera= "Definida fuera del bloque";
		{
			String dentro="Definida dentro del bloque";
			System.out.println(fuera);
			System.out.println(dentro);
		}
		System.out.println("==================");
		System.out.println(fuera);
//		System.out.println(dentro);
	}
}

public class Cast{
	public static void main(String[] m){
		int x1=7; double y1=13.4; x1+=(int)y1;
		System.out.println("Valor de x1: "+x1);
		double x2=7.5; int y2=13; x2-=y2;
		System.out.println("Valor de x2: "+x2);
		int x3=2; double y3=2E1; x3*=(int)y3;
		System.out.println("Valor de x3: "+x3);
		double x4=5.5; int y4=2; x4/=y4;
		System.out.println("Valor de x4: "+x4);
		int x5=56; double y5=10.2; x5%=(int)y5;
		System.out.println("Valor de x5: "+x5);
		float x6=1.1F; double y6=3.0; x6+=y6*y6; 
		System.out.println("Valor de x6: "+x6);
		double x7=1.1; float y7=3.0F; x7+=y7*y7;
		System.out.println("Valor de x7: "+x7);
		int x8=1; long y8=3; x8+=y8*y8; 
		System.out.println("Valor de x8: "+x8);
		long x9=1; int y9=3; x9+=y9*y9;
		System.out.println("Valor de x9: "+x9);
	}
}



public class ConversionDeDatos {
	public static void main(String[] args) {
		byte numeroByte = 10;
		short numeroShort = numeroByte;
		
		long numeroLong = 1002412343;
//		byte numeropequenio = numeroLong;
		
		int otroInt = (int) numeroLong;
		System.out.println(otroInt);
		
	}
}

import java.util.Scanner;

public class Escaner {
	public static void main(String[] arg) {
		Scanner escaner = new Scanner(System.in);
		
		
		System.out.print("Escribe un numero: ");
		int numero = escaner.nextInt();
		
		System.out.println(numero);
	}
}

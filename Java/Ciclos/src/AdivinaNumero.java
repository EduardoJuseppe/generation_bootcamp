
import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] arg) {
		int numeroAdivinar = 0;
		int numero = (int)(Math.random()*100+1);
		Scanner teclado = new Scanner(System.in);
		
		System.out.println(numero);
		
		do {
			System.out.print("Numero a adivinar");
			int num = teclado.nextInt();
			numeroAdivinar = num;
			if(numero == numeroAdivinar) {
				System.out.println("Numeros Iguales");
			}else {
				System.out.println("Numeros Diferentes");
			}	
		}while(!(numero == numeroAdivinar));
		teclado.close();
		System.out.println("Adivinaste con exito");
	}	
}

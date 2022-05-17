import java.util.Scanner;
public class ValidarCorreo {
	public static void main(String[] args) {
		char arroba = '@';
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un correo");
        String correo = teclado.nextLine();

       for (int i = 0; i < correo.length(); i++) {
           if(arroba == correo.charAt(i)) {
               System.out.println("Si es un correo");
           }
       }
	}
}

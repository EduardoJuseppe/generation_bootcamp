import javax.swing.JOptionPane;

public class CicloDoWhile {
	public static void main(String[] arg) {
		String clave = "Pedro";
		String comparacion = "";
		do {
			comparacion = JOptionPane.showInputDialog("Introduce la contrasena");
			if(clave.equals(comparacion)==false) {
				System.out.println("La contrasena es incorrecta");
				System.out.println(clave.equals(comparacion));
			}
			else {
				System.out.println("La contrasena es correcta dentro de DoWhile");
				System.out.println(clave.equals(comparacion));
				System.out.println(!clave.equals(comparacion));
			}
				
		}while(!clave.equals(comparacion));
		System.out.println("La contrasena es correcta");
	}
}

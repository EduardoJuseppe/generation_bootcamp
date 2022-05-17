import javax.swing.JOptionPane;

public class CicloWhile {
	public static void main(String[]args) {
	//while
	/*
		int condicion = 0;
		while(condicion<5) {
			condicion++;
			System.out.println("Hola");
		}*/
	//verificar contrasena
		
		String clave = "Pedro";
		String comparacion = "";
		while(!(clave.equals(comparacion))) {
			comparacion = JOptionPane.showInputDialog("Introduce la contrasena");
			if(clave.equals(comparacion)==false)
				System.out.println("La contrasena es incorrecta");
			else
				System.out.println("La contrasena es correcta dentro de while");
		}
		System.out.println("La contrasena es correcta");
	}
}

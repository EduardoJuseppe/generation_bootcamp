
public class Ejercicio1 {
	public static void main (String [] arg) {
		int calificacion = 9;
		
		if(calificacion <= 3 ) {
			System.out.println("Failed");
		}
		else if(calificacion <= 5) {
			System.out.println("Insufficient");
		}
		else if(calificacion <= 9) {
			System.out.println("Insufficient");
		}
		else if(calificacion == 10) {
			System.out.println("Excellent");
		}
		else {
			System.out.println("Grade outside range supported");
		}
	}
}

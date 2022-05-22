package com.perritos;

public class PruebaPerro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Instanciar
		
		Perro perro1 = new Perro("Patitas",3,"Husky","Mediano");
		Perro perro2 = new Perro("Cookies",1,"Dalmata","Grande");
		
		
		perro1.ladrar();
		int edadP = perro1.edadPerruna();
		System.out.println("La edad del perro es: " + edadP);
		perro1.razaPerruna();
		perro1.tamanioPerruna();
		
		// metodo estatico
		perro1.mensaje();
		Perro.mensaje();
		
		System.out.print("\n\n");
		
		perro2.ladrar();
		int edadP2 = perro2.edadPerruna();
		System.out.println("La edad del perro es: " + edadP2);
		perro2.razaPerruna();
		perro2.tamanioPerruna();
			
	}

}

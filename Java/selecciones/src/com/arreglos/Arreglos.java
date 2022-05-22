package com.arreglos;

public class Arreglos {
	public static void main(String[] args) {
		// int contenido = 0
		// String contenido = null
		// Booleanos contenido = false
		
		int [] arrNumeros = new int[5];
		int conteo=0;
		
		for(int x=0;x<arrNumeros.length;x++) {
			arrNumeros[x]=(x+1)*10;
		}
//		for(int x=0;x<arrNumeros.length;x++) {
//			System.out.println("En la posicion "+x+ " el numero es: "+arrNumeros[x]);
//		}
		
		for(int elemento : arrNumeros) {
			conteo++;
			System.out.println("Imprimiendo desde For Each, el "+conteo+" elemento es: "+ elemento );
		}
	}
}

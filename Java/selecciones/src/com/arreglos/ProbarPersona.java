package com.arreglos;

import java.util.Arrays;

public class ProbarPersona {
	public static void main(String[] args) {
		persona persona1 = new persona("Juseppe",28);
		persona persona2 = new persona("Raul",31);
		int tamanio = 3;
		//Object arrPersona[] = new Object[2];
		persona arrPersonas[]=new persona[tamanio];
		
		arrPersonas[0]=persona1;
		arrPersonas[1]=persona2;
		arrPersonas[2]=new persona("Juan",25);
		
		System.out.println(Arrays.toString(arrPersonas));
		
		for(int x=0;x<arrPersonas.length;x++) {
			System.out.println(arrPersonas[x].nombre + " - " + arrPersonas[x].edad);
		}
		
		for(persona elemento : arrPersonas) {
			System.out.println(elemento.nombre + " - " + elemento.edad);
		}
	}
}

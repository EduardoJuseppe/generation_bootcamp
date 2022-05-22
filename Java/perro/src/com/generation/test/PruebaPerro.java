package com.generation.test;

import com.generation.model.Perro;

public class PruebaPerro {
	public static void main(String[]args) {
		Perro pelusa = new Perro("Pelusa","French","chico",4,"Blanco");
		Perro solovino = new Perro("Solovino","French2","chico",4,"Blanco");
		System.out.println(pelusa);
		System.out.println(solovino);
		
		pelusa.setHumano("Pedro");
		solovino.setHumano("Daniel");
		
		System.out.println(Perro.buscarHumano(1));
		System.out.println(Perro.buscarHumano(2));
		
		System.out.println(pelusa);
		System.out.println(solovino);

	}
}

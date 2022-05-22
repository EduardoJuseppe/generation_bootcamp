package com.perritos;

public class Perro {
	// atributos o propiedades
	String nombre;
	int edad;
	String raza;
	String tamanio;
	
	public Perro(String nombre,int edad,String raza,String tamanio) {
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
		this.tamanio = tamanio;
	}
	
	public void ladrar() {
		System.out.println("El perro "+nombre+" hace Guauf!");		
	}
	
	public int edadPerruna() {
		return edad*7;
	}
	
	public void razaPerruna() {
		System.out.println("La raza del perro "+nombre+ " es " + raza);
	}
	
	public void tamanioPerruna() {
		System.out.println("La tamanio del perro "+nombre+ " es " + tamanio);
	}
	
	public static void mensaje() {
		System.out.println("Esta es una clase Static de Perro");
	}
}

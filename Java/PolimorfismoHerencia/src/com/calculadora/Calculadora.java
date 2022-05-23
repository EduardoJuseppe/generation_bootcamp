package com.calculadora;

public class Calculadora {
	//atributos o propiedades
	
	private int a;
	private int b;
	private int c;
	private int resultado;
	
	// constructor
	
	public Calculadora(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public Calculadora(int a, int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public void sumar(int a,int b) {
		this.resultado = this.a + this.b;
		System.out.println("El resultado es: "+this.resultado);
	}
	public void sumar(int a,int b, int c) {
		this.resultado = this.a + this.b + this.c;
//		System.out.println("El resultado es: "+this.resultado);
		System.out.println("El resultado es: "+this.resultado);
	}
	


	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getResultado() {
		return resultado;
	}
	
}

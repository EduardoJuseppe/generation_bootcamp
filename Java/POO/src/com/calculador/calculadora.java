package com.calculador;

public class calculadora {
	public void sumarMensaje() {
		System.out.println("Voy a sumar");
	}
	
	public String mensaje() {
		return "palabra";
	}
	
	public int prueba() {
		return 2;
	}
	
	public double prueba2() {
		return 2.5;
	}
	
	//Operaciones
	
	public int sumar(int a,int b) {
		return a+b;
	}
	
	public int restar(int a,int b) {
		return a-b;
	}
	
	public double divir(double a,double b) {
		if(b==0) {
			return -1;
		}
		return (a/b);
	}
	
	public int multiplicar(int a,int b) {
		return a*b;
	}
}

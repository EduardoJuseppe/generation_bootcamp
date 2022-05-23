package com.calculadora;

public class Main {
	public static void main (String[]args) {
		Calculadora cal = new Calculadora(5,10);
		cal.sumar(1,2);
		Calculadora cal2 = new Calculadora(5,10,4);
		cal2.sumar(1,2,3);
		
	}
}

package com.perimetro;
import java.util.Scanner;

public class CalculadoraGeometrica {
	public static void main(String[]args) {	
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingresar Base: ");
		double base = teclado.nextDouble();
		System.out.print("Ingresar Altura: ");
		double altura = teclado.nextDouble();
		
		System.out.println(base+" "+altura);
		
		
	}
}

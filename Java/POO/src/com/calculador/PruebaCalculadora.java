package com.calculador;

public class PruebaCalculadora {
	public static void main(String[] args) {
		double resultado;
		double num1=20,num2=11;
		int resultado2;
		
		String mensaje;
		
		// Instanciar = Crear un objeto a partir de una clase
		calculadora calc = new calculadora();
		
		// metodo que no retorna nada - void
		calc.sumarMensaje();
		
		// metodo que regresa un valor 'En este ejemplo regresa un String'
		mensaje=calc.mensaje();
		System.out.println(mensaje);
		
		
		resultado = calc.divir(num1,num2);
		if(resultado== -1) {
			System.out.println("No se puede dividir entre cero");
		}else {
			System.out.println(resultado);

		}		
		resultado2 = calc.sumar(20,3);
		System.out.println("La suma es: "+resultado2);
		resultado2 = calc.restar(20,3);
		System.out.println("La resta es: "+resultado2);
		resultado2 = calc.multiplicar(20,3);
		System.out.println("La multiplicacion es: "+resultado2);
	}
}

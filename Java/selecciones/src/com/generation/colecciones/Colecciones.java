package com.generation.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Colecciones {
	public static void main(String[] args) {
		//List - ArrayList
		// picoparentesis
		List<String> miArray = new ArrayList<String>();
		
		miArray.add("Juseppe");
		miArray.add("Yair");
		miArray.add("Raul");
		miArray.add("Maria");
		miArray.add(2,"Magali");
		
		
		 
        // print the size of list
        boolean elemento = miArray.remove("Raul");
        String elemento2 = miArray.remove(0);
        
        int size = miArray.size();
//		System.out.println(miArray);
//		System.out.println("Tamaño de un Array: "+ size);
//		System.out.println(elemento2);
//		System.out.println(elemento);
		
//		imprimir(miArray);
		/* datos compuestos
		 * int ==> Integer
		 * long ==> Long
		 * double ==> Double
		 * boolean ==> Boolean
		 * 
		 */
		int num1 = 10;
		Integer num2 = 10;
		System.out.println("\t Datos Compuestos --- Integer");
		System.out.println(num2);
		System.out.println(num2 instanceof Integer);
		List<Integer> miArray2 = new ArrayList<Integer>();
		
		miArray2.add(3);
		miArray2.add(12314);
		miArray2.add(544234);
		imprimir(miArray2);
		
		System.out.println("\n\t Set --- HashSet");
		Set<String> miSet = new HashSet<String>();
		
		// no acepta elementos duplicados
		// no los guarda en el orden especifico
		// la coleccion que funciona mas rapido
		
		miSet.add("Juseppe");
		miSet.add("Magali");
		miSet.add("Yair");
		miSet.add("Raul");
		miSet.add("Maria");
		miSet.add("Yair");
		miSet.add("Magali");
		miSet.add("Jesus");
		miSet.remove("Raul");
		System.out.println();
		imprimir(miSet);
		
		System.out.println("\n\t Map --- HashMap");
		Map<String,Integer> miMap = new HashMap<String,Integer>();
		
		miMap.put("Valor 1",28);
		miMap.put("Valor 2",23);
		miMap.put("Valor 3",27);
		miMap.put("Valor 4",44);
		miMap.put("Valor 5",12);
		miMap.put("Valor 6",25);
		
		System.out.println(miMap);
		System.out.println(miMap.values()); // todos los valores
		System.out.println(miMap.keySet()); // todas las llaves
		System.out.println(miMap.toString());
		System.out.println(miMap.get("Valor 3"));
		
		int contador=1;
		
		for(String llave : miMap.keySet()) {
			System.out.println("Llave ["+contador+"]"+ " = "  + miMap.get(llave));
			contador++;
		}
		contador =1;
		System.out.println();
		for(Integer llave1 : miMap.values()) {
			System.out.println("Valor ["+contador+"]"+ " = "  + llave1);
			contador++;
		}
	}
	
	
	public static void imprimir(Collection coleccion) {
		int contador=1;
		for(Object elemento : coleccion) {	
			System.out.println("Elemento ["+contador+"]"+ " = "  + elemento);
			contador++;
		}
	}
}

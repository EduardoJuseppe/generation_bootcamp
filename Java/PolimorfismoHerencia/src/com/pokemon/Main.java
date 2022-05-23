package com.pokemon;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Pokemon chikorita = new Pokemon(152,1,20,"Chikorita",false);
//		
//		chikorita.atacar();
//		chikorita.dormir();
//		chikorita.comer();
		
		TipoPlanta chikorita2 = new TipoPlanta(152,1,20,"Chikorita",false,5);
		
		chikorita2.comer();
		chikorita2.dormir();
		chikorita2.comer();
		chikorita2.paralizar();
		chikorita2.envenenar();
	}

}

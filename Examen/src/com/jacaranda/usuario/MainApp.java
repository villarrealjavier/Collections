package com.jacaranda.usuario;

public class MainApp {
	public static void main(String[] args) {
		Usuario us1 = new Usuario("Julian", "AK24");
		Usuario us2 = new Usuario("Julian", "AK24");
		System.out.println(us1.equals(us2));
		//System.out.println(us1.setPass("Julian", "AK24"));
		//MemoryStorage plantilla = new MemoryStorage[];
		System.out.println(us2.checkPass("AK245"));
	
	}
}

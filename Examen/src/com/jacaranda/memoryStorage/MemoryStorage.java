package com.jacaranda.memoryStorage;
import java.util.Scanner;

import com.jacaranda.usuario.Usuario;
import com.jaracanda.publicacion.Post;
import com.jaracanda.publicacion.Publicacion;
import com.jaracanda.publicacion.Recomendacion;
import com.jaracanda.publicacion.Tweet;

public class MemoryStorage {
	/**
	 * Esta es la clase memoryStorage en la cual guardamos las constantes con el numero maximo tanto de publicaciones
	 * como de usuarios que tendremos, y en el tendremos métodos para añadir elementos a arrays.
	 * En ella tenemos metodos para añadir todo tipo de elementos que hemos definido a una lista
	 */
	public static final Integer NUMERO_MAXIMO_USUARIOS=15;
	public static final Integer NUMERO_MAXIMO_PUBLICACIONES=50;
	private Usuario[] listaUsuarios = new Usuario[NUMERO_MAXIMO_USUARIOS];
	private Publicacion[] listaPublicaciones = new Publicacion[NUMERO_MAXIMO_PUBLICACIONES];

	
	//constructor
	public MemoryStorage() {
		// TODO Auto-generated constructor stub
	}
	
	//METHODS
	public Integer posicionUsuario() {
		
		return 0;
	}
	
	public void addUsuario(String login,String pass) {
		int contador=0;
		if (contador<listaUsuarios.length) {
			listaUsuarios[contador++]=new Usuario(login, pass);
		}
	}
	
	public void addPublicacion(String texto,String login) {
		int contador=0;
		Scanner sc=new Scanner(System.in);

		if (contador<listaPublicaciones.length) {
			System.out.println("Introduce el tipo de publicacion");
			String tipo=sc.nextLine();
			if (tipo!=null && tipo.equalsIgnoreCase("tweet")) {
				listaPublicaciones[contador++]= new Tweet(texto, login);
				
			}else if (tipo!=null && tipo.equalsIgnoreCase("post")) {
				listaPublicaciones[contador++]= new Post(texto,login);
			}else if (tipo!=null && tipo.equalsIgnoreCase("recomendacion")) {
				listaPublicaciones[contador++]= new Recomendacion(texto,login);
			}


			
				
				
		
	}
	}
	
	public void addPublicacion(String texto,String login,String pass) {
		int contador=0;
		Scanner sc=new Scanner(System.in);

		if (contador<listaPublicaciones.length) {
			System.out.println("Introduce el tipo de publicacion");
			String tipo=sc.nextLine();
			if (tipo!=null && tipo.equalsIgnoreCase("tweet")) {
				listaPublicaciones[contador++]= new Tweet(texto,login,pass);
				
			}else if (tipo!=null && tipo.equalsIgnoreCase("post")) {
				listaPublicaciones[contador++]= new Post(texto,login,pass);
			}else if (tipo!=null && tipo.equalsIgnoreCase("recomendacion")) {
				listaPublicaciones[contador++]= new Recomendacion(texto,login,pass);
			}
	}
	
	}
	
	public void addPublicacion(String texto,String login,Integer codigo) {
		int contador=0;
		Scanner sc=new Scanner(System.in);

		if (contador<listaPublicaciones.length) {
			System.out.println("Introduce el tipo de publicacion");
			String tipo=sc.nextLine();
			if (tipo!=null && tipo.equalsIgnoreCase("tweet")) {
				listaPublicaciones[contador++]= new Tweet(texto, login,codigo);
				
			}else if (tipo!=null && tipo.equalsIgnoreCase("post")) {
				listaPublicaciones[contador++]= new Post(texto,login,codigo);
			}else if (tipo!=null && tipo.equalsIgnoreCase("recomendacion")) {
				listaPublicaciones[contador++]= new Recomendacion(texto,login,codigo);
			}
	}
	}
	
	public String mostrarListaPublicaciones() {
		for (int i=0;i<listaPublicaciones.length;i++) {
			System.out.println(listaPublicaciones[i]);
		}
		return "";
	}
	public String mostrarTweets() {
		
		return "";
	}
	
	public String mostrarPosts() {
		return "";
	}
	public String mostrarRecomendacion() {
		return "";
	}
	
	

}

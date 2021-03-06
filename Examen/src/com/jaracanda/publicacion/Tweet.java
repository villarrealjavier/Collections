package com.jaracanda.publicacion;

import com.jacaranda.usuario.Usuario;

public class Tweet extends Publicacion implements Valorable{

	/**
	 * Esta es la clase tweet la cual recibe un método asbtracto del padre, y en el constructor coge sus atributos
	 * @param texto
	 * @param us1
	 */
	public Tweet(String texto, Usuario login) {
		super(texto);
		setTexto(texto);
		
	}
	public Tweet(String texto, String login) {
		super();
	}
	public Tweet(String texto, String login, String pass) {
		super();
	}
	public Tweet(String texto, String login, Integer codigo) {
		
	}
	//SETTER DEL PADRE
	@Override
	public void setTexto(String texto) {
		if (texto!=null && texto.length()<50) {
			setTexto(texto);
		}
		else {
			throw new PublicacionException("Se ha producido una Excepcion");
		}
		
	}
	//METHODS
	@Override
	public boolean valorar(String texto) {
		// TODO Auto-generated method stub
		return false;
	}
	
	//TOO STRING

	@Override
	public String toString() {
		return "Tweet. \n "
				+ "Publicacion: " + getTexto() + "\n"
				+ "Realizada por: "  + "\n"
				+ "Valoracion: " + getValoracion()  + "\n"
				+ "Fecha de publicacion: " + getFechaCreacion() + "\n";
	}

}

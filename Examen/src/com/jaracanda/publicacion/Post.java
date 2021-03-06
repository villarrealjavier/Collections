package com.jaracanda.publicacion;

import java.time.LocalDateTime;

import com.jacaranda.usuario.Usuario;

public class Post extends Publicacion implements Valorable{
	/**
	 * Esta es la clase Post la cual implementa la interfaz de Valorable y su metodo valorar
	 */
	private String tema;
	private Integer numLecturas;
	

	public Post(String texto, Usuario us1, String tema) {
		super();
		setTexto(texto);
		this.tema=tema;
		
	}
	
	public Post(String texto, String login) {
		super();
	}
	public Post(String texto, String login, String pass) {
		super();
	}

	public Post(String texto, String login, Integer codigo) {
		super();
	}

	//GETTER
	public Integer getNumLecturas() {
		return numLecturas;
	}

	public String getTema() {
		return tema;
	}
	
	//SETTER HEREDADO DEL PADRE, YA QUE ES ABSTRACTO
	@Override
	public void setTexto(String texto) {
		if (texto!=null && (!texto.isEmpty())) {
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
	//TO STRING:
	@Override
	public String toString() {
		return "Post. \n "
				+ "Publicacion: " + getTexto() + "\n"
				+ "Realizada por: "  + "\n"
				+ "Valoracion: " + getValoracion()  + "\n"
				+ "Fecha de publicacion: " + getFechaCreacion() + "\n";
	}

}

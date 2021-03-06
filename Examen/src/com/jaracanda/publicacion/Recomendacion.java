package com.jaracanda.publicacion;

import com.jacaranda.usuario.Usuario;

public class Recomendacion extends Publicacion {
	private Integer numeroEstrellas;

	public Recomendacion(String texto,Usuario us1,Integer numeroEstrellas) {
		super(texto,us1);
		setTexto(texto);
		setNumeroEstrellas(numeroEstrellas);
		
	}
	//METHODS
	
	public Recomendacion(String texto, String login) {
		super();
	}

	public Recomendacion(String texto, String login, String pass) {
		super();
	}

	public Recomendacion(String texto, String login, Integer codigo) {
		super();
	}

	//GETTER
	public Integer getNumeroEstrellas() {
		return numeroEstrellas;
	}
	
	
	//SETTER HERDEDADO DEL PADRE
	@Override
	public void setTexto(String texto) {
		if (texto!=null && texto.length()>=100 && texto.length()<=200) {
			setTexto(texto);
		}
		else {
			throw new PublicacionException("Se ha producido una Excepcion");
		}
		
	}
	public void setNumeroEstrellas(Integer numeroEstrellas) {
		if (numeroEstrellas!=null && numeroEstrellas<=5 && numeroEstrellas>=1) {
			this.numeroEstrellas = numeroEstrellas;
		}
		
	}

	//TO STRING
	@Override
	public String toString() {
		return "Recomendacion. \n " 
				+"Publicacion: "+  getTexto() + "\n"
				+ "Realizada por: "  + "\n"
				+ "Valoracion: " + getValoracion()  + "\n"
				+ "Fecha de publicacion: " + getFechaCreacion() + "\n"
				+ "Numero de estrellas:" + getNumeroEstrellas();
	}
	

}

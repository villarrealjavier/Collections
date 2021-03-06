package com.jaracanda.publicacion;

import java.time.LocalDateTime;
import java.util.Objects;

import com.jacaranda.usuario.Usuario;

public abstract class Publicacion implements Comparable<Publicacion>,Valorable{
	

	/**
	 * Esta es la clase de publicación la cual es abstracta y de la que heredarán algunos metodos las hijas.
	 * En esta clase se implementa todo tipo de metodos, como toString, HashCode,Equals, etc
	 */

	private String texto;
	private LocalDateTime fechaCreacion;
	private Integer valoracion;
	private Integer codigo;
	private static Integer codigoSiguiente;
	private Usuario us1;
	
	//CONSTRUCTOR
	public Publicacion(String texto, Usuario login) {
		this.texto=texto;
		this.us1=login;
		
		this.fechaCreacion=LocalDateTime.now();
		
		codigo++;
	}
	public Publicacion(String texto2, Usuario login, Integer valoracion) {
		super();
		this.texto=texto;
		this.valoracion=valoracion;
		codigo++;
		
		this.fechaCreacion=LocalDateTime.now();
		codigo++;
	}
	public Publicacion(String texto) {
		this.texto=texto;
		codigo++;
	}
	
	public Publicacion() {
		// TODO Auto-generated constructor stub
	}
	//METHODS
	@Override
	public boolean valorar(String texto) {
		// TODO Auto-generated method stub
		return false;
	}
	

	//GETTERS AND SETTERS
	public static Integer getCodigoSiguiente() {
		return codigoSiguiente;
	}

	public static void setCodigoSiguiente(Integer codigoSiguiente) {
		Publicacion.codigoSiguiente = codigoSiguiente;
	}

	public String getTexto() {
		return texto;
	}

	public abstract void setTexto(String texto);

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public Integer getValoracion() {
		return valoracion;
	}

	public Integer getCodigo() {
		return codigo;
	}
	//HASHCODE:
	@Override
	public int hashCode() {
		return Objects.hash(codigo, fechaCreacion, texto, valoracion);
	}
	//METODO EQUALS
	@Override
	public boolean equals(Object obj) {
		boolean sonIguales=false;
		Publicacion other = (Publicacion) obj;
		if (this.fechaCreacion.isEqual(other.getFechaCreacion())
				&& this.codigo==other.getCodigo() && this.texto.equals(other.getTexto())) {
			sonIguales=true;
		}

		return sonIguales;
	}
		
	

	//TO STRING:
	@Override
	public String toString() {
		return "Publicacion: " + getTexto() + "\n"
				+ "Realizada por: "  + "\n"
				+ "Valoracion: " + getValoracion()  + "\n"
				+ "Fecha de publicacion: " + getFechaCreacion() + "\n";
	}

	//COMPARE TO:
	@Override
	public int compareTo(Publicacion otro) {
		int resultado=0;
		if (otro!=null) {
			if(this.fechaCreacion.isBefore(otro.getFechaCreacion())) {
				resultado=1;
			}else if (this.fechaCreacion.isAfter(otro.getFechaCreacion())) {
				resultado= -1;
			}
		}
		return resultado;
	}

}

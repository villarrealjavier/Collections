package com.jacaranda.usuario;
import java.util.Objects;
import java.util.Scanner;



public class Usuario {
	/**
	 * Esta es la clase usuario en ella tenemos el login y pass, y métodos para cambiar tanto la contraseña
	 * como para comprobarla.
	 */
	private String login;
	private String pass;
	
	
	//CONSTRUCTOR
	public Usuario() {
		
	}
	public Usuario(String login,String pass) {
		this.login=login;
		this.pass=pass;
	}
	public Usuario(String login) {
		this.login=login;
		
	}
	
	//METHODS 
	public boolean checkPass(String pass) {
		boolean resultado=false;
		if (pass!=null && pass.equals(getPass())) {
			resultado=true;
		}
		
		return resultado;
	}
	
	public boolean setPass(String login,String pass) {
		boolean resultado=false;
		Scanner sc=new Scanner(System.in);
		if (pass!=null && pass.equals(getPass())) {
			System.out.println("Introduce nueva contraseña");
			String newpass=sc.nextLine();
			this.pass=newpass;
			resultado=true;
		}
		return resultado;
	}
	
	
	
	//GETTERS
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPass() {
		return pass;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(login);
	}

	

	@Override
	public boolean equals(Object obj) {
		boolean sonIguales=false;
		Usuario other = (Usuario) obj;
		if (this.login.equalsIgnoreCase(other.login)) {
			sonIguales=true;
		}

		return sonIguales;
	}
	//TO STRING:
	@Override
	public String toString() {
		return "Usuario [login=" + login + ", pass=" + pass + "]";
	}
	
	

}

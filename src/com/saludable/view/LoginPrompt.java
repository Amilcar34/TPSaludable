package com.saludable.view;

import java.sql.SQLException;
import java.util.Scanner;

import com.saludable.controlador;

public class LoginPrompt {
	
	private Login l;
	private String respuestaRegistro;
	private Scanner input; 

	
	public LoginPrompt() throws ClassNotFoundException, SQLException{
		this.l = new Login();
		this.input = new Scanner(System.in);
		
	}

	public void initialize() throws ClassNotFoundException, SQLException {
		System.out.println("Bienvenido a Saludable");
		System.out.println("¿Está registrado? Responda S o N");
		respuestaRegistro = input.next();
		estaRegistrado();
	}
	
	public void estaRegistrado() throws ClassNotFoundException, SQLException {
		if (respuestaRegistro.equalsIgnoreCase("S")) {
			login();
		} else if (respuestaRegistro.equalsIgnoreCase("N")) {
			register();
		} else {
			System.out.println("Responda S o N");
			respuestaRegistro = input.next();
			estaRegistrado();
		}
	}
	
	public void login() {
		String username;
		String password;
		
		do {
			System.out.println("Ingrese su usuario:");
			username = input.next();
			System.out.println("Ingrese su contraseña:");
			password = input.next();
			l.login(username, password);
		} while (l.getResultadoLogin() != true);
		input.close();
	}
	
	public void register() throws ClassNotFoundException, SQLException {
		String username;
		String password;
		System.out.println("Registrándose en Saludable");
		
		
		do {
			System.out.println("Ingrese su usuario:");
			username = input.next();
			System.out.println("Ingrese su contraseña:");
			password = input.next();
			l.register(username, password);
		} while (l.isUsuarioExistente() != true);
		if (l.getResultadoRegistro() == true)
			login();
		input.close();
	}
	
}
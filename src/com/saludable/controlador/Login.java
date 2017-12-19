package com.saludable.controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
import com.saludable.dao.IConnection;

public class Login {
	private Connection sqlCon;
	private boolean resultadoRegistro;
	private boolean resultadoLogin;
	private boolean usuarioExistente;
	
	public Login() throws ClassNotFoundException, SQLException {
		this.sqlCon = new IConnection() {}.getConnection();
	}
	

	// asume que la tabla tiene 2 columnas, en este orden: username (unique), password
	public boolean login(String username, String password) {
		this.resultadoLogin = false;
		this.usuarioExistente = false;
		try {
			String query = "select * from users where username = ?";
			
			PreparedStatement stmt = (PreparedStatement) sqlCon.prepareStatement(query);
			stmt.setString(1, username);
		

			ResultSet rs = stmt.executeQuery();
			
			//chequea si encontró resultados
			if (rs.isBeforeFirst() == false) {
				System.out.println("No se encontró el usuario ingresado");
				this.resultadoLogin = false;
			} else {
				rs.next();
				//compara el password ingresado con aquel en la db
				if (rs.getString(2).equals(password)) {
					System.out.println("Bienvenido " + username);
					this.resultadoLogin = true;		
					} else {
						System.out.println("Contraseña inválida");
						this.resultadoLogin = false;
					}
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.resultadoLogin;
	}

	public boolean register(String username, String password) {
		try {
			String query = "select * from users where username = ?";
			PreparedStatement stmtQ = (PreparedStatement) sqlCon.prepareStatement(query);
			stmtQ.setString(1, username);
			ResultSet rsQ = stmtQ.executeQuery();
			
			//chequea si encontró resultados. Si el usuario no existe, lo registra.
			if (rsQ.isBeforeFirst() == false) {
				String insert = "insert into users (username, password) values (?, ?)";
				PreparedStatement stmtI = (PreparedStatement) sqlCon.prepareStatement(insert);
				stmtI.setString(1, username);
				stmtI.setString(2, password);
				boolean resultadoInsert = stmtI.execute();
				if (resultadoInsert == true) {
					System.out.println("Usuario registrado");
					resultadoRegistro = true;
				} else {
					System.out.println("Error al registrar el nuevo usuario.");
					resultadoRegistro = false;
				}
			} else {
				System.out.println("El usuario ya existe. Logueando al sistema");
				resultadoRegistro = true;
				usuarioExistente = true;
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return resultadoRegistro;
	}


	public boolean isUsuarioExistente() {
		return usuarioExistente;
	}


	public boolean getResultadoRegistro() {
		return resultadoRegistro;
	}


	public boolean getResultadoLogin() {
		return resultadoLogin;
	}
	
}
package com.saludable.controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.saludable.dao.IConnection;

public class FormularioControlador {

	public static void ingresoDeficha(String nombre, String apellido, int sexo, String fechaDeN, String usuario,
			String contraseña, int tratamiento, int comida, String comidaPrincipal, String comidaSecundaria,
			String bebida, int postre, int tentacion, String alimento, int hambre, String fechaHora) {

		String sex = null;
		if(sexo == 1)
			sex = "Masculino";
		else
			sex = "Femenino";
		
		String tratamient = null;
		if(tratamiento == 1)
			tratamient = "Anorexia";
		else if(tratamiento == 2)
			tratamient = "Bulimia";
		else 
			tratamient = "Obesidad";
		
		String comid= null;
		if(comida == 1)
			comid = "Desayuno";
		else if(comida == 2)
			comid = "Almuerzo";
		else if (comida == 3)
			comid = "Merienda";
		else if (comida == 4)
			comid = "Cena";
		
		String postr = null;
		if(postre == 1)
			postr = "SI";
		else
			postr="NO";
			
		String tentacio = null;
		if(tentacion == 1)
			tentacio = "SI";
		else
			tentacio="NO";
		
		String hambr = null;
		if(hambre == 1)
			hambr = "SI";
		else
			hambr="NO";
		
		Connection con = new IConnection() {}.getConnection();

		try {
			
			if (con != null) {
				String sql = "INSERT INTO controlesdiarios(id, nombre, apellido, sexo, fecha_de_nacimiento, usuario, contraseña, tratamiento, comida, comida_principal, comida_secundaria, .bebida, postre, tentacion_de_otro_alimento, alimento_deseado, satisfaccion, fecha_y_hora_de_registro) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, nombre);
				ps.setString(2, apellido);
				ps.setString(3, sex);
				ps.setString(4, fechaDeN);
				ps.setString(5, usuario);
				ps.setString(6, contraseña);
				ps.setString(7, tratamient);
				ps.setString(8, comid);
				ps.setString(9, comidaPrincipal);
				ps.setString(10, comidaSecundaria);
				ps.setString(11, bebida);
				ps.setString(12, postr);
				ps.setString(13, tentacio);
				ps.setString(14, alimento);
				ps.setString(15, hambr);
				ps.setString(16, fechaHora);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

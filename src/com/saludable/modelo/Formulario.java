package com.saludable.modelo;


public class Formulario {
	
	String nombre;
	String apellido;
	String sexo;
	String fechaDeN;
	String usuario;
	String contraseña;
	String tratamiento;
	String comida;
	String comidaPrincipal; 
	String comidaSecundaria;
	String bebida;
	String postre; 
	String tentacion;
	String alimento;
	boolean hambre;
	String fechaHora;

	public Formulario(String nombre, String apellido, String sexo, String fechaDeN, String usuario, String contraseña,
			String tratamiento, String comida, String comidaPrincipal, String comidaSecundaria, String bebida,
			String postre, String tentacion, String alimento, boolean hambre, String fechaHora) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.fechaDeN = fechaDeN;
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.tratamiento = tratamiento;
		this.comida = comida;
		this.comidaPrincipal = comidaPrincipal;
		this.comidaSecundaria = comidaSecundaria;
		this.bebida = bebida;
		this.postre = postre;
		this.tentacion = tentacion;
		this.alimento = alimento;
		this.hambre = hambre;
		this.fechaHora = fechaHora;
	}

	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getSexo() {
		return sexo;
	}

	public String getFechaDeN() {
		return fechaDeN;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public String getComida() {
		return comida;
	}

	public String getComidaPrincipal() {
		return comidaPrincipal;
	}

	public String getComidaSecundaria() {
		return comidaSecundaria;
	}

	public String getBebida() {
		return bebida;
	}

	public String getPostre() {
		return postre;
	}

	public String getTentacion() {
		return tentacion;
	}

	public String getAlimento() {
		return alimento;
	}

	public boolean isHambre() {
		return hambre;
	}

	public String getFechaHora() {
		return fechaHora;
	}
	

	

}

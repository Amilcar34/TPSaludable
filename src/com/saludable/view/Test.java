package com.saludable.view;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

import com.saludable.controlador.FormularioControlador;

public class Test {

	public static void main(String[] args) {

//		Scanner in = new Scanner(System.in);
//		System.out.println("Ingrese nombre");
//		String nombre = in.nextLine();
//		
//		System.out.println("Ingrese apellido");
//		String apellido = in.nextLine();
//		
//		System.out.println("Ingrese DNI");
//		int dni = in.nextInt();
//
//		System.out.println("Ingrese ingrese numerimacoemte el sexo");
//		System.out.println("1 - Masculino");
//		System.out.println("2 - Femenino");
//		int sexo = in.nextInt();
//
//		System.out.println("Ingrese su fecha de nacimiento DD/MM/AAAA");
//		String fechaDeN = in.nextLine();
//		
//		System.out.println("Ingrese su usuario");
//		String usuario = in.nextLine();
//		
//		System.out.println("Ingrese su contraseña");
//		String contraseña = in.nextLine();
//		
//		System.out.println("Tipo de tratamiento, ingrese el numero correspondiente");
//		System.out.println("1 - Anorexia");
//		System.out.println("2 - Bulimia");
//		System.out.println("3 - Obesidad");
//		int tratamiento = in.nextInt();
//		
//		System.out.println("Tipo de comida diaria, ingrese el numero correspondiente");
//		System.out.println("1 - Desayuno");
//		System.out.println("2 - Almuerzo");
//		System.out.println("3 - Merienda");
//		System.out.println("4 - Cena");
//		int comida = in.nextInt();
//		
//		System.out.println("Describa la comida principal");
//		String comidaPrincipal = in.nextLine();
//		
//		System.out.println("Describa la comida secundaria");
//		String comidaSecundaria = in.nextLine();
//		
//		System.out.println("Describa la bebida");
//		String bebida = in.nextLine();
//		
//		int postre = 0;
//		if(comida == 4 || comida == 2){
//			System.out.println("Ingerio postre");
//			System.out.println("1 - Si");
//			System.out.println("2 - No");
//			postre = in.nextInt();
//		}
//		
//		System.out.println("¿Tenia tentación de ingerir otro alimento?");
//		System.out.println("1 - Si");
//		System.out.println("2 - No");
//		int tentacion = in.nextInt();
//		
//		String alimento = null;
//		if (tentacion == 1){
//			System.out.println("¿Que desea comer?");
//			alimento = in.nextLine();
//		}
//		
//		System.out.println("¿Se quedo con hambre?");
//		System.out.println("1 - Si");
//		System.out.println("2 - No");
//		int hambre = in.nextInt();
		
		//Cuando termine de llenar el forumario se almacena la fecha y la hora en este objeto
		String  fechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		FormularioControlador.ingresoDeficha("javier", "alberino", 1, "12/08/1991", "javiercasla", "6541", 1, 1, "arroz con pollo", "ninguna", "manaso de manzana", 1, 1, "giso", 1, fechaHora);
		//FormularioControlador.ingresoDeficha(nombre, apellido, sexo, fechaDeN, usuario, contraseña, tratamiento, comida, comidaPrincipal, comidaSecundaria, bebida, postre, tentacion, alimento, hambre, fechaHora);
	
	}

}

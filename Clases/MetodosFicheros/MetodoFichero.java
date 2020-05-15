package ProPlay.Clases.MetodosFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import ProPlay.Clases.PagPrincipal.Ventana_pagina_principal;

public class MetodoFichero {
	
	private static Ventana_pagina_principal principal;

	public static void recordar() {
		
		try {
			
			FileReader leerUser = new FileReader("src/ProPlay/Ficheros/Recordar_login_user.txt");
			BufferedReader br = new BufferedReader(leerUser);

			FileReader leerPasswd = new FileReader("src/ProPlay/Ficheros/Recordar_login_passwd.txt");
				
				int c=0;
				String texto = "";
				String text = "";
				
				while((texto=br.readLine())!=null){
			            text = texto;
			    }
							
				principal = new Ventana_pagina_principal();
				
							
				principal.lblUser.setText(text);
				principal.setVisible(true);	
				
		} catch (IOException e) {
			System.out.println("No se ha encontrado el archivo");
			e.printStackTrace();
		}
	
	}
	
	public static void escribRecordar(String user, String passwd) {
		
		
		FileWriter escribirUser;
		FileWriter escribirPasswd;
		
		BufferedWriter buferUser;
		BufferedWriter buferPasswd;
		
		PrintWriter printUser;
		PrintWriter printPasswd;
		
		try {
			
			escribirUser = new FileWriter("src/ProPlay/Ficheros/Recordar_login_user.txt");
			escribirPasswd = new FileWriter("src/ProPlay/Ficheros/Recordar_login_passwd.txt");
			
			buferUser = new BufferedWriter(escribirUser);
			printUser = new PrintWriter(escribirUser);
			escribirUser.write(" "+user);
			
			escribirUser.close();
			buferUser.close();
			
			buferPasswd = new BufferedWriter(escribirPasswd);
			printPasswd = new PrintWriter(escribirPasswd);
			escribirPasswd.write(" "+passwd);
			
			escribirPasswd.close();
			buferPasswd.close();
			
			
						
		} catch (IOException e1) {
			System.out.println("No se ha podido escribir en el archivo.");
			e1.printStackTrace();
		}
	}
	
	public static void vaciarRecordar() {
		
		
		FileWriter escribirUser;
		FileWriter escribirPasswd;
		
		BufferedWriter buferUser;
		BufferedWriter buferPasswd;
		
		PrintWriter printUser;
		PrintWriter printPasswd;
		
		try {
			
			escribirUser = new FileWriter("src/ProPlay/Ficheros/Recordar_login_user.txt");
			escribirPasswd = new FileWriter("src/ProPlay/Ficheros/Recordar_login_passwd.txt");
			
			buferUser = new BufferedWriter(escribirUser);
			printUser = new PrintWriter(escribirUser);
			escribirUser.write("");
			
			escribirUser.close();
			buferUser.close();
			
			buferPasswd = new BufferedWriter(escribirPasswd);
			printPasswd = new PrintWriter(escribirPasswd);
			escribirPasswd.write("");
			
			escribirPasswd.close();
			buferPasswd.close();
			
			
						
		} catch (IOException e1) {
			System.out.println("No se ha podido escribir en el archivo.");
			e1.printStackTrace();
		}
	}
	
	

}

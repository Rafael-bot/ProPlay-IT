package ProPlay.Clases;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import ProPlay.Clases.LoginRegister.Login;
import ProPlay.Clases.MetodosFicheros.MetodoFichero;
import ProPlay.Clases.PagPrincipal.Ventana_pagina_principal;
import ProPlay.Clases.Sql.Metodos_SQL;

public class ProPlayit {
	
	private static Login log = new Login();
	private static MetodoFichero mf;
	
	public static void inicio() {
		
		try {
			
			FileReader leerUser = new FileReader("src/ProPlay/Ficheros/Recordar_login_user.txt");
			FileReader leerPasswd = new FileReader("src/ProPlay/Ficheros/Recordar_login_passwd.txt");

			int comprobUser = leerUser.read();
			int comprobPasswd = leerPasswd.read();
			
			if (comprobUser > 0 || comprobPasswd > 0) {
								
				mf.recordar();
					
			} else {
				
				log.setVisible(true);
			
			}
						
		} catch (IOException e) {
			System.out.println("No se ha encontrado el archivo");
			e.printStackTrace();
		}
		
	}
	
}

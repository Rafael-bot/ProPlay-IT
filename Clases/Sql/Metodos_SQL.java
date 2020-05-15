package ProPlay.Clases.Sql;



import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.mysql.jdbc.PreparedStatement;

import ProPlay.Clases.Sql.Conexion;

public class Metodos_SQL {
	
	//private static Conexion cx = new Conexion();
	
	private static PreparedStatement sentencia_preparada;
	private static ResultSet resultado;
	private static String sql;
	private static int resultado_numero = 0;
	private static ResultSet resultlogin;

	
	
	public static void comprob_register(String user, String gmail, String passwd) {
		
		Connection conexion = null;
		
		try {
			
			conexion =  Conexion.conex();
			
			sentencia_preparada = (PreparedStatement) conexion.prepareStatement("SELECT User FROM usuarios WHERE Email = '"+gmail+"' OR User = '"+user+"';");
			resultlogin = sentencia_preparada.executeQuery();
			if (resultlogin.next()) {
				JOptionPane.showMessageDialog(new JFrame(), "ERROR, El usuario o el gmail ya esta registrado","ERROR - Register", JOptionPane.WARNING_MESSAGE);
			} else {
				register(user, gmail, passwd);		
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	public static int register(String user, String gmail, String passwd) {
		
		int result = 0;
		Connection conexion = null;
				
		try {
				
				conexion = Conexion.conex();
				

				int id = (int) (Math.random()*9999+1);
				double cred = 10.00;
				boolean control = false;
				
				while(control == false) {
					sentencia_preparada = (PreparedStatement) conexion.prepareStatement("SELECT Id FROM usuarios WHERE Id = '"+id+"';");
					resultlogin = sentencia_preparada.executeQuery();
					if (resultlogin.next()) {
						id = (int) (Math.random()*9999+1);
						control = true;
					} else {
						control = true;
					}
				}
				
				sentencia_preparada = (PreparedStatement) conexion.prepareStatement("INSERT INTO usuarios(`Id`, `User`, `Passwd`, `Credito`, `Email`) VALUES ('"+id+"','"+user+"','"+passwd+"','"+cred+"','"+gmail+"');");
				result = sentencia_preparada.executeUpdate();
				sentencia_preparada.close();
				JOptionPane.showMessageDialog(null, "Usuario registrado correctamente");
				
		
			
		} catch (Exception e) {
			
			System.out.println("Error, No se ha  podido registrar el usuario.");
			JOptionPane.showMessageDialog(new JFrame(), "ERROR, No se a podido registrar el usuario", "ERROR - Register", JOptionPane.WARNING_MESSAGE);
			System.out.println(e);
						
		}
		
		
		return result;
		
	}
	
	
	
	
	public static String login(String user) {
		
		String busqueda_nombre = null;
		Connection conexion = null;
		ResultSet resultloginuser;
		
		try {
			
			conexion = Conexion.conex();
		
			sentencia_preparada = (PreparedStatement) conexion.prepareStatement("SELECT User FROM usuarios WHERE Email = '"+user+"' OR User = '"+user+"';");
			resultloginuser = sentencia_preparada.executeQuery();
			if (resultloginuser.next()) {
				busqueda_nombre =  resultloginuser.getString("User");
			}
			
			conexion.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return busqueda_nombre;
		
	}
	
	public static String comprobUser(String user, String passwd) {
		
		String busqueda_login = null;
		Connection conexion = null;
		
		try {
			
			conexion = Conexion.conex();
			sentencia_preparada = (PreparedStatement) conexion.prepareStatement("SELECT User,Passwd FROM usuarios WHERE User = '"+user+"' AND Passwd = '"+passwd+"';");
			resultlogin = sentencia_preparada.executeQuery();
			if (resultlogin.next()) {
				busqueda_login = "Usuario encontrado";
			} else {
				busqueda_login = "Usuario no encontrado";
			}
			
			conexion.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return busqueda_login;
		
	}
	
	public static String comprobGmail(String gmail) {
		
		String busqueda_gmail = null;
		Connection conexion = null;
		
		try {
			
			conexion = Conexion.conex();
			sentencia_preparada = (PreparedStatement) conexion.prepareStatement("SELECT Email FROM usuarios WHERE Email = '"+gmail+"';");
			resultlogin = sentencia_preparada.executeQuery();
			if (resultlogin.next()) {
				busqueda_gmail = "Gmail encontrado";
			} else {
				busqueda_gmail = "Gmail no encontrado";
			}
			
			conexion.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return busqueda_gmail;
		
	}
	
	public static String nomeacuerdoq(String gmail) {
		
		String busqueda_recup = null;
		
		String u = null;
		String p = null;
		String e = null;
		
		Connection conexion = null;
		ResultSet resultRecup;
		
		try {
			
			conexion = Conexion.conex();
		
			sentencia_preparada = (PreparedStatement) conexion.prepareStatement("SELECT User,Passwd,Email FROM usuarios WHERE Email = '"+gmail+"';");
			resultRecup = sentencia_preparada.executeQuery();
			if (resultRecup.next()) {
				u = resultRecup.getString("User");
				p = resultRecup.getString("Passwd");
				e = resultRecup.getString("Email");
			} else {
				System.out.println("No existe este gmail.");
			}
			
			
			busqueda_recup = "User: "+u+"\nPassword: "+p+"\nGmail: "+e;
			
			conexion.close();
			
		} catch (Exception e1) {
			System.out.println(e1);
		}
		
		return busqueda_recup;
		
	}
	
}

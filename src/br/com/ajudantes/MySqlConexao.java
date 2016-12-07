package br.com.ajudantes;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConexao {

	public static Connection ConectarDb(){
		
		String jdbc = "jdbc:mysql://";		
		String ip = "localhost";
		String db = "data";
		String usuario = "root";
		String senha = "1234";

		Connection c = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");	
			
			c = DriverManager.getConnection(jdbc + ip + "/" + db + "?useSSL=false", usuario, senha);
			
		} catch (Exception e) {	
			System.out.println("NAO CONECTOU");
			
		}
		return c;	
	}
}

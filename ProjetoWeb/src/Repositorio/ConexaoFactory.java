package Repositorio;

import java.sql.*;

public class ConexaoFactory {
	
	public Connection getConnection()  {
		
		try {
			DriverManager.registerDriver(new com.jdbc.mysql.Driver());
			Class.forName("com.mysql.jdbc.Driver");
			Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetoweb?useTimezone=true&serverTimezone=UTC", "root", "");
			return conexao;
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
		
	}
}

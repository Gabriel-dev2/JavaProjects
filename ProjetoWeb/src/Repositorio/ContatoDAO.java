package Repositorio;

import java.sql.*;
import java.util.*;

import Negocio.Contato;

public class ContatoDAO {

	private Connection con = null;
	
	public ContatoDAO()  {
		this.con = new ConexaoFactory().getConnection();
	}
	
	public void adicionaContato(Contato contato) {
		
		String sql = "INSERT INTO cliente(nome,email,idade) Values(?,?,?)";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setInt(3, contato.getIdade());
			
			stmt.execute();
			stmt.close();
			
			System.out.println("Gravado!");
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Contato> getLista(){
		
		List<Contato> contatos = new ArrayList<Contato>();
		
		String sql = "SELECT * FROM cliente";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Contato contato = new Contato();
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setIdade(rs.getInt("idade"));
				
				contatos.add(contato);
			}
			
			rs.close();
			stmt.close();
			return contatos;
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
		
		
	}
}

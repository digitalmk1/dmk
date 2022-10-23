package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Connection.SingleConnectionBanco;
import Modelo.ModeloLogin;

public class DAOUsuarioRepository {
	
	private Connection connection;
	
	public DAOUsuarioRepository() {
		
		
		connection = SingleConnectionBanco.getConnection();
		
	}
	
	public void gravarUsuario(ModeloLogin objeto) throws Exception {
	
		
		
			String sql = "INSERT INTO model_login(login, senha, nome, email)VALUES (?, ?, ?, ?)";
			PreparedStatement preparedSql;
			
			preparedSql = connection.prepareStatement(sql);
			preparedSql.setString(1, objeto.getLogin());
			preparedSql.setString(2, objeto.getSenha());
			preparedSql.setString(3, objeto.getNome());
			preparedSql.setString(4, objeto.getEmail());
			preparedSql.execute();
			
			connection.commit();
			
		
		}
		
}

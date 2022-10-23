package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Connection.SingleConnectionBanco;
import Modelo.ModeloLogin;

public class DAOUsuarioRepository {
	
	private Connection connection;
	
	public DAOUsuarioRepository() {
		
		
		connection = SingleConnectionBanco.getConnection();
		
	}
	
	public ModeloLogin gravarUsuario(ModeloLogin objeto) throws Exception {
	
		
		
			String sql = "INSERT INTO model_login(login, senha, nome, email)VALUES (?, ?, ?, ?)";
			PreparedStatement preparedSql;
			
			preparedSql = connection.prepareStatement(sql);
			preparedSql.setString(1, objeto.getLogin());
			preparedSql.setString(2, objeto.getSenha());
			preparedSql.setString(3, objeto.getNome());
			preparedSql.setString(4, objeto.getEmail());
			preparedSql.execute();
			
			connection.commit();
			
			return this.consultaUsuario(objeto.getLogin()); // para ter retorno é obrigatorio ter o metodo de consultar caso contrario  tem de ser void e não modelo login
			
		
		}
	
	public ModeloLogin consultaUsuario(String login) throws Exception{
		
		ModeloLogin modeloLogin = new ModeloLogin();
		
		 String Sql="select * from model_login WHERE upper(login) = upper('"+login+"')";
		 PreparedStatement statement = connection.prepareStatement(Sql);
		 
		 ResultSet resultado = statement.executeQuery();
		 
		 while (resultado.next()) {
			 modeloLogin.setId(resultado.getLong("id"));
			 modeloLogin.setEmail(resultado.getString("email"));
			 modeloLogin.setLogin(resultado.getString("login"));
			 modeloLogin.setNome(resultado.getString("nome"));
			 modeloLogin.setSenha(resultado.getString("senha"));
			
			
		}
		 
		 return modeloLogin;
		
	}
		
}

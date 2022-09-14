package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Connection.SingleConnectionBanco;
import Modelo.ModeloLogin;

public class DAOLoginRepository {

	private Connection connection;
	
	public DAOLoginRepository() {
		
		
		connection = SingleConnectionBanco.getConnection();
	}
	
	public boolean validarAutenticacao(ModeloLogin modeloLogin) throws Exception {
		
		String sql = "select * from model_login where upper(login) = upper( ?) and upper( senha) = upper(?)"; //UPPER --> PARA ACEITAR CARACTER MAIUCULO
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, modeloLogin.getLogin());
		statement.setString(2, modeloLogin.getSenha());
		
		ResultSet resultSet = statement.executeQuery();
		
		if(resultSet.next()) {
			
			return true; /*autenticado*/
		}
		
		return false; /*nao autenticado*/
	}
}

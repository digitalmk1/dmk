package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnectionBanco {

	private static String banco = "jdbc:postgresql://localhost:5432/curso-jsp?autoReconnect=true";
	private static String user = "postgres";
	private static String senha = "1580";
	private static Connection connection = null;
	
	public static Connection getConnection() {
		return connection;
	}
	
	
	static {
		
		conectar();
	}
	
	public SingleConnectionBanco() {
		// TODO Auto-generated constructor stub
		conectar(); // quando tiver uma instacia vai conectar
		
		
		
		
	}
	
	private static void conectar(){
		
		
		
		try {
			
			if(connection == null) {
				Class.forName("org.postgresql.Driver");/*carrega do driver de conexao*/
				connection = DriverManager.getConnection(banco, user, senha);
				connection.setAutoCommit(false); //para não efetuar alterações no banco sem nossa permissão
				
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

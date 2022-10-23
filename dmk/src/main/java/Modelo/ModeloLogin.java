package Modelo;

public class ModeloLogin {
	private Long id;
	private String nome;
	private String email;
	private String login;
	private String Senha;
	
	
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setSenha(String senha) {
		Senha = senha;
	}
	
	public String getSenha() {
		return Senha;
	}
	

}

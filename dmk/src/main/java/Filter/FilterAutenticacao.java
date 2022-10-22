package Filter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import Connection.SingleConnectionBanco;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@WebFilter(urlPatterns = {"/principal/*"})/* intercepta todas as requisições que vierem do projeto ou mapeamento*/
public class FilterAutenticacao extends HttpFilter implements Filter {
       
    private static Connection connection;
	
	
    public FilterAutenticacao() {
       
       
    }

	public void destroy() {
		// Encerra todos os processos quando parar o servidor
		
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	//Intercepta todas as requisições e resposta  no sistema 
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
			throws IOException, ServletException {
		
		try {
			
	
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		
	   String usuarioLogado = (String) session.getAttribute("usuario");
		
		String urlParaAutenticar = req.getServletPath(); /*url que esta sendo acessada*/
		
		/* verificar se o usuario esta logado senao redireciona para tela de login*/
		
		if(usuarioLogado == null && !urlParaAutenticar.equalsIgnoreCase("/principal/ServletLogin"))
				 {
			
			RequestDispatcher redireciona = request.getRequestDispatcher("/index.jsp?url=" + urlParaAutenticar); // na tela de login passar a url
			request.setAttribute("msg","Voce nao esta logado por favor realize o login");
			redireciona.forward(request, response);
			return; /*Para a execução e redireciona para o login*/
				
			
		}else{
			
			
			chain.doFilter(request, response);
			
			connection.commit(); //Deu tudo certo comita no banco as alterações.
			
			}	
		} catch (Exception e) {
			e.printStackTrace();
			
			RequestDispatcher redirecionar = request.getRequestDispatcher("Erro.jsp");
			request.setAttribute("msg", e.getMessage());
			redirecionar.forward(request, response);
			
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		}	

	  //Inicia  os processos quando o servidor sobe o projeto
	public void init(FilterConfig fConfig) throws ServletException {
		
		connection = SingleConnectionBanco.getConnection();
		
	}

}

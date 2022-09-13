package Servlets;

import java.io.IOException;

import Modelo.ModeloLogin;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/principal/servletLogin","/servletLogin"})
public class servletLogin extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public servletLogin() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String url = request.getParameter("url"); //filter autenticacao

		if (login != null && !login.isEmpty() && senha != null & !senha.isEmpty()) {

			ModeloLogin modeloLogin = new ModeloLogin();
			modeloLogin.setLogin(login);
			modeloLogin.setSenha(senha);

			//simulação de login joagando para pagina principal
			if (modeloLogin.getLogin().equalsIgnoreCase("admin") && modeloLogin.getSenha().equalsIgnoreCase("admin")) {

				request.getSession().setAttribute("usuario", modeloLogin.getLogin()); // redirecionando para pagina
																						// principal do sistema apos o login
				if(url == null || url.equals("null")) {
					url = "principal/principal.jsp";
					
					
				}
				RequestDispatcher redirecionar = request.getRequestDispatcher(url);
				redirecionar.forward(request, response);												

			} else {

				RequestDispatcher redirecionar = request.getRequestDispatcher("/index.jsp");
				request.setAttribute("msg", "informe o login corretamente!");
				redirecionar.forward(request, response);
			}
			
		} else {

			RequestDispatcher redirecionar = request.getRequestDispatcher("index.jsp");
			request.setAttribute("msg", " atenção!! usuario e senha tem de ser informados.");
			redirecionar.forward(request, response);

		}

	}
}

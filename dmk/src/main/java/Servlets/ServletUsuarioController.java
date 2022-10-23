package Servlets;

import java.io.IOException;

import Modelo.ModeloLogin;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/ServletUsuarioController")
public class ServletUsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
    public ServletUsuarioController() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
		

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");	
		String nome = request.getParameter("nome");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String email = request.getParameter("email");
		
		ModeloLogin modeloLogin = new ModeloLogin();
		modeloLogin.setId(id != null && !id.isEmpty() ? Long.parseLong(id) : null);
		modeloLogin.setLogin(login);
		modeloLogin.setNome(nome);
		modeloLogin.setSenha(senha);
		modeloLogin.setEmail(email);
		
		RequestDispatcher redireciona = request.getRequestDispatcher("principal/usuario.jsp");
		request.setAttribute("modeloLogin", modeloLogin); //mantem os dados na tela
		redireciona.forward(request, response);
		
	}

}

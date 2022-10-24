package Servlets;

import java.io.IOException;

import Modelo.ModeloLogin;
import dao.DAOUsuarioRepository;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/ServletUsuarioController")
public class ServletUsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private DAOUsuarioRepository daoUsuarioRepository = new DAOUsuarioRepository();

 
    public ServletUsuarioController() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
		

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			String msg ="Operacao realizada com sucesso!!";
			
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
			
			if(daoUsuarioRepository.validaLogin(modeloLogin.getLogin()) && modeloLogin.getId()== null) {
				
				msg = "já existe usuários com o mesmo login cadastrado, informe outro login.";
			} else {
				
				modeloLogin = daoUsuarioRepository.gravarUsuario(modeloLogin);
			}
			
			
			
			
			request.setAttribute("msg", msg);
			request.setAttribute("modeloLogin", modeloLogin);
			request.getRequestDispatcher("principal/usuario.jsp").forward(request, response);
			
		} catch (Exception e) {
           e.printStackTrace();
			
			RequestDispatcher redirecionar = request.getRequestDispatcher("Erro.jsp");
			request.setAttribute("msg", e.getMessage());
			redirecionar.forward(request, response);
		}
		
		
	}

}

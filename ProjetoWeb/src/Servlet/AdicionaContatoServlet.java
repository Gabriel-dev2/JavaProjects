package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Negocio.Contato;
import Repositorio.RepositorioUser;
import Repositorio.ContatoDAO;

/**
 * Servlet implementation class AdicionaContatoServlet
 */
@WebServlet("/adicionaContato")
public class AdicionaContatoServlet extends HttpServlet {
	static ContatoDAO dao = new ContatoDAO();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdicionaContatoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		int idade = Integer.parseInt(request.getParameter("idade"));
		
		
		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setEmail(email);
		contato.setIdade(idade);
		
		dao.adicionaContato(contato);
		
		getServletContext().getRequestDispatcher("/adicionaContato.jsp").forward(request, response);
		
//		response.sendRedirect(request.getContextPath() + "/adicionaContato.jsp");
//		out.println("<html>");
//		out.println("<body>");
//		out.println("Cadastro realizado com sucesso!");
//		out.println("</body>");
//		out.println("</html>");
		
		
	}


}

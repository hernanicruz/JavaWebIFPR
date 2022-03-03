package Servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.FornecedorDAO;
import Model.Fornecedor;

/**
 * Servlet implementation class FornecedorServlet
 */
@WebServlet("/FornecedorServlet")
public class FornecedorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private FornecedorDAO fornecedorDAO = new FornecedorDAO();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FornecedorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String param = request.getParameter("pagina");
		
		System.out.print(param);
		
		
		try {
			request.setAttribute("fornecedores", fornecedorDAO.getFornecedor());
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			request.setAttribute("mensagem", "Erro de Driver | Banco de Dados");
		}
		if(param.equals("list")) {
			System.out.print("entramos no List");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/paginas/mysql.jsp");
			dispatcher.forward(request, response);
		}
		
		if(param.equals("insert")) {
			System.out.print("entramos no Insert");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/paginas/form.jsp");
			dispatcher.forward(request, response);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String nome = request.getParameter("nome");
		String rs = request.getParameter("rs");
		String email = request.getParameter("email");
		String cnpj = request.getParameter("cnpj");
		
		System.out.print(nome);
		System.out.print(rs);
		System.out.print(email);
		System.out.print(cnpj);
		
		Fornecedor fornecedor = new Fornecedor(null, email, nome, rs, cnpj);
		
		try {
			System.out.print("Chamando o método salvar");
			boolean retorno =  FornecedorDAO.salvar(fornecedor);
			request.setAttribute("fornecedores", fornecedorDAO.getFornecedor());
			request.setAttribute("mensagem", "Dados inseridos com sucesso");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/paginas/form.jsp");
			dispatcher.forward(request, response);
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			request.setAttribute("mensagem", "Houve problemas na inserção dos dados");
		}
		
		
	}

}

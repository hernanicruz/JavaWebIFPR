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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		String param = request.getParameter("pagina");
		String acao = request.getParameter("acao");
		String id = request.getParameter("id");
		
		//int param = 1;

		System.out.print("");
		System.out.print(param);
		System.out.print("");
		System.out.print(acao);
		
		
		try {
			if(acao != null && acao.equals("DELETE")) {
				System.out.print("chegou o parâmetro deletar");
				Integer cod  = Integer.parseInt(id);
				fornecedorDAO.excluir(cod);				
			}


			request.setAttribute("fornecedores", fornecedorDAO.getFornecedor());
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			request.setAttribute("mensagem", "Erro de Driver | Banco de Dados");
		}

		if(param.equals("crud") ) {
			System.out.print("Entrou em crud");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/paginas/form.jsp");
			dispatcher.forward(request, response);

		} else {
			
			if(param.equals("list") ) {
				System.out.print("Entrou em List");
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/paginas/mysql.jsp");
				dispatcher.forward(request, response);
			}

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		System.out.print("");
		System.out.print("  Entrou post  ");
		System.out.print("");
		
		String nome = request.getParameter("nome");
		String razaoSocial = request.getParameter("rs");
		String email = request.getParameter("email");		
		String cnpj = request.getParameter("cnpj");
		String update = request.getParameter("update");
				
		
		Fornecedor fornecedor = new Fornecedor(null, email, nome, razaoSocial,cnpj);
		try {
			System.out.print("  Entrou try ");
			boolean retorno = FornecedorDAO.salvar(fornecedor);
			request.setAttribute("mensagem", "Cadastro realizado com sucesso");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/paginas/form.jsp");
			dispatcher.forward(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			request.setAttribute("mensagem", "Erro de Driver | Banco de Dados");
			
			System.out.print("  Entrou catch ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			request.setAttribute("mensagem", "Erro de Driver | Banco de Dados");
		}
		
	}

}

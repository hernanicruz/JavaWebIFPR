package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Fornecedor;

public class FornecedorDAO {
	
	
	public List<Fornecedor> getFornecedor() throws ClassNotFoundException, SQLException{
		
		Connection conexao = ConexaoJDBC.getConexao();
		PreparedStatement ps = conexao.prepareStatement("SELECT id, nome, email, razaosocial, cnpj FROM javaweb.usuarios");
		ResultSet rs = ps.executeQuery();
		List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
		while(rs.next()) {
			fornecedores.add(new Fornecedor(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
			
		}
		
		return fornecedores;
	}

	public static boolean salvar(Fornecedor fornecedor) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Connection conexao = ConexaoJDBC.getConexao();
		
		System.out.print("  Entrou salvar ");
		PreparedStatement ps = conexao.prepareStatement("INSERT INTO javaweb.usuarios (nome,email,razaosocial,cnpj) VALUES (?,?,?,?)");
		System.out.print(ps);
		ps.setString(1, fornecedor.getNome());
		ps.setString(2, fornecedor.getEmail());
		ps.setString(3, fornecedor.getRazaoSocial());
		ps.setString(4,fornecedor.getCnpj());
		return ps.execute();
		
		
	}

	public void excluir(Integer id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Connection conexao = ConexaoJDBC.getConexao();
		
		System.out.print("  Entrou Excluir");
		PreparedStatement ps = conexao.prepareStatement("DELETE FROM javaweb.usuarios WHERE id = ?");
		System.out.print(ps);
		ps.setInt(1, id);
		
		ps.execute();
		
	}
}

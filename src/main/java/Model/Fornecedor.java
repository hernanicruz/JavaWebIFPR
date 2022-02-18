package Model;

public class Fornecedor extends Pessoa {

	private String razaoSocial;
	private String cnpj;
		
	// ALT SHIFT S O - gera construtor 
	public Fornecedor() {
		super();
	}

	public Fornecedor(String razaoSocial, String cnpj) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}
	
	
	
	public Fornecedor(Integer id, String email, String nome, String razaoSocial, String cnpj) {
		super(id, email, nome);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	//ALT SHIST S R - getters e setters
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	


}

package Model;

public class Pessoa {
	
	private Integer id;
	private String email;
	private String nome;
	
	
	public Pessoa() {
		super();
	}


	public Pessoa(Integer id, String email, String nome) {
		super();
		this.id = id;
		this.email = email;
		this.nome = nome;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
		

}

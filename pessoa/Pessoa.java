package pessoa;

public abstract class Pessoa {
	
	protected String id;
	protected String nome;
	protected String telefone;
	protected String email;
	protected Endereco endereco;
	
	public Pessoa(String id, String nome, String telefone, String email, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return ""
				+ "\n id=" + id +
				"\n nome=" + nome +
				"\n telefone=" + telefone +
				"\n email=" + email +
				"\n endereco: "+ endereco;
	}
	
	
	
	

}
